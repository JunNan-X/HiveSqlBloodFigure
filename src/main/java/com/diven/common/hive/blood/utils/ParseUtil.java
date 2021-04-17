package com.diven.common.hive.blood.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.diven.common.hive.blood.model.ColLine;


/**
 * 	解析工具类
 * @author divenwu
 *
 */
public final class ParseUtil {
	private static final Map<Integer, String> hardcodeScriptMap = new HashMap<Integer, String>();
	private static final String SPLIT_DOT = ".";
	private static final String SPLIT_COMMA = ",";
	private static final Map<String, Boolean> REGEX_MULTI_VAR_VALUE = new HashMap<String, Boolean>();
	
	static {
		REGEX_MULTI_VAR_VALUE.put("\\s*=\\s*\"([\\s\\S]*?)\"", false);
		REGEX_MULTI_VAR_VALUE.put("\\s*=\\s*\'([\\s\\S]*?)\'", false);
		REGEX_MULTI_VAR_VALUE.put("\\s*=\\s*(\\w*)", false);
		REGEX_MULTI_VAR_VALUE.put("\\s*=\\s*`([\\s\\S]*?)`", true);
		hardcodeScriptMap.put(400, "^\\s*hive\\d?.*?-e\\s*\"([\\s\\S]*)\"");
	}
	
	private ParseUtil(){}
	
    /**
     * @param table fact.t1
     * @return [fact, t1]
     */
    public static String[] parseDBTable(String table) {
		return table.split("\\" + SPLIT_DOT);
	}
    
    public static String collectionToString(Collection<String> coll){
    	return collectionToString(coll, SPLIT_COMMA, true);
    }

    public static String collectionToString(Collection<String> coll,String split, boolean isCheck){
    	StringBuilder sb = new StringBuilder();
    	if (Check.notEmpty(coll)) {
        	for (String string : coll) {
        		if ((isCheck && Check.notEmpty(string)) || !isCheck) {
        			sb.append(string).append(split);
				}
    		}
    		if (sb.length() > 0) {
    			sb.setLength(sb.length()-split.length());
    		}
		}
		return sb.toString();
    }
    
    public static String uniqMerge(String s1, String s2){
    	Set<String> set = new HashSet<String>();
    	set.add(s1);
    	set.add(s2);
    	return collectionToString(set);
    }
    
	public static String escape(String keyword) {  
	    if (Check.notEmpty(keyword)) {  
	        String[] fbsArr = { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" };  
	        for (String key : fbsArr) {  
	            if (keyword.contains(key)) {  
	                keyword = keyword.replace(key, "\\" + key);  
	            }  
	        }  
	    }  
	    return keyword;  
	}  
    
	public static  Map<String, String> cloneAliaMap(Map<String, String> map) {
    	Map<String, String> map2 = new HashMap<String, String>(map.size());
    	for (Entry<String, String> entry : map.entrySet()) {
    		map2.put(entry.getKey(), entry.getValue());
		}
		return map2;
	}
    
	public static  Map<String, List<ColLine>> cloneSubQueryMap(Map<String, List<ColLine>> map) {
    	Map<String, List<ColLine>> map2 = new HashMap<String, List<ColLine>>(map.size());
    	for (Entry<String, List<ColLine>> entry : map.entrySet()) {
    		List<ColLine> value = entry.getValue();
    		List<ColLine> list = new ArrayList<ColLine>(value.size());
    		for (ColLine colLine : value) {
    			list.add(cloneColLine(colLine));
			}
    		map2.put(entry.getKey(), value);
		}
		return map2;
	}
	
    
	public static  ColLine cloneColLine(ColLine col) {
		return new ColLine(col.getToNameParse(), col.getColCondition(), 
				cloneSet(col.getFromNameSet()), cloneSet(col.getConditionSet()), 
				col.getToTable(), col.getToName());
	}
	
	 
	public static Set<String> cloneSet(Set<String> set){
		Set<String> set2 = new HashSet<String>(set.size());
		for (String string : set) {
			set2.add(string);
		}
		return set2;
	}
	
	public static List<ColLine> cloneList(List<ColLine> list){
		List<ColLine> list2 = new ArrayList<ColLine>(list.size());
		for (ColLine col : list) {
			list2.add(cloneColLine(col));
		}
		return list2;
	}

}
