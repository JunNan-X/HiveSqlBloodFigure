/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.diven.common.hive.ql.parse;

/**
 * BaseSemanticAnalyzer.
 *
 */
public class BaseSemanticAnalyzer {
	private static final int[] multiplier = new int[] {1000, 100, 10, 1};
	
	public static String unescapeIdentifier(String val) {
	    if (val == null) {
	      return null;
	    }
	    if (val.charAt(0) == '`' && val.charAt(val.length() - 1) == '`') {
	      val = val.substring(1, val.length() - 1);
	    }
	    return val;
	  }
	
	public static String getUnescapedName(ASTNode tableOrColumnNode) {
	    return getUnescapedName(tableOrColumnNode, null);
	  }
	
	public static String getUnescapedName(ASTNode tableOrColumnNode, String currentDatabase) {
	    int tokenType = tableOrColumnNode.getToken().getType();
	    if (tokenType == HiveParser.TOK_TABNAME) {
	      // table node
	      if (tableOrColumnNode.getChildCount() == 2) {
	        String dbName = unescapeIdentifier(tableOrColumnNode.getChild(0).getText());
	        String tableName = unescapeIdentifier(tableOrColumnNode.getChild(1).getText());
	        return dbName + "." + tableName;
	      }
	      String tableName = unescapeIdentifier(tableOrColumnNode.getChild(0).getText());
	      if (currentDatabase != null) {
	        return currentDatabase + "." + tableName;
	      }
	      return tableName;
	    } else if (tokenType == HiveParser.StringLiteral) {
	      return unescapeSQLString(tableOrColumnNode.getText());
	    }
	    // column node
	    return unescapeIdentifier(tableOrColumnNode.getText());
	  }
	
	
	public static String unescapeSQLString(String b) {
	    Character enclosure = null;

	    // Some of the strings can be passed in as unicode. For example, the
	    // delimiter can be passed in as \002 - So, we first check if the
	    // string is a unicode number, else go back to the old behavior
	    StringBuilder sb = new StringBuilder(b.length());
	    for (int i = 0; i < b.length(); i++) {

	      char currentChar = b.charAt(i);
	      if (enclosure == null) {
	        if (currentChar == '\'' || b.charAt(i) == '\"') {
	          enclosure = currentChar;
	        }
	        // ignore all other chars outside the enclosure
	        continue;
	      }

	      if (enclosure.equals(currentChar)) {
	        enclosure = null;
	        continue;
	      }

	      if (currentChar == '\\' && (i + 6 < b.length()) && b.charAt(i + 1) == 'u') {
	        int code = 0;
	        int base = i + 2;
	        for (int j = 0; j < 4; j++) {
	          int digit = Character.digit(b.charAt(j + base), 16);
	          code += digit * multiplier[j];
	        }
	        sb.append((char)code);
	        i += 5;
	        continue;
	      }

	      if (currentChar == '\\' && (i + 4 < b.length())) {
	        char i1 = b.charAt(i + 1);
	        char i2 = b.charAt(i + 2);
	        char i3 = b.charAt(i + 3);
	        if ((i1 >= '0' && i1 <= '1') && (i2 >= '0' && i2 <= '7')
	            && (i3 >= '0' && i3 <= '7')) {
	          byte bVal = (byte) ((i3 - '0') + ((i2 - '0') * 8) + ((i1 - '0') * 8 * 8));
	          byte[] bValArr = new byte[1];
	          bValArr[0] = bVal;
	          String tmp = new String(bValArr);
	          sb.append(tmp);
	          i += 3;
	          continue;
	        }
	      }

	      if (currentChar == '\\' && (i + 2 < b.length())) {
	        char n = b.charAt(i + 1);
	        switch (n) {
	        case '0':
	          sb.append("\0");
	          break;
	        case '\'':
	          sb.append("'");
	          break;
	        case '"':
	          sb.append("\"");
	          break;
	        case 'b':
	          sb.append("\b");
	          break;
	        case 'n':
	          sb.append("\n");
	          break;
	        case 'r':
	          sb.append("\r");
	          break;
	        case 't':
	          sb.append("\t");
	          break;
	        case 'Z':
	          sb.append("\u001A");
	          break;
	        case '\\':
	          sb.append("\\");
	          break;
	        // The following 2 lines are exactly what MySQL does TODO: why do we do this?
	        case '%':
	          sb.append("\\%");
	          break;
	        case '_':
	          sb.append("\\_");
	          break;
	        default:
	          sb.append(n);
	        }
	        i++;
	      } else {
	        sb.append(currentChar);
	      }
	    }
	    return sb.toString();
	  }
}
