// $ANTLR 3.4 IdentifiersParser.g 2015-05-14 15:09:53

package com.diven.common.hive.ql.parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveParser_IdentifiersParser extends Parser {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int BITWISEOR=5;
    public static final int BITWISEXOR=6;
    public static final int BigintLiteral=7;
    public static final int ByteLengthLiteral=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int CharSetLiteral=12;
    public static final int CharSetName=13;
    public static final int DIV=14;
    public static final int DIVIDE=15;
    public static final int DOLLAR=16;
    public static final int DOT=17;
    public static final int DecimalLiteral=18;
    public static final int Digit=19;
    public static final int EQUAL=20;
    public static final int EQUAL_NS=21;
    public static final int Exponent=22;
    public static final int GREATERTHAN=23;
    public static final int GREATERTHANOREQUALTO=24;
    public static final int HexDigit=25;
    public static final int Identifier=26;
    public static final int KW_ADD=27;
    public static final int KW_ADMIN=28;
    public static final int KW_AFTER=29;
    public static final int KW_ALL=30;
    public static final int KW_ALTER=31;
    public static final int KW_ANALYZE=32;
    public static final int KW_AND=33;
    public static final int KW_ARCHIVE=34;
    public static final int KW_ARRAY=35;
    public static final int KW_AS=36;
    public static final int KW_ASC=37;
    public static final int KW_AUTHORIZATION=38;
    public static final int KW_BEFORE=39;
    public static final int KW_BETWEEN=40;
    public static final int KW_BIGINT=41;
    public static final int KW_BINARY=42;
    public static final int KW_BOOLEAN=43;
    public static final int KW_BOTH=44;
    public static final int KW_BUCKET=45;
    public static final int KW_BUCKETS=46;
    public static final int KW_BY=47;
    public static final int KW_CASCADE=48;
    public static final int KW_CASE=49;
    public static final int KW_CAST=50;
    public static final int KW_CHANGE=51;
    public static final int KW_CHAR=52;
    public static final int KW_CLUSTER=53;
    public static final int KW_CLUSTERED=54;
    public static final int KW_CLUSTERSTATUS=55;
    public static final int KW_COLLECTION=56;
    public static final int KW_COLUMN=57;
    public static final int KW_COLUMNS=58;
    public static final int KW_COMMENT=59;
    public static final int KW_COMPACT=60;
    public static final int KW_COMPACTIONS=61;
    public static final int KW_COMPUTE=62;
    public static final int KW_CONCATENATE=63;
    public static final int KW_CONF=64;
    public static final int KW_CONTINUE=65;
    public static final int KW_CREATE=66;
    public static final int KW_CROSS=67;
    public static final int KW_CUBE=68;
    public static final int KW_CURRENT=69;
    public static final int KW_CURSOR=70;
    public static final int KW_DATA=71;
    public static final int KW_DATABASE=72;
    public static final int KW_DATABASES=73;
    public static final int KW_DATE=74;
    public static final int KW_DATETIME=75;
    public static final int KW_DBPROPERTIES=76;
    public static final int KW_DECIMAL=77;
    public static final int KW_DEFAULT=78;
    public static final int KW_DEFERRED=79;
    public static final int KW_DEFINED=80;
    public static final int KW_DELETE=81;
    public static final int KW_DELIMITED=82;
    public static final int KW_DEPENDENCY=83;
    public static final int KW_DESC=84;
    public static final int KW_DESCRIBE=85;
    public static final int KW_DIRECTORIES=86;
    public static final int KW_DIRECTORY=87;
    public static final int KW_DISABLE=88;
    public static final int KW_DISTINCT=89;
    public static final int KW_DISTRIBUTE=90;
    public static final int KW_DOUBLE=91;
    public static final int KW_DROP=92;
    public static final int KW_ELEM_TYPE=93;
    public static final int KW_ELSE=94;
    public static final int KW_ENABLE=95;
    public static final int KW_END=96;
    public static final int KW_ESCAPED=97;
    public static final int KW_EXCHANGE=98;
    public static final int KW_EXCLUSIVE=99;
    public static final int KW_EXISTS=100;
    public static final int KW_EXPLAIN=101;
    public static final int KW_EXPORT=102;
    public static final int KW_EXTENDED=103;
    public static final int KW_EXTERNAL=104;
    public static final int KW_FALSE=105;
    public static final int KW_FETCH=106;
    public static final int KW_FIELDS=107;
    public static final int KW_FILE=108;
    public static final int KW_FILEFORMAT=109;
    public static final int KW_FIRST=110;
    public static final int KW_FLOAT=111;
    public static final int KW_FOLLOWING=112;
    public static final int KW_FOR=113;
    public static final int KW_FORMAT=114;
    public static final int KW_FORMATTED=115;
    public static final int KW_FROM=116;
    public static final int KW_FULL=117;
    public static final int KW_FUNCTION=118;
    public static final int KW_FUNCTIONS=119;
    public static final int KW_GRANT=120;
    public static final int KW_GROUP=121;
    public static final int KW_GROUPING=122;
    public static final int KW_HAVING=123;
    public static final int KW_HOLD_DDLTIME=124;
    public static final int KW_IDXPROPERTIES=125;
    public static final int KW_IF=126;
    public static final int KW_IGNORE=127;
    public static final int KW_IMPORT=128;
    public static final int KW_IN=129;
    public static final int KW_INDEX=130;
    public static final int KW_INDEXES=131;
    public static final int KW_INNER=132;
    public static final int KW_INPATH=133;
    public static final int KW_INPUTDRIVER=134;
    public static final int KW_INPUTFORMAT=135;
    public static final int KW_INSERT=136;
    public static final int KW_INT=137;
    public static final int KW_INTERSECT=138;
    public static final int KW_INTO=139;
    public static final int KW_IS=140;
    public static final int KW_ITEMS=141;
    public static final int KW_JAR=142;
    public static final int KW_JOIN=143;
    public static final int KW_KEYS=144;
    public static final int KW_KEY_TYPE=145;
    public static final int KW_LATERAL=146;
    public static final int KW_LEFT=147;
    public static final int KW_LESS=148;
    public static final int KW_LIKE=149;
    public static final int KW_LIMIT=150;
    public static final int KW_LINES=151;
    public static final int KW_LOAD=152;
    public static final int KW_LOCAL=153;
    public static final int KW_LOCATION=154;
    public static final int KW_LOCK=155;
    public static final int KW_LOCKS=156;
    public static final int KW_LOGICAL=157;
    public static final int KW_LONG=158;
    public static final int KW_MACRO=159;
    public static final int KW_MAP=160;
    public static final int KW_MAPJOIN=161;
    public static final int KW_MATERIALIZED=162;
    public static final int KW_MINUS=163;
    public static final int KW_MORE=164;
    public static final int KW_MSCK=165;
    public static final int KW_NONE=166;
    public static final int KW_NOSCAN=167;
    public static final int KW_NOT=168;
    public static final int KW_NO_DROP=169;
    public static final int KW_NULL=170;
    public static final int KW_OF=171;
    public static final int KW_OFFLINE=172;
    public static final int KW_ON=173;
    public static final int KW_OPTION=174;
    public static final int KW_OR=175;
    public static final int KW_ORDER=176;
    public static final int KW_OUT=177;
    public static final int KW_OUTER=178;
    public static final int KW_OUTPUTDRIVER=179;
    public static final int KW_OUTPUTFORMAT=180;
    public static final int KW_OVER=181;
    public static final int KW_OVERWRITE=182;
    public static final int KW_OWNER=183;
    public static final int KW_PARTIALSCAN=184;
    public static final int KW_PARTITION=185;
    public static final int KW_PARTITIONED=186;
    public static final int KW_PARTITIONS=187;
    public static final int KW_PERCENT=188;
    public static final int KW_PLUS=189;
    public static final int KW_PRECEDING=190;
    public static final int KW_PRESERVE=191;
    public static final int KW_PRETTY=192;
    public static final int KW_PRINCIPALS=193;
    public static final int KW_PROCEDURE=194;
    public static final int KW_PROTECTION=195;
    public static final int KW_PURGE=196;
    public static final int KW_RANGE=197;
    public static final int KW_READ=198;
    public static final int KW_READONLY=199;
    public static final int KW_READS=200;
    public static final int KW_REBUILD=201;
    public static final int KW_RECORDREADER=202;
    public static final int KW_RECORDWRITER=203;
    public static final int KW_REDUCE=204;
    public static final int KW_REGEXP=205;
    public static final int KW_RENAME=206;
    public static final int KW_REPAIR=207;
    public static final int KW_REPLACE=208;
    public static final int KW_RESTRICT=209;
    public static final int KW_REVOKE=210;
    public static final int KW_REWRITE=211;
    public static final int KW_RIGHT=212;
    public static final int KW_RLIKE=213;
    public static final int KW_ROLE=214;
    public static final int KW_ROLES=215;
    public static final int KW_ROLLUP=216;
    public static final int KW_ROW=217;
    public static final int KW_ROWS=218;
    public static final int KW_SCHEMA=219;
    public static final int KW_SCHEMAS=220;
    public static final int KW_SELECT=221;
    public static final int KW_SEMI=222;
    public static final int KW_SERDE=223;
    public static final int KW_SERDEPROPERTIES=224;
    public static final int KW_SERVER=225;
    public static final int KW_SET=226;
    public static final int KW_SETS=227;
    public static final int KW_SHARED=228;
    public static final int KW_SHOW=229;
    public static final int KW_SHOW_DATABASE=230;
    public static final int KW_SKEWED=231;
    public static final int KW_SMALLINT=232;
    public static final int KW_SORT=233;
    public static final int KW_SORTED=234;
    public static final int KW_SSL=235;
    public static final int KW_STATISTICS=236;
    public static final int KW_STORED=237;
    public static final int KW_STREAMTABLE=238;
    public static final int KW_STRING=239;
    public static final int KW_STRUCT=240;
    public static final int KW_TABLE=241;
    public static final int KW_TABLES=242;
    public static final int KW_TABLESAMPLE=243;
    public static final int KW_TBLPROPERTIES=244;
    public static final int KW_TEMPORARY=245;
    public static final int KW_TERMINATED=246;
    public static final int KW_THEN=247;
    public static final int KW_TIMESTAMP=248;
    public static final int KW_TINYINT=249;
    public static final int KW_TO=250;
    public static final int KW_TOUCH=251;
    public static final int KW_TRANSACTIONS=252;
    public static final int KW_TRANSFORM=253;
    public static final int KW_TRIGGER=254;
    public static final int KW_TRUE=255;
    public static final int KW_TRUNCATE=256;
    public static final int KW_UNARCHIVE=257;
    public static final int KW_UNBOUNDED=258;
    public static final int KW_UNDO=259;
    public static final int KW_UNION=260;
    public static final int KW_UNIONTYPE=261;
    public static final int KW_UNIQUEJOIN=262;
    public static final int KW_UNLOCK=263;
    public static final int KW_UNSET=264;
    public static final int KW_UNSIGNED=265;
    public static final int KW_UPDATE=266;
    public static final int KW_URI=267;
    public static final int KW_USE=268;
    public static final int KW_USER=269;
    public static final int KW_USING=270;
    public static final int KW_UTC=271;
    public static final int KW_UTCTIMESTAMP=272;
    public static final int KW_VALUES=273;
    public static final int KW_VALUE_TYPE=274;
    public static final int KW_VARCHAR=275;
    public static final int KW_VIEW=276;
    public static final int KW_WHEN=277;
    public static final int KW_WHERE=278;
    public static final int KW_WHILE=279;
    public static final int KW_WINDOW=280;
    public static final int KW_WITH=281;
    public static final int LCURLY=282;
    public static final int LESSTHAN=283;
    public static final int LESSTHANOREQUALTO=284;
    public static final int LPAREN=285;
    public static final int LSQUARE=286;
    public static final int Letter=287;
    public static final int MINUS=288;
    public static final int MOD=289;
    public static final int NOTEQUAL=290;
    public static final int Number=291;
    public static final int PLUS=292;
    public static final int QUESTION=293;
    public static final int QuotedIdentifier=294;
    public static final int RCURLY=295;
    public static final int RPAREN=296;
    public static final int RSQUARE=297;
    public static final int RegexComponent=298;
    public static final int SEMICOLON=299;
    public static final int STAR=300;
    public static final int SmallintLiteral=301;
    public static final int StringLiteral=302;
    public static final int TILDE=303;
    public static final int TinyintLiteral=304;
    public static final int WS=305;
    public static final int TOK_ADMIN_OPTION_FOR=582;
    public static final int TOK_ALIASLIST=583;
    public static final int TOK_ALLCOLREF=584;
    public static final int TOK_ALTERDATABASE_OWNER=585;
    public static final int TOK_ALTERDATABASE_PROPERTIES=586;
    public static final int TOK_ALTERINDEX_PROPERTIES=587;
    public static final int TOK_ALTERINDEX_REBUILD=588;
    public static final int TOK_ALTERTABLE=589;
    public static final int TOK_ALTERTABLE_ADDCOLS=590;
    public static final int TOK_ALTERTABLE_ADDPARTS=591;
    public static final int TOK_ALTERTABLE_ARCHIVE=592;
    public static final int TOK_ALTERTABLE_BUCKETS=593;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=594;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=595;
    public static final int TOK_ALTERTABLE_COMPACT=596;
    public static final int TOK_ALTERTABLE_DROPPARTS=597;
    public static final int TOK_ALTERTABLE_DROPPROPERTIES=598;
    public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=599;
    public static final int TOK_ALTERTABLE_FILEFORMAT=600;
    public static final int TOK_ALTERTABLE_LOCATION=601;
    public static final int TOK_ALTERTABLE_MERGEFILES=602;
    public static final int TOK_ALTERTABLE_PARTCOLTYPE=603;
    public static final int TOK_ALTERTABLE_PROPERTIES=604;
    public static final int TOK_ALTERTABLE_PROTECTMODE=605;
    public static final int TOK_ALTERTABLE_RENAME=606;
    public static final int TOK_ALTERTABLE_RENAMECOL=607;
    public static final int TOK_ALTERTABLE_RENAMEPART=608;
    public static final int TOK_ALTERTABLE_REPLACECOLS=609;
    public static final int TOK_ALTERTABLE_SERDEPROPERTIES=610;
    public static final int TOK_ALTERTABLE_SERIALIZER=611;
    public static final int TOK_ALTERTABLE_SKEWED=612;
    public static final int TOK_ALTERTABLE_SKEWED_LOCATION=613;
    public static final int TOK_ALTERTABLE_TOUCH=614;
    public static final int TOK_ALTERTABLE_UNARCHIVE=615;
    public static final int TOK_ALTERTABLE_UPDATECOLSTATS=616;
    public static final int TOK_ALTERVIEW=617;
    public static final int TOK_ALTERVIEW_ADDPARTS=618;
    public static final int TOK_ALTERVIEW_DROPPARTS=619;
    public static final int TOK_ALTERVIEW_DROPPROPERTIES=620;
    public static final int TOK_ALTERVIEW_PROPERTIES=621;
    public static final int TOK_ALTERVIEW_RENAME=622;
    public static final int TOK_ANALYZE=623;
    public static final int TOK_ANONYMOUS=624;
    public static final int TOK_ARCHIVE=625;
    public static final int TOK_BIGINT=626;
    public static final int TOK_BINARY=627;
    public static final int TOK_BOOLEAN=628;
    public static final int TOK_CASCADE=629;
    public static final int TOK_CHAR=630;
    public static final int TOK_CHARSETLITERAL=631;
    public static final int TOK_CLUSTERBY=632;
    public static final int TOK_COLTYPELIST=633;
    public static final int TOK_COL_NAME=634;
    public static final int TOK_CREATEDATABASE=635;
    public static final int TOK_CREATEFUNCTION=636;
    public static final int TOK_CREATEINDEX=637;
    public static final int TOK_CREATEINDEX_INDEXTBLNAME=638;
    public static final int TOK_CREATEMACRO=639;
    public static final int TOK_CREATEROLE=640;
    public static final int TOK_CREATETABLE=641;
    public static final int TOK_CREATEVIEW=642;
    public static final int TOK_CROSSJOIN=643;
    public static final int TOK_CTE=644;
    public static final int TOK_CUBE_GROUPBY=645;
    public static final int TOK_DATABASECOMMENT=646;
    public static final int TOK_DATABASELOCATION=647;
    public static final int TOK_DATABASEPROPERTIES=648;
    public static final int TOK_DATE=649;
    public static final int TOK_DATELITERAL=650;
    public static final int TOK_DATETIME=651;
    public static final int TOK_DBPROPLIST=652;
    public static final int TOK_DB_TYPE=653;
    public static final int TOK_DECIMAL=654;
    public static final int TOK_DEFERRED_REBUILDINDEX=655;
    public static final int TOK_DELETE_FROM=656;
    public static final int TOK_DESCDATABASE=657;
    public static final int TOK_DESCFUNCTION=658;
    public static final int TOK_DESCTABLE=659;
    public static final int TOK_DESTINATION=660;
    public static final int TOK_DIR=661;
    public static final int TOK_DISABLE=662;
    public static final int TOK_DISTRIBUTEBY=663;
    public static final int TOK_DOUBLE=664;
    public static final int TOK_DROPDATABASE=665;
    public static final int TOK_DROPFUNCTION=666;
    public static final int TOK_DROPINDEX=667;
    public static final int TOK_DROPMACRO=668;
    public static final int TOK_DROPROLE=669;
    public static final int TOK_DROPTABLE=670;
    public static final int TOK_DROPVIEW=671;
    public static final int TOK_ENABLE=672;
    public static final int TOK_EXPLAIN=673;
    public static final int TOK_EXPLAIN_SQ_REWRITE=674;
    public static final int TOK_EXPLIST=675;
    public static final int TOK_EXPORT=676;
    public static final int TOK_FALSE=677;
    public static final int TOK_FILE=678;
    public static final int TOK_FILEFORMAT_GENERIC=679;
    public static final int TOK_FLOAT=680;
    public static final int TOK_FROM=681;
    public static final int TOK_FULLOUTERJOIN=682;
    public static final int TOK_FUNCTION=683;
    public static final int TOK_FUNCTIONDI=684;
    public static final int TOK_FUNCTIONSTAR=685;
    public static final int TOK_GRANT=686;
    public static final int TOK_GRANT_OPTION_FOR=687;
    public static final int TOK_GRANT_ROLE=688;
    public static final int TOK_GRANT_WITH_ADMIN_OPTION=689;
    public static final int TOK_GRANT_WITH_OPTION=690;
    public static final int TOK_GROUP=691;
    public static final int TOK_GROUPBY=692;
    public static final int TOK_GROUPING_SETS=693;
    public static final int TOK_GROUPING_SETS_EXPRESSION=694;
    public static final int TOK_HAVING=695;
    public static final int TOK_HINT=696;
    public static final int TOK_HINTARGLIST=697;
    public static final int TOK_HINTLIST=698;
    public static final int TOK_HOLD_DDLTIME=699;
    public static final int TOK_IFEXISTS=700;
    public static final int TOK_IFNOTEXISTS=701;
    public static final int TOK_IGNOREPROTECTION=702;
    public static final int TOK_IMPORT=703;
    public static final int TOK_INDEXCOMMENT=704;
    public static final int TOK_INDEXPROPERTIES=705;
    public static final int TOK_INDEXPROPLIST=706;
    public static final int TOK_INSERT=707;
    public static final int TOK_INSERT_INTO=708;
    public static final int TOK_INT=709;
    public static final int TOK_ISNOTNULL=710;
    public static final int TOK_ISNULL=711;
    public static final int TOK_JAR=712;
    public static final int TOK_JOIN=713;
    public static final int TOK_LATERAL_VIEW=714;
    public static final int TOK_LATERAL_VIEW_OUTER=715;
    public static final int TOK_LEFTOUTERJOIN=716;
    public static final int TOK_LEFTSEMIJOIN=717;
    public static final int TOK_LENGTH=718;
    public static final int TOK_LIKETABLE=719;
    public static final int TOK_LIMIT=720;
    public static final int TOK_LIST=721;
    public static final int TOK_LOAD=722;
    public static final int TOK_LOCAL_DIR=723;
    public static final int TOK_LOCKDB=724;
    public static final int TOK_LOCKTABLE=725;
    public static final int TOK_MAP=726;
    public static final int TOK_MAPJOIN=727;
    public static final int TOK_MSCK=728;
    public static final int TOK_NOT_CLUSTERED=729;
    public static final int TOK_NOT_SORTED=730;
    public static final int TOK_NO_DROP=731;
    public static final int TOK_NULL=732;
    public static final int TOK_OFFLINE=733;
    public static final int TOK_OP_ADD=734;
    public static final int TOK_OP_AND=735;
    public static final int TOK_OP_BITAND=736;
    public static final int TOK_OP_BITNOT=737;
    public static final int TOK_OP_BITOR=738;
    public static final int TOK_OP_BITXOR=739;
    public static final int TOK_OP_DIV=740;
    public static final int TOK_OP_EQ=741;
    public static final int TOK_OP_GE=742;
    public static final int TOK_OP_GT=743;
    public static final int TOK_OP_LE=744;
    public static final int TOK_OP_LIKE=745;
    public static final int TOK_OP_LT=746;
    public static final int TOK_OP_MOD=747;
    public static final int TOK_OP_MUL=748;
    public static final int TOK_OP_NE=749;
    public static final int TOK_OP_NOT=750;
    public static final int TOK_OP_OR=751;
    public static final int TOK_OP_SUB=752;
    public static final int TOK_ORDERBY=753;
    public static final int TOK_ORREPLACE=754;
    public static final int TOK_PARTITIONINGSPEC=755;
    public static final int TOK_PARTITIONLOCATION=756;
    public static final int TOK_PARTSPEC=757;
    public static final int TOK_PARTVAL=758;
    public static final int TOK_PERCENT=759;
    public static final int TOK_PRINCIPAL_NAME=760;
    public static final int TOK_PRIVILEGE=761;
    public static final int TOK_PRIVILEGE_LIST=762;
    public static final int TOK_PRIV_ALL=763;
    public static final int TOK_PRIV_ALTER_DATA=764;
    public static final int TOK_PRIV_ALTER_METADATA=765;
    public static final int TOK_PRIV_CREATE=766;
    public static final int TOK_PRIV_DELETE=767;
    public static final int TOK_PRIV_DROP=768;
    public static final int TOK_PRIV_INDEX=769;
    public static final int TOK_PRIV_INSERT=770;
    public static final int TOK_PRIV_LOCK=771;
    public static final int TOK_PRIV_OBJECT=772;
    public static final int TOK_PRIV_OBJECT_COL=773;
    public static final int TOK_PRIV_SELECT=774;
    public static final int TOK_PRIV_SHOW_DATABASE=775;
    public static final int TOK_PTBLFUNCTION=776;
    public static final int TOK_QUERY=777;
    public static final int TOK_READONLY=778;
    public static final int TOK_RECORDREADER=779;
    public static final int TOK_RECORDWRITER=780;
    public static final int TOK_RESOURCE_ALL=781;
    public static final int TOK_RESOURCE_LIST=782;
    public static final int TOK_RESOURCE_URI=783;
    public static final int TOK_RESTRICT=784;
    public static final int TOK_REVOKE=785;
    public static final int TOK_REVOKE_ROLE=786;
    public static final int TOK_RIGHTOUTERJOIN=787;
    public static final int TOK_ROLE=788;
    public static final int TOK_ROLLUP_GROUPBY=789;
    public static final int TOK_ROWCOUNT=790;
    public static final int TOK_SELECT=791;
    public static final int TOK_SELECTDI=792;
    public static final int TOK_SELEXPR=793;
    public static final int TOK_SERDE=794;
    public static final int TOK_SERDENAME=795;
    public static final int TOK_SERDEPROPS=796;
    public static final int TOK_SERVER_TYPE=797;
    public static final int TOK_SET_COLUMNS_CLAUSE=798;
    public static final int TOK_SHOWCOLUMNS=799;
    public static final int TOK_SHOWCONF=800;
    public static final int TOK_SHOWDATABASES=801;
    public static final int TOK_SHOWDBLOCKS=802;
    public static final int TOK_SHOWFUNCTIONS=803;
    public static final int TOK_SHOWINDEXES=804;
    public static final int TOK_SHOWLOCKS=805;
    public static final int TOK_SHOWPARTITIONS=806;
    public static final int TOK_SHOWTABLES=807;
    public static final int TOK_SHOW_COMPACTIONS=808;
    public static final int TOK_SHOW_CREATETABLE=809;
    public static final int TOK_SHOW_GRANT=810;
    public static final int TOK_SHOW_ROLES=811;
    public static final int TOK_SHOW_ROLE_GRANT=812;
    public static final int TOK_SHOW_ROLE_PRINCIPALS=813;
    public static final int TOK_SHOW_SET_ROLE=814;
    public static final int TOK_SHOW_TABLESTATUS=815;
    public static final int TOK_SHOW_TBLPROPERTIES=816;
    public static final int TOK_SHOW_TRANSACTIONS=817;
    public static final int TOK_SKEWED_LOCATIONS=818;
    public static final int TOK_SKEWED_LOCATION_LIST=819;
    public static final int TOK_SKEWED_LOCATION_MAP=820;
    public static final int TOK_SMALLINT=821;
    public static final int TOK_SORTBY=822;
    public static final int TOK_STORAGEHANDLER=823;
    public static final int TOK_STOREDASDIRS=824;
    public static final int TOK_STREAMTABLE=825;
    public static final int TOK_STRING=826;
    public static final int TOK_STRINGLITERALSEQUENCE=827;
    public static final int TOK_STRUCT=828;
    public static final int TOK_SUBQUERY=829;
    public static final int TOK_SUBQUERY_EXPR=830;
    public static final int TOK_SUBQUERY_OP=831;
    public static final int TOK_SUBQUERY_OP_NOTEXISTS=832;
    public static final int TOK_SUBQUERY_OP_NOTIN=833;
    public static final int TOK_SWITCHDATABASE=834;
    public static final int TOK_TAB=835;
    public static final int TOK_TABALIAS=836;
    public static final int TOK_TABCOL=837;
    public static final int TOK_TABCOLLIST=838;
    public static final int TOK_TABCOLNAME=839;
    public static final int TOK_TABCOLVALUE=840;
    public static final int TOK_TABCOLVALUES=841;
    public static final int TOK_TABCOLVALUE_PAIR=842;
    public static final int TOK_TABLEBUCKETSAMPLE=843;
    public static final int TOK_TABLECOMMENT=844;
    public static final int TOK_TABLEFILEFORMAT=845;
    public static final int TOK_TABLELOCATION=846;
    public static final int TOK_TABLEPARTCOLS=847;
    public static final int TOK_TABLEPROPERTIES=848;
    public static final int TOK_TABLEPROPERTY=849;
    public static final int TOK_TABLEPROPLIST=850;
    public static final int TOK_TABLEROWFORMAT=851;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=852;
    public static final int TOK_TABLEROWFORMATFIELD=853;
    public static final int TOK_TABLEROWFORMATLINES=854;
    public static final int TOK_TABLEROWFORMATMAPKEYS=855;
    public static final int TOK_TABLEROWFORMATNULL=856;
    public static final int TOK_TABLESERIALIZER=857;
    public static final int TOK_TABLESKEWED=858;
    public static final int TOK_TABLESPLITSAMPLE=859;
    public static final int TOK_TABLE_OR_COL=860;
    public static final int TOK_TABLE_PARTITION=861;
    public static final int TOK_TABLE_TYPE=862;
    public static final int TOK_TABNAME=863;
    public static final int TOK_TABREF=864;
    public static final int TOK_TABSORTCOLNAMEASC=865;
    public static final int TOK_TABSORTCOLNAMEDESC=866;
    public static final int TOK_TABSRC=867;
    public static final int TOK_TABTYPE=868;
    public static final int TOK_TEMPORARY=869;
    public static final int TOK_TIMESTAMP=870;
    public static final int TOK_TIMESTAMPLITERAL=871;
    public static final int TOK_TINYINT=872;
    public static final int TOK_TMP_FILE=873;
    public static final int TOK_TRANSFORM=874;
    public static final int TOK_TRUE=875;
    public static final int TOK_TRUNCATETABLE=876;
    public static final int TOK_UNION=877;
    public static final int TOK_UNIONTYPE=878;
    public static final int TOK_UNIQUEJOIN=879;
    public static final int TOK_UNLOCKDB=880;
    public static final int TOK_UNLOCKTABLE=881;
    public static final int TOK_UPDATE_TABLE=882;
    public static final int TOK_URI_TYPE=883;
    public static final int TOK_USER=884;
    public static final int TOK_USERSCRIPTCOLNAMES=885;
    public static final int TOK_USERSCRIPTCOLSCHEMA=886;
    public static final int TOK_VALUES_TABLE=887;
    public static final int TOK_VALUE_ROW=888;
    public static final int TOK_VARCHAR=889;
    public static final int TOK_VIEWPARTCOLS=890;
    public static final int TOK_VIRTUAL_TABLE=891;
    public static final int TOK_VIRTUAL_TABREF=892;
    public static final int TOK_WHERE=893;
    public static final int TOK_WINDOWDEF=894;
    public static final int TOK_WINDOWRANGE=895;
    public static final int TOK_WINDOWSPEC=896;
    public static final int TOK_WINDOWVALUES=897;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public HiveParser gHiveParser;
    public HiveParser gParent;


    public HiveParser_IdentifiersParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_IdentifiersParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
        super(input, state);
        this.gHiveParser = gHiveParser;
        gParent = gHiveParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HiveParser.tokenNames; }
    public String getGrammarFileName() { return "IdentifiersParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        throw re;
      }
      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.errors.add(new ParseError(gParent, e, tokenNames));
      }


    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByClause"
    // IdentifiersParser.g:49:1: groupByClause : KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) ;
    public final HiveParser_IdentifiersParser.groupByClause_return groupByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByClause_return retval = new HiveParser_IdentifiersParser.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token rollup=null;
        Token cube=null;
        Token sets=null;
        Token KW_GROUP1=null;
        Token KW_BY2=null;
        Token COMMA4=null;
        Token KW_ROLLUP6=null;
        Token KW_CUBE7=null;
        Token KW_SETS8=null;
        Token LPAREN9=null;
        Token COMMA11=null;
        Token RPAREN13=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression3 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression5 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression10 =null;

        HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression12 =null;


        CommonTree rollup_tree=null;
        CommonTree cube_tree=null;
        CommonTree sets_tree=null;
        CommonTree KW_GROUP1_tree=null;
        CommonTree KW_BY2_tree=null;
        CommonTree COMMA4_tree=null;
        CommonTree KW_ROLLUP6_tree=null;
        CommonTree KW_CUBE7_tree=null;
        CommonTree KW_SETS8_tree=null;
        CommonTree LPAREN9_tree=null;
        CommonTree COMMA11_tree=null;
        CommonTree RPAREN13_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_GROUPING=new RewriteRuleTokenStream(adaptor,"token KW_GROUPING");
        RewriteRuleTokenStream stream_KW_CUBE=new RewriteRuleTokenStream(adaptor,"token KW_CUBE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_ROLLUP=new RewriteRuleTokenStream(adaptor,"token KW_ROLLUP");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleTokenStream stream_KW_SETS=new RewriteRuleTokenStream(adaptor,"token KW_SETS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_groupingSetExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupingSetExpression");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
         gParent.pushMsg("group by clause", state); 
        try {
            // IdentifiersParser.g:52:5: ( KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) )
            // IdentifiersParser.g:53:5: KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            {
            KW_GROUP1=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_groupByClause72); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_GROUP.add(KW_GROUP1);


            KW_BY2=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_groupByClause74); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY2);


            pushFollow(FOLLOW_groupByExpression_in_groupByClause80);
            groupByExpression3=groupByExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression3.getTree());

            // IdentifiersParser.g:55:5: ( COMMA groupByExpression )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // IdentifiersParser.g:55:7: COMMA groupByExpression
            	    {
            	    COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause88); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA4);


            	    pushFollow(FOLLOW_groupByExpression_in_groupByClause90);
            	    groupByExpression5=groupByExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // IdentifiersParser.g:56:5: ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )?
            int alt2=3;
            switch ( input.LA(1) ) {
                case KW_WITH:
                    {
                    switch ( input.LA(2) ) {
                        case KW_ROLLUP:
                            {
                            alt2=1;
                            }
                            break;
                        case KW_CUBE:
                            {
                            alt2=2;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    {
                    // IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
                    // IdentifiersParser.g:56:7: rollup= KW_WITH KW_ROLLUP
                    {
                    rollup=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(rollup);


                    KW_ROLLUP6=(Token)match(input,KW_ROLLUP,FOLLOW_KW_ROLLUP_in_groupByClause105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROLLUP.add(KW_ROLLUP6);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    {
                    // IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
                    // IdentifiersParser.g:56:36: cube= KW_WITH KW_CUBE
                    {
                    cube=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(cube);


                    KW_CUBE7=(Token)match(input,KW_CUBE,FOLLOW_KW_CUBE_in_groupByClause115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CUBE.add(KW_CUBE7);


                    }


                    }
                    break;

            }


            // IdentifiersParser.g:57:5: (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case KW_GROUPING:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // IdentifiersParser.g:57:6: sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN
                    {
                    sets=(Token)match(input,KW_GROUPING,FOLLOW_KW_GROUPING_in_groupByClause128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_GROUPING.add(sets);


                    KW_SETS8=(Token)match(input,KW_SETS,FOLLOW_KW_SETS_in_groupByClause130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SETS.add(KW_SETS8);


                    LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupByClause137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN9);


                    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause139);
                    groupingSetExpression10=groupingSetExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression10.getTree());

                    // IdentifiersParser.g:58:34: ( COMMA groupingSetExpression )*
                    loop3:
                    do {
                        int alt3=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // IdentifiersParser.g:58:36: COMMA groupingSetExpression
                    	    {
                    	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


                    	    pushFollow(FOLLOW_groupingSetExpression_in_groupByClause145);
                    	    groupingSetExpression12=groupingSetExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupByClause150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN13);


                    }
                    break;

            }


            // AST REWRITE
            // elements: groupByExpression, groupByExpression, groupingSetExpression, groupByExpression, groupByExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:5: -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
            if (rollup != null) {
                // IdentifiersParser.g:59:26: ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_ROLLUP_GROUPBY, "TOK_ROLLUP_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 60:5: -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
            if (cube != null) {
                // IdentifiersParser.g:60:24: ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CUBE_GROUPBY, "TOK_CUBE_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 61:5: -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
            if (sets != null) {
                // IdentifiersParser.g:61:24: ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPING_SETS, "TOK_GROUPING_SETS")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                if ( !(stream_groupingSetExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupingSetExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupingSetExpression.nextTree());

                }
                stream_groupingSetExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 62:5: -> ^( TOK_GROUPBY ( groupByExpression )+ )
            {
                // IdentifiersParser.g:62:8: ^( TOK_GROUPBY ( groupByExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_GROUPBY, "TOK_GROUPBY")
                , root_1);

                if ( !(stream_groupByExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupByExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                }
                stream_groupByExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByClause"


    public static class groupingSetExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupingSetExpression"
    // IdentifiersParser.g:65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );
    public final HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupingSetExpression_return retval = new HiveParser_IdentifiersParser.groupingSetExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN15=null;
        Token COMMA17=null;
        Token RPAREN19=null;
        Token LPAREN20=null;
        Token RPAREN21=null;
        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression14 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression16 =null;

        HiveParser_IdentifiersParser.groupByExpression_return groupByExpression18 =null;


        CommonTree LPAREN15_tree=null;
        CommonTree COMMA17_tree=null;
        CommonTree RPAREN19_tree=null;
        CommonTree LPAREN20_tree=null;
        CommonTree RPAREN21_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");
        gParent.pushMsg("grouping set expression", state); 
        try {
            // IdentifiersParser.g:68:4: ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // IdentifiersParser.g:69:4: groupByExpression
                    {
                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression244);
                    groupByExpression14=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression14.getTree());

                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:4: -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                    {
                        // IdentifiersParser.g:70:7: ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:72:4: LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);


                    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression271);
                    groupByExpression16=groupByExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression16.getTree());

                    // IdentifiersParser.g:73:22: ( COMMA groupByExpression )*
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // IdentifiersParser.g:73:23: COMMA groupByExpression
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupingSetExpression274); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA17);


                    	    pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression276);
                    	    groupByExpression18=groupByExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);


                    // AST REWRITE
                    // elements: groupByExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:4: -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                    {
                        // IdentifiersParser.g:75:7: ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        if ( !(stream_groupByExpression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_groupByExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_groupByExpression.nextTree());

                        }
                        stream_groupByExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:77:4: LPAREN RPAREN
                    {
                    LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN20);


                    RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN21);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:4: -> ^( TOK_GROUPING_SETS_EXPRESSION )
                    {
                        // IdentifiersParser.g:79:7: ^( TOK_GROUPING_SETS_EXPRESSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupingSetExpression"


    public static class groupByExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByExpression"
    // IdentifiersParser.g:83:1: groupByExpression : expression ;
    public final HiveParser_IdentifiersParser.groupByExpression_return groupByExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.groupByExpression_return retval = new HiveParser_IdentifiersParser.groupByExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression22 =null;



         gParent.pushMsg("group by expression", state); 
        try {
            // IdentifiersParser.g:86:5: ( expression )
            // IdentifiersParser.g:87:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_groupByExpression350);
            expression22=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByExpression"


    public static class havingClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // IdentifiersParser.g:90:1: havingClause : KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) ;
    public final HiveParser_IdentifiersParser.havingClause_return havingClause() throws RecognitionException {
        HiveParser_IdentifiersParser.havingClause_return retval = new HiveParser_IdentifiersParser.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_HAVING23=null;
        HiveParser_IdentifiersParser.havingCondition_return havingCondition24 =null;


        CommonTree KW_HAVING23_tree=null;
        RewriteRuleTokenStream stream_KW_HAVING=new RewriteRuleTokenStream(adaptor,"token KW_HAVING");
        RewriteRuleSubtreeStream stream_havingCondition=new RewriteRuleSubtreeStream(adaptor,"rule havingCondition");
         gParent.pushMsg("having clause", state); 
        try {
            // IdentifiersParser.g:93:5: ( KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) )
            // IdentifiersParser.g:94:5: KW_HAVING havingCondition
            {
            KW_HAVING23=(Token)match(input,KW_HAVING,FOLLOW_KW_HAVING_in_havingClause381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_HAVING.add(KW_HAVING23);


            pushFollow(FOLLOW_havingCondition_in_havingClause383);
            havingCondition24=havingCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_havingCondition.add(havingCondition24.getTree());

            // AST REWRITE
            // elements: havingCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:31: -> ^( TOK_HAVING havingCondition )
            {
                // IdentifiersParser.g:94:34: ^( TOK_HAVING havingCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_HAVING, "TOK_HAVING")
                , root_1);

                adaptor.addChild(root_1, stream_havingCondition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class havingCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingCondition"
    // IdentifiersParser.g:97:1: havingCondition : expression ;
    public final HiveParser_IdentifiersParser.havingCondition_return havingCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.havingCondition_return retval = new HiveParser_IdentifiersParser.havingCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression25 =null;



         gParent.pushMsg("having condition", state); 
        try {
            // IdentifiersParser.g:100:5: ( expression )
            // IdentifiersParser.g:101:5: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_havingCondition422);
            expression25=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingCondition"


    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // IdentifiersParser.g:105:1: orderByClause : KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) ;
    public final HiveParser_IdentifiersParser.orderByClause_return orderByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.orderByClause_return retval = new HiveParser_IdentifiersParser.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_ORDER26=null;
        Token KW_BY27=null;
        Token COMMA29=null;
        HiveParser.columnRefOrder_return columnRefOrder28 =null;

        HiveParser.columnRefOrder_return columnRefOrder30 =null;


        CommonTree KW_ORDER26_tree=null;
        CommonTree KW_BY27_tree=null;
        CommonTree COMMA29_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.pushMsg("order by clause", state); 
        try {
            // IdentifiersParser.g:108:5: ( KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) )
            // IdentifiersParser.g:109:5: KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )*
            {
            KW_ORDER26=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER26);


            KW_BY27=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY27);


            pushFollow(FOLLOW_columnRefOrder_in_orderByClause458);
            columnRefOrder28=gHiveParser.columnRefOrder();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder28.getTree());

            // IdentifiersParser.g:109:35: ( COMMA columnRefOrder )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // IdentifiersParser.g:109:37: COMMA columnRefOrder
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause462); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);


            	    pushFollow(FOLLOW_columnRefOrder_in_orderByClause464);
            	    columnRefOrder30=gHiveParser.columnRefOrder();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder30.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: columnRefOrder
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:60: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
            {
                // IdentifiersParser.g:109:63: ^( TOK_ORDERBY ( columnRefOrder )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY")
                , root_1);

                if ( !(stream_columnRefOrder.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_columnRefOrder.hasNext() ) {
                    adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                }
                stream_columnRefOrder.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderByClause"


    public static class clusterByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clusterByClause"
    // IdentifiersParser.g:112:1: clusterByClause : ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.clusterByClause_return clusterByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.clusterByClause_return retval = new HiveParser_IdentifiersParser.clusterByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CLUSTER31=null;
        Token KW_BY32=null;
        Token LPAREN33=null;
        Token COMMA35=null;
        Token RPAREN37=null;
        Token KW_CLUSTER38=null;
        Token KW_BY39=null;
        Token COMMA41=null;
        HiveParser_IdentifiersParser.expression_return expression34 =null;

        HiveParser_IdentifiersParser.expression_return expression36 =null;

        HiveParser_IdentifiersParser.expression_return expression40 =null;

        HiveParser_IdentifiersParser.expression_return expression42 =null;


        CommonTree KW_CLUSTER31_tree=null;
        CommonTree KW_BY32_tree=null;
        CommonTree LPAREN33_tree=null;
        CommonTree COMMA35_tree=null;
        CommonTree RPAREN37_tree=null;
        CommonTree KW_CLUSTER38_tree=null;
        CommonTree KW_BY39_tree=null;
        CommonTree COMMA41_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CLUSTER=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("cluster by clause", state); 
        try {
            // IdentifiersParser.g:115:5: ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case KW_CLUSTER:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt10=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt10=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // IdentifiersParser.g:116:5: KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_CLUSTER31=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER31);


                    KW_BY32=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY32);


                    LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_clusterByClause514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);


                    pushFollow(FOLLOW_expression_in_clusterByClause516);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());

                    // IdentifiersParser.g:117:23: ( COMMA expression )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // IdentifiersParser.g:117:24: COMMA expression
                    	    {
                    	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause519); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA35);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause521);
                    	    expression36=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_clusterByClause525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN37);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:50: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:117:53: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:119:5: KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_CLUSTER38=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER38);


                    KW_BY39=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY39);


                    pushFollow(FOLLOW_expression_in_clusterByClause554);
                    expression40=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression40.getTree());

                    // IdentifiersParser.g:121:5: ( ( COMMA )=> COMMA expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) && (synpred1_IdentifiersParser())) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // IdentifiersParser.g:121:7: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause566); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA41);


                    	    pushFollow(FOLLOW_expression_in_clusterByClause568);
                    	    expression42=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 121:36: -> ^( TOK_CLUSTERBY ( expression )+ )
                    {
                        // IdentifiersParser.g:121:39: ^( TOK_CLUSTERBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clusterByClause"


    public static class partitionByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionByClause"
    // IdentifiersParser.g:124:1: partitionByClause : ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.partitionByClause_return partitionByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionByClause_return retval = new HiveParser_IdentifiersParser.partitionByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION43=null;
        Token KW_BY44=null;
        Token LPAREN45=null;
        Token COMMA47=null;
        Token RPAREN49=null;
        Token KW_PARTITION50=null;
        Token KW_BY51=null;
        Token COMMA53=null;
        HiveParser_IdentifiersParser.expression_return expression46 =null;

        HiveParser_IdentifiersParser.expression_return expression48 =null;

        HiveParser_IdentifiersParser.expression_return expression52 =null;

        HiveParser_IdentifiersParser.expression_return expression54 =null;


        CommonTree KW_PARTITION43_tree=null;
        CommonTree KW_BY44_tree=null;
        CommonTree LPAREN45_tree=null;
        CommonTree COMMA47_tree=null;
        CommonTree RPAREN49_tree=null;
        CommonTree KW_PARTITION50_tree=null;
        CommonTree KW_BY51_tree=null;
        CommonTree COMMA53_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("partition by clause", state); 
        try {
            // IdentifiersParser.g:127:5: ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case KW_PARTITION:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt13=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // IdentifiersParser.g:128:5: KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_PARTITION43=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION43);


                    KW_BY44=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY44);


                    LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionByClause620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN45);


                    pushFollow(FOLLOW_expression_in_partitionByClause622);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression46.getTree());

                    // IdentifiersParser.g:129:23: ( COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt11=1;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // IdentifiersParser.g:129:24: COMMA expression
                    	    {
                    	    COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause625); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA47);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause627);
                    	    expression48=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    RPAREN49=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionByClause631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN49);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:129:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:131:5: KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_PARTITION50=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION50);


                    KW_BY51=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY51);


                    pushFollow(FOLLOW_expression_in_partitionByClause660);
                    expression52=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());

                    // IdentifiersParser.g:132:16: ( ( COMMA )=> COMMA expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) && (synpred2_IdentifiersParser())) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // IdentifiersParser.g:132:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause668); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA53);


                    	    pushFollow(FOLLOW_expression_in_partitionByClause670);
                    	    expression54=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 132:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:132:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionByClause"


    public static class distributeByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distributeByClause"
    // IdentifiersParser.g:135:1: distributeByClause : ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
    public final HiveParser_IdentifiersParser.distributeByClause_return distributeByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.distributeByClause_return retval = new HiveParser_IdentifiersParser.distributeByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DISTRIBUTE55=null;
        Token KW_BY56=null;
        Token LPAREN57=null;
        Token COMMA59=null;
        Token RPAREN61=null;
        Token KW_DISTRIBUTE62=null;
        Token KW_BY63=null;
        Token COMMA65=null;
        HiveParser_IdentifiersParser.expression_return expression58 =null;

        HiveParser_IdentifiersParser.expression_return expression60 =null;

        HiveParser_IdentifiersParser.expression_return expression64 =null;

        HiveParser_IdentifiersParser.expression_return expression66 =null;


        CommonTree KW_DISTRIBUTE55_tree=null;
        CommonTree KW_BY56_tree=null;
        CommonTree LPAREN57_tree=null;
        CommonTree COMMA59_tree=null;
        CommonTree RPAREN61_tree=null;
        CommonTree KW_DISTRIBUTE62_tree=null;
        CommonTree KW_BY63_tree=null;
        CommonTree COMMA65_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTRIBUTE=new RewriteRuleTokenStream(adaptor,"token KW_DISTRIBUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("distribute by clause", state); 
        try {
            // IdentifiersParser.g:138:5: ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case KW_DISTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt16=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt16=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // IdentifiersParser.g:139:5: KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN
                    {
                    KW_DISTRIBUTE55=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE55);


                    KW_BY56=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY56);


                    LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_distributeByClause720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN57);


                    pushFollow(FOLLOW_expression_in_distributeByClause722);
                    expression58=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression58.getTree());

                    // IdentifiersParser.g:140:23: ( COMMA expression )*
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // IdentifiersParser.g:140:24: COMMA expression
                    	    {
                    	    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause725); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause727);
                    	    expression60=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_distributeByClause731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN61);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 140:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:140:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:142:5: KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )*
                    {
                    KW_DISTRIBUTE62=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE62);


                    KW_BY63=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY63);


                    pushFollow(FOLLOW_expression_in_distributeByClause760);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());

                    // IdentifiersParser.g:143:16: ( ( COMMA )=> COMMA expression )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) && (synpred3_IdentifiersParser())) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // IdentifiersParser.g:143:17: ( COMMA )=> COMMA expression
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause768); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA65);


                    	    pushFollow(FOLLOW_expression_in_distributeByClause770);
                    	    expression66=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
                    {
                        // IdentifiersParser.g:143:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY")
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "distributeByClause"


    public static class sortByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sortByClause"
    // IdentifiersParser.g:146:1: sortByClause : ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) );
    public final HiveParser_IdentifiersParser.sortByClause_return sortByClause() throws RecognitionException {
        HiveParser_IdentifiersParser.sortByClause_return retval = new HiveParser_IdentifiersParser.sortByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_SORT67=null;
        Token KW_BY68=null;
        Token LPAREN69=null;
        Token COMMA71=null;
        Token RPAREN73=null;
        Token KW_SORT74=null;
        Token KW_BY75=null;
        Token COMMA77=null;
        HiveParser.columnRefOrder_return columnRefOrder70 =null;

        HiveParser.columnRefOrder_return columnRefOrder72 =null;

        HiveParser.columnRefOrder_return columnRefOrder76 =null;

        HiveParser.columnRefOrder_return columnRefOrder78 =null;


        CommonTree KW_SORT67_tree=null;
        CommonTree KW_BY68_tree=null;
        CommonTree LPAREN69_tree=null;
        CommonTree COMMA71_tree=null;
        CommonTree RPAREN73_tree=null;
        CommonTree KW_SORT74_tree=null;
        CommonTree KW_BY75_tree=null;
        CommonTree COMMA77_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_SORT=new RewriteRuleTokenStream(adaptor,"token KW_SORT");
        RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
        RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");
         gParent.pushMsg("sort by clause", state); 
        try {
            // IdentifiersParser.g:149:5: ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case KW_SORT:
                {
                switch ( input.LA(2) ) {
                case KW_BY:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        alt19=1;
                        }
                        break;
                    case BigintLiteral:
                    case CharSetName:
                    case DecimalLiteral:
                    case Identifier:
                    case KW_ADD:
                    case KW_ADMIN:
                    case KW_AFTER:
                    case KW_ALL:
                    case KW_ALTER:
                    case KW_ANALYZE:
                    case KW_ARCHIVE:
                    case KW_ARRAY:
                    case KW_AS:
                    case KW_ASC:
                    case KW_AUTHORIZATION:
                    case KW_BEFORE:
                    case KW_BETWEEN:
                    case KW_BIGINT:
                    case KW_BINARY:
                    case KW_BOOLEAN:
                    case KW_BOTH:
                    case KW_BUCKET:
                    case KW_BUCKETS:
                    case KW_BY:
                    case KW_CASCADE:
                    case KW_CASE:
                    case KW_CAST:
                    case KW_CHANGE:
                    case KW_CLUSTER:
                    case KW_CLUSTERED:
                    case KW_CLUSTERSTATUS:
                    case KW_COLLECTION:
                    case KW_COLUMNS:
                    case KW_COMMENT:
                    case KW_COMPACT:
                    case KW_COMPACTIONS:
                    case KW_COMPUTE:
                    case KW_CONCATENATE:
                    case KW_CONTINUE:
                    case KW_CREATE:
                    case KW_CUBE:
                    case KW_CURSOR:
                    case KW_DATA:
                    case KW_DATABASES:
                    case KW_DATE:
                    case KW_DATETIME:
                    case KW_DBPROPERTIES:
                    case KW_DECIMAL:
                    case KW_DEFAULT:
                    case KW_DEFERRED:
                    case KW_DEFINED:
                    case KW_DELETE:
                    case KW_DELIMITED:
                    case KW_DEPENDENCY:
                    case KW_DESC:
                    case KW_DESCRIBE:
                    case KW_DIRECTORIES:
                    case KW_DIRECTORY:
                    case KW_DISABLE:
                    case KW_DISTRIBUTE:
                    case KW_DOUBLE:
                    case KW_DROP:
                    case KW_ELEM_TYPE:
                    case KW_ENABLE:
                    case KW_ESCAPED:
                    case KW_EXCLUSIVE:
                    case KW_EXISTS:
                    case KW_EXPLAIN:
                    case KW_EXPORT:
                    case KW_EXTERNAL:
                    case KW_FALSE:
                    case KW_FETCH:
                    case KW_FIELDS:
                    case KW_FILE:
                    case KW_FILEFORMAT:
                    case KW_FIRST:
                    case KW_FLOAT:
                    case KW_FOR:
                    case KW_FORMAT:
                    case KW_FORMATTED:
                    case KW_FULL:
                    case KW_FUNCTIONS:
                    case KW_GRANT:
                    case KW_GROUP:
                    case KW_GROUPING:
                    case KW_HOLD_DDLTIME:
                    case KW_IDXPROPERTIES:
                    case KW_IF:
                    case KW_IGNORE:
                    case KW_IMPORT:
                    case KW_IN:
                    case KW_INDEX:
                    case KW_INDEXES:
                    case KW_INNER:
                    case KW_INPATH:
                    case KW_INPUTDRIVER:
                    case KW_INPUTFORMAT:
                    case KW_INSERT:
                    case KW_INT:
                    case KW_INTERSECT:
                    case KW_INTO:
                    case KW_IS:
                    case KW_ITEMS:
                    case KW_JAR:
                    case KW_KEYS:
                    case KW_KEY_TYPE:
                    case KW_LATERAL:
                    case KW_LEFT:
                    case KW_LIKE:
                    case KW_LIMIT:
                    case KW_LINES:
                    case KW_LOAD:
                    case KW_LOCAL:
                    case KW_LOCATION:
                    case KW_LOCK:
                    case KW_LOCKS:
                    case KW_LOGICAL:
                    case KW_LONG:
                    case KW_MAP:
                    case KW_MAPJOIN:
                    case KW_MATERIALIZED:
                    case KW_MINUS:
                    case KW_MSCK:
                    case KW_NONE:
                    case KW_NOSCAN:
                    case KW_NOT:
                    case KW_NO_DROP:
                    case KW_NULL:
                    case KW_OF:
                    case KW_OFFLINE:
                    case KW_OPTION:
                    case KW_ORDER:
                    case KW_OUT:
                    case KW_OUTER:
                    case KW_OUTPUTDRIVER:
                    case KW_OUTPUTFORMAT:
                    case KW_OVERWRITE:
                    case KW_OWNER:
                    case KW_PARTITION:
                    case KW_PARTITIONED:
                    case KW_PARTITIONS:
                    case KW_PERCENT:
                    case KW_PLUS:
                    case KW_PRETTY:
                    case KW_PRINCIPALS:
                    case KW_PROCEDURE:
                    case KW_PROTECTION:
                    case KW_PURGE:
                    case KW_RANGE:
                    case KW_READ:
                    case KW_READONLY:
                    case KW_READS:
                    case KW_REBUILD:
                    case KW_RECORDREADER:
                    case KW_RECORDWRITER:
                    case KW_REGEXP:
                    case KW_RENAME:
                    case KW_REPAIR:
                    case KW_REPLACE:
                    case KW_RESTRICT:
                    case KW_REVOKE:
                    case KW_REWRITE:
                    case KW_RIGHT:
                    case KW_RLIKE:
                    case KW_ROLE:
                    case KW_ROLES:
                    case KW_ROLLUP:
                    case KW_ROW:
                    case KW_ROWS:
                    case KW_SCHEMA:
                    case KW_SCHEMAS:
                    case KW_SEMI:
                    case KW_SERDE:
                    case KW_SERDEPROPERTIES:
                    case KW_SERVER:
                    case KW_SET:
                    case KW_SETS:
                    case KW_SHARED:
                    case KW_SHOW:
                    case KW_SHOW_DATABASE:
                    case KW_SKEWED:
                    case KW_SMALLINT:
                    case KW_SORT:
                    case KW_SORTED:
                    case KW_SSL:
                    case KW_STATISTICS:
                    case KW_STORED:
                    case KW_STREAMTABLE:
                    case KW_STRING:
                    case KW_STRUCT:
                    case KW_TABLE:
                    case KW_TABLES:
                    case KW_TBLPROPERTIES:
                    case KW_TEMPORARY:
                    case KW_TERMINATED:
                    case KW_TIMESTAMP:
                    case KW_TINYINT:
                    case KW_TO:
                    case KW_TOUCH:
                    case KW_TRANSACTIONS:
                    case KW_TRIGGER:
                    case KW_TRUE:
                    case KW_TRUNCATE:
                    case KW_UNARCHIVE:
                    case KW_UNDO:
                    case KW_UNION:
                    case KW_UNIONTYPE:
                    case KW_UNLOCK:
                    case KW_UNSET:
                    case KW_UNSIGNED:
                    case KW_UPDATE:
                    case KW_URI:
                    case KW_USE:
                    case KW_USER:
                    case KW_USING:
                    case KW_UTC:
                    case KW_UTCTIMESTAMP:
                    case KW_VALUES:
                    case KW_VALUE_TYPE:
                    case KW_VIEW:
                    case KW_WHILE:
                    case KW_WITH:
                    case MINUS:
                    case Number:
                    case PLUS:
                    case SmallintLiteral:
                    case StringLiteral:
                    case TILDE:
                    case TinyintLiteral:
                        {
                        alt19=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // IdentifiersParser.g:150:5: KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
                    {
                    KW_SORT67=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT67);


                    KW_BY68=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY68);


                    LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sortByClause820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause822);
                    columnRefOrder70=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder70.getTree());

                    // IdentifiersParser.g:152:5: ( COMMA columnRefOrder )*
                    loop17:
                    do {
                        int alt17=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt17=1;
                            }
                            break;

                        }

                        switch (alt17) {
                    	case 1 :
                    	    // IdentifiersParser.g:152:7: COMMA columnRefOrder
                    	    {
                    	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause830); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause832);
                    	    columnRefOrder72=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sortByClause836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:37: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:152:40: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:154:5: KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )*
                    {
                    KW_SORT74=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT74);


                    KW_BY75=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY75);


                    pushFollow(FOLLOW_columnRefOrder_in_sortByClause865);
                    columnRefOrder76=gHiveParser.columnRefOrder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder76.getTree());

                    // IdentifiersParser.g:156:5: ( ( COMMA )=> COMMA columnRefOrder )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) && (synpred4_IdentifiersParser())) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // IdentifiersParser.g:156:7: ( COMMA )=> COMMA columnRefOrder
                    	    {
                    	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause878); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);


                    	    pushFollow(FOLLOW_columnRefOrder_in_sortByClause880);
                    	    columnRefOrder78=gHiveParser.columnRefOrder();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: columnRefOrder
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 156:40: -> ^( TOK_SORTBY ( columnRefOrder )+ )
                    {
                        // IdentifiersParser.g:156:43: ^( TOK_SORTBY ( columnRefOrder )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY")
                        , root_1);

                        if ( !(stream_columnRefOrder.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_columnRefOrder.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnRefOrder.nextTree());

                        }
                        stream_columnRefOrder.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sortByClause"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // IdentifiersParser.g:160:1: function : functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) ;
    public final HiveParser_IdentifiersParser.function_return function() throws RecognitionException {
        HiveParser_IdentifiersParser.function_return retval = new HiveParser_IdentifiersParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token star=null;
        Token dist=null;
        Token LPAREN80=null;
        Token COMMA82=null;
        Token RPAREN84=null;
        Token KW_OVER85=null;
        HiveParser_SelectClauseParser.window_specification_return ws =null;

        HiveParser_IdentifiersParser.functionName_return functionName79 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression81 =null;

        HiveParser_SelectClauseParser.selectExpression_return selectExpression83 =null;


        CommonTree star_tree=null;
        CommonTree dist_tree=null;
        CommonTree LPAREN80_tree=null;
        CommonTree COMMA82_tree=null;
        CommonTree RPAREN84_tree=null;
        CommonTree KW_OVER85_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_KW_OVER=new RewriteRuleTokenStream(adaptor,"token KW_OVER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
        RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
         gParent.pushMsg("function specification", state); 
        try {
            // IdentifiersParser.g:163:5: ( functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) )
            // IdentifiersParser.g:164:5: functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )?
            {
            pushFollow(FOLLOW_functionName_in_function923);
            functionName79=functionName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionName.add(functionName79.getTree());

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);


            // IdentifiersParser.g:166:7: ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? )
            int alt23=2;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt23=1;
                }
                break;
            case BigintLiteral:
            case CharSetName:
            case DecimalLiteral:
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CASE:
            case KW_CAST:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTINCT:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IF:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAP:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NOT:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
            case LPAREN:
            case MINUS:
            case Number:
            case PLUS:
            case RPAREN:
            case SmallintLiteral:
            case StringLiteral:
            case TILDE:
            case TinyintLiteral:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // IdentifiersParser.g:167:9: (star= STAR )
                    {
                    // IdentifiersParser.g:167:9: (star= STAR )
                    // IdentifiersParser.g:167:10: star= STAR
                    {
                    star=(Token)match(input,STAR,FOLLOW_STAR_in_function950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(star);


                    }


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:168:11: (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )?
                    {
                    // IdentifiersParser.g:168:11: (dist= KW_DISTINCT )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case KW_DISTINCT:
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // IdentifiersParser.g:168:12: dist= KW_DISTINCT
                            {
                            dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_function966); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);


                            }
                            break;

                    }


                    // IdentifiersParser.g:168:31: ( selectExpression ( COMMA selectExpression )* )?
                    int alt22=2;
                    switch ( input.LA(1) ) {
                        case BigintLiteral:
                        case CharSetName:
                        case DecimalLiteral:
                        case Identifier:
                        case KW_ADD:
                        case KW_ADMIN:
                        case KW_AFTER:
                        case KW_ALL:
                        case KW_ALTER:
                        case KW_ANALYZE:
                        case KW_ARCHIVE:
                        case KW_ARRAY:
                        case KW_AS:
                        case KW_ASC:
                        case KW_AUTHORIZATION:
                        case KW_BEFORE:
                        case KW_BETWEEN:
                        case KW_BIGINT:
                        case KW_BINARY:
                        case KW_BOOLEAN:
                        case KW_BOTH:
                        case KW_BUCKET:
                        case KW_BUCKETS:
                        case KW_BY:
                        case KW_CASCADE:
                        case KW_CASE:
                        case KW_CAST:
                        case KW_CHANGE:
                        case KW_CLUSTER:
                        case KW_CLUSTERED:
                        case KW_CLUSTERSTATUS:
                        case KW_COLLECTION:
                        case KW_COLUMNS:
                        case KW_COMMENT:
                        case KW_COMPACT:
                        case KW_COMPACTIONS:
                        case KW_COMPUTE:
                        case KW_CONCATENATE:
                        case KW_CONTINUE:
                        case KW_CREATE:
                        case KW_CUBE:
                        case KW_CURSOR:
                        case KW_DATA:
                        case KW_DATABASES:
                        case KW_DATE:
                        case KW_DATETIME:
                        case KW_DBPROPERTIES:
                        case KW_DECIMAL:
                        case KW_DEFAULT:
                        case KW_DEFERRED:
                        case KW_DEFINED:
                        case KW_DELETE:
                        case KW_DELIMITED:
                        case KW_DEPENDENCY:
                        case KW_DESC:
                        case KW_DESCRIBE:
                        case KW_DIRECTORIES:
                        case KW_DIRECTORY:
                        case KW_DISABLE:
                        case KW_DISTRIBUTE:
                        case KW_DOUBLE:
                        case KW_DROP:
                        case KW_ELEM_TYPE:
                        case KW_ENABLE:
                        case KW_ESCAPED:
                        case KW_EXCLUSIVE:
                        case KW_EXISTS:
                        case KW_EXPLAIN:
                        case KW_EXPORT:
                        case KW_EXTERNAL:
                        case KW_FALSE:
                        case KW_FETCH:
                        case KW_FIELDS:
                        case KW_FILE:
                        case KW_FILEFORMAT:
                        case KW_FIRST:
                        case KW_FLOAT:
                        case KW_FOR:
                        case KW_FORMAT:
                        case KW_FORMATTED:
                        case KW_FULL:
                        case KW_FUNCTIONS:
                        case KW_GRANT:
                        case KW_GROUP:
                        case KW_GROUPING:
                        case KW_HOLD_DDLTIME:
                        case KW_IDXPROPERTIES:
                        case KW_IF:
                        case KW_IGNORE:
                        case KW_IMPORT:
                        case KW_IN:
                        case KW_INDEX:
                        case KW_INDEXES:
                        case KW_INNER:
                        case KW_INPATH:
                        case KW_INPUTDRIVER:
                        case KW_INPUTFORMAT:
                        case KW_INSERT:
                        case KW_INT:
                        case KW_INTERSECT:
                        case KW_INTO:
                        case KW_IS:
                        case KW_ITEMS:
                        case KW_JAR:
                        case KW_KEYS:
                        case KW_KEY_TYPE:
                        case KW_LATERAL:
                        case KW_LEFT:
                        case KW_LIKE:
                        case KW_LIMIT:
                        case KW_LINES:
                        case KW_LOAD:
                        case KW_LOCAL:
                        case KW_LOCATION:
                        case KW_LOCK:
                        case KW_LOCKS:
                        case KW_LOGICAL:
                        case KW_LONG:
                        case KW_MAP:
                        case KW_MAPJOIN:
                        case KW_MATERIALIZED:
                        case KW_MINUS:
                        case KW_MSCK:
                        case KW_NONE:
                        case KW_NOSCAN:
                        case KW_NOT:
                        case KW_NO_DROP:
                        case KW_NULL:
                        case KW_OF:
                        case KW_OFFLINE:
                        case KW_OPTION:
                        case KW_ORDER:
                        case KW_OUT:
                        case KW_OUTER:
                        case KW_OUTPUTDRIVER:
                        case KW_OUTPUTFORMAT:
                        case KW_OVERWRITE:
                        case KW_OWNER:
                        case KW_PARTITION:
                        case KW_PARTITIONED:
                        case KW_PARTITIONS:
                        case KW_PERCENT:
                        case KW_PLUS:
                        case KW_PRETTY:
                        case KW_PRINCIPALS:
                        case KW_PROCEDURE:
                        case KW_PROTECTION:
                        case KW_PURGE:
                        case KW_RANGE:
                        case KW_READ:
                        case KW_READONLY:
                        case KW_READS:
                        case KW_REBUILD:
                        case KW_RECORDREADER:
                        case KW_RECORDWRITER:
                        case KW_REGEXP:
                        case KW_RENAME:
                        case KW_REPAIR:
                        case KW_REPLACE:
                        case KW_RESTRICT:
                        case KW_REVOKE:
                        case KW_REWRITE:
                        case KW_RIGHT:
                        case KW_RLIKE:
                        case KW_ROLE:
                        case KW_ROLES:
                        case KW_ROLLUP:
                        case KW_ROW:
                        case KW_ROWS:
                        case KW_SCHEMA:
                        case KW_SCHEMAS:
                        case KW_SEMI:
                        case KW_SERDE:
                        case KW_SERDEPROPERTIES:
                        case KW_SERVER:
                        case KW_SET:
                        case KW_SETS:
                        case KW_SHARED:
                        case KW_SHOW:
                        case KW_SHOW_DATABASE:
                        case KW_SKEWED:
                        case KW_SMALLINT:
                        case KW_SORT:
                        case KW_SORTED:
                        case KW_SSL:
                        case KW_STATISTICS:
                        case KW_STORED:
                        case KW_STREAMTABLE:
                        case KW_STRING:
                        case KW_STRUCT:
                        case KW_TABLE:
                        case KW_TABLES:
                        case KW_TBLPROPERTIES:
                        case KW_TEMPORARY:
                        case KW_TERMINATED:
                        case KW_TIMESTAMP:
                        case KW_TINYINT:
                        case KW_TO:
                        case KW_TOUCH:
                        case KW_TRANSACTIONS:
                        case KW_TRIGGER:
                        case KW_TRUE:
                        case KW_TRUNCATE:
                        case KW_UNARCHIVE:
                        case KW_UNDO:
                        case KW_UNION:
                        case KW_UNIONTYPE:
                        case KW_UNLOCK:
                        case KW_UNSET:
                        case KW_UNSIGNED:
                        case KW_UPDATE:
                        case KW_URI:
                        case KW_USE:
                        case KW_USER:
                        case KW_USING:
                        case KW_UTC:
                        case KW_UTCTIMESTAMP:
                        case KW_VALUES:
                        case KW_VALUE_TYPE:
                        case KW_VIEW:
                        case KW_WHILE:
                        case KW_WITH:
                        case LPAREN:
                        case MINUS:
                        case Number:
                        case PLUS:
                        case STAR:
                        case SmallintLiteral:
                        case StringLiteral:
                        case TILDE:
                        case TinyintLiteral:
                            {
                            alt22=1;
                            }
                            break;
                    }

                    switch (alt22) {
                        case 1 :
                            // IdentifiersParser.g:168:32: selectExpression ( COMMA selectExpression )*
                            {
                            pushFollow(FOLLOW_selectExpression_in_function971);
                            selectExpression81=gHiveParser.selectExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression81.getTree());

                            // IdentifiersParser.g:168:49: ( COMMA selectExpression )*
                            loop21:
                            do {
                                int alt21=2;
                                switch ( input.LA(1) ) {
                                case COMMA:
                                    {
                                    alt21=1;
                                    }
                                    break;

                                }

                                switch (alt21) {
                            	case 1 :
                            	    // IdentifiersParser.g:168:50: COMMA selectExpression
                            	    {
                            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_function974); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);


                            	    pushFollow(FOLLOW_selectExpression_in_function976);
                            	    selectExpression83=gHiveParser.selectExpression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression83.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN84);


            // IdentifiersParser.g:170:12: ( KW_OVER ws= window_specification )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // IdentifiersParser.g:170:13: KW_OVER ws= window_specification
                    {
                    KW_OVER85=(Token)match(input,KW_OVER,FOLLOW_KW_OVER_in_function997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OVER.add(KW_OVER85);


                    pushFollow(FOLLOW_window_specification_in_function1001);
                    ws=gHiveParser.window_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_window_specification.add(ws.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: selectExpression, ws, functionName, ws, selectExpression, functionName, functionName
            // token labels: 
            // rule labels: retval, ws
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws",ws!=null?ws.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:12: -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
            if (star != null) {
                // IdentifiersParser.g:171:32: ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONSTAR, "TOK_FUNCTIONSTAR")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:171:65: ( $ws)?
                if ( stream_ws.hasNext() ) {
                    adaptor.addChild(root_1, stream_ws.nextTree());

                }
                stream_ws.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 172:12: -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
            if (dist == null) {
                // IdentifiersParser.g:172:32: ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:172:60: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

                // IdentifiersParser.g:172:82: ( $ws)?
                if ( stream_ws.hasNext() ) {
                    adaptor.addChild(root_1, stream_ws.nextTree());

                }
                stream_ws.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 173:29: -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
            {
                // IdentifiersParser.g:173:32: ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTIONDI, "TOK_FUNCTIONDI")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // IdentifiersParser.g:173:62: ( ( selectExpression )+ )?
                if ( stream_selectExpression.hasNext() ) {
                    if ( !(stream_selectExpression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_selectExpression.hasNext() ) {
                        adaptor.addChild(root_1, stream_selectExpression.nextTree());

                    }
                    stream_selectExpression.reset();

                }
                stream_selectExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class functionName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionName"
    // IdentifiersParser.g:176:1: functionName : ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | functionIdentifier );
    public final HiveParser_IdentifiersParser.functionName_return functionName() throws RecognitionException {
        HiveParser_IdentifiersParser.functionName_return retval = new HiveParser_IdentifiersParser.functionName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_IF86=null;
        Token KW_ARRAY87=null;
        Token KW_MAP88=null;
        Token KW_STRUCT89=null;
        Token KW_UNIONTYPE90=null;
        HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier91 =null;


        CommonTree KW_IF86_tree=null;
        CommonTree KW_ARRAY87_tree=null;
        CommonTree KW_MAP88_tree=null;
        CommonTree KW_STRUCT89_tree=null;
        CommonTree KW_UNIONTYPE90_tree=null;

         gParent.pushMsg("function name", state); 
        try {
            // IdentifiersParser.g:179:5: ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | functionIdentifier )
            int alt25=6;
            switch ( input.LA(1) ) {
            case KW_IF:
                {
                alt25=1;
                }
                break;
            case KW_ARRAY:
                {
                alt25=2;
                }
                break;
            case KW_MAP:
                {
                alt25=3;
                }
                break;
            case KW_STRUCT:
                {
                alt25=4;
                }
                break;
            case KW_UNIONTYPE:
                {
                alt25=5;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // IdentifiersParser.g:180:5: KW_IF
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_IF86=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_functionName1133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IF86_tree = 
                    (CommonTree)adaptor.create(KW_IF86)
                    ;
                    adaptor.addChild(root_0, KW_IF86_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:180:13: KW_ARRAY
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_ARRAY87=(Token)match(input,KW_ARRAY,FOLLOW_KW_ARRAY_in_functionName1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ARRAY87_tree = 
                    (CommonTree)adaptor.create(KW_ARRAY87)
                    ;
                    adaptor.addChild(root_0, KW_ARRAY87_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:180:24: KW_MAP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_MAP88=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_functionName1141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_MAP88_tree = 
                    (CommonTree)adaptor.create(KW_MAP88)
                    ;
                    adaptor.addChild(root_0, KW_MAP88_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:180:33: KW_STRUCT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_STRUCT89=(Token)match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_functionName1145); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STRUCT89_tree = 
                    (CommonTree)adaptor.create(KW_STRUCT89)
                    ;
                    adaptor.addChild(root_0, KW_STRUCT89_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:180:45: KW_UNIONTYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_UNIONTYPE90=(Token)match(input,KW_UNIONTYPE,FOLLOW_KW_UNIONTYPE_in_functionName1149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_UNIONTYPE90_tree = 
                    (CommonTree)adaptor.create(KW_UNIONTYPE90)
                    ;
                    adaptor.addChild(root_0, KW_UNIONTYPE90_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:180:60: functionIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionIdentifier_in_functionName1153);
                    functionIdentifier91=functionIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionIdentifier91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionName"


    public static class castExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpression"
    // IdentifiersParser.g:183:1: castExpression : KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) ;
    public final HiveParser_IdentifiersParser.castExpression_return castExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.castExpression_return retval = new HiveParser_IdentifiersParser.castExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CAST92=null;
        Token LPAREN93=null;
        Token KW_AS95=null;
        Token RPAREN97=null;
        HiveParser_IdentifiersParser.expression_return expression94 =null;

        HiveParser.primitiveType_return primitiveType96 =null;


        CommonTree KW_CAST92_tree=null;
        CommonTree LPAREN93_tree=null;
        CommonTree KW_AS95_tree=null;
        CommonTree RPAREN97_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_CAST=new RewriteRuleTokenStream(adaptor,"token KW_CAST");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
         gParent.pushMsg("cast expression", state); 
        try {
            // IdentifiersParser.g:186:5: ( KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) )
            // IdentifiersParser.g:187:5: KW_CAST LPAREN expression KW_AS primitiveType RPAREN
            {
            KW_CAST92=(Token)match(input,KW_CAST,FOLLOW_KW_CAST_in_castExpression1184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CAST.add(KW_CAST92);


            LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression1190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);


            pushFollow(FOLLOW_expression_in_castExpression1202);
            expression94=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression94.getTree());

            KW_AS95=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_castExpression1214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS95);


            pushFollow(FOLLOW_primitiveType_in_castExpression1226);
            primitiveType96=gHiveParser.primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType96.getTree());

            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression1232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);


            // AST REWRITE
            // elements: primitiveType, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:12: -> ^( TOK_FUNCTION primitiveType expression )
            {
                // IdentifiersParser.g:192:15: ^( TOK_FUNCTION primitiveType expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_primitiveType.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "castExpression"


    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseExpression"
    // IdentifiersParser.g:195:1: caseExpression : KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) ;
    public final HiveParser_IdentifiersParser.caseExpression_return caseExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.caseExpression_return retval = new HiveParser_IdentifiersParser.caseExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE98=null;
        Token KW_WHEN100=null;
        Token KW_THEN102=null;
        Token KW_ELSE104=null;
        Token KW_END106=null;
        HiveParser_IdentifiersParser.expression_return expression99 =null;

        HiveParser_IdentifiersParser.expression_return expression101 =null;

        HiveParser_IdentifiersParser.expression_return expression103 =null;

        HiveParser_IdentifiersParser.expression_return expression105 =null;


        CommonTree KW_CASE98_tree=null;
        CommonTree KW_WHEN100_tree=null;
        CommonTree KW_THEN102_tree=null;
        CommonTree KW_ELSE104_tree=null;
        CommonTree KW_END106_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("case expression", state); 
        try {
            // IdentifiersParser.g:198:5: ( KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) )
            // IdentifiersParser.g:199:5: KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE98=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_caseExpression1273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE98);


            pushFollow(FOLLOW_expression_in_caseExpression1275);
            expression99=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());

            // IdentifiersParser.g:200:5: ( KW_WHEN expression KW_THEN expression )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case KW_WHEN:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // IdentifiersParser.g:200:6: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN100=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_caseExpression1282); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN100);


            	    pushFollow(FOLLOW_expression_in_caseExpression1284);
            	    expression101=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());

            	    KW_THEN102=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_caseExpression1286); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN102);


            	    pushFollow(FOLLOW_expression_in_caseExpression1288);
            	    expression103=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            // IdentifiersParser.g:201:5: ( KW_ELSE expression )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case KW_ELSE:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // IdentifiersParser.g:201:6: KW_ELSE expression
                    {
                    KW_ELSE104=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_caseExpression1297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE104);


                    pushFollow(FOLLOW_expression_in_caseExpression1299);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

                    }
                    break;

            }


            KW_END106=(Token)match(input,KW_END,FOLLOW_KW_END_in_caseExpression1307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END106);


            // AST REWRITE
            // elements: KW_CASE, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 202:12: -> ^( TOK_FUNCTION KW_CASE ( expression )* )
            {
                // IdentifiersParser.g:202:15: ^( TOK_FUNCTION KW_CASE ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_CASE.nextNode()
                );

                // IdentifiersParser.g:202:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "caseExpression"


    public static class whenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenExpression"
    // IdentifiersParser.g:205:1: whenExpression : KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) ;
    public final HiveParser_IdentifiersParser.whenExpression_return whenExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.whenExpression_return retval = new HiveParser_IdentifiersParser.whenExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_CASE107=null;
        Token KW_WHEN108=null;
        Token KW_THEN110=null;
        Token KW_ELSE112=null;
        Token KW_END114=null;
        HiveParser_IdentifiersParser.expression_return expression109 =null;

        HiveParser_IdentifiersParser.expression_return expression111 =null;

        HiveParser_IdentifiersParser.expression_return expression113 =null;


        CommonTree KW_CASE107_tree=null;
        CommonTree KW_WHEN108_tree=null;
        CommonTree KW_THEN110_tree=null;
        CommonTree KW_ELSE112_tree=null;
        CommonTree KW_END114_tree=null;
        RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
        RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
        RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("case expression", state); 
        try {
            // IdentifiersParser.g:208:5: ( KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) )
            // IdentifiersParser.g:209:5: KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
            {
            KW_CASE107=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_whenExpression1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE107);


            // IdentifiersParser.g:210:6: ( KW_WHEN expression KW_THEN expression )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case KW_WHEN:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // IdentifiersParser.g:210:8: KW_WHEN expression KW_THEN expression
            	    {
            	    KW_WHEN108=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_whenExpression1358); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN108);


            	    pushFollow(FOLLOW_expression_in_whenExpression1360);
            	    expression109=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression109.getTree());

            	    KW_THEN110=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_whenExpression1362); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN110);


            	    pushFollow(FOLLOW_expression_in_whenExpression1364);
            	    expression111=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression111.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            // IdentifiersParser.g:211:5: ( KW_ELSE expression )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case KW_ELSE:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // IdentifiersParser.g:211:6: KW_ELSE expression
                    {
                    KW_ELSE112=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_whenExpression1373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE112);


                    pushFollow(FOLLOW_expression_in_whenExpression1375);
                    expression113=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression113.getTree());

                    }
                    break;

            }


            KW_END114=(Token)match(input,KW_END,FOLLOW_KW_END_in_whenExpression1383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_END.add(KW_END114);


            // AST REWRITE
            // elements: expression, KW_WHEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 212:12: -> ^( TOK_FUNCTION KW_WHEN ( expression )* )
            {
                // IdentifiersParser.g:212:15: ^( TOK_FUNCTION KW_WHEN ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_WHEN.nextNode()
                );

                // IdentifiersParser.g:212:38: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whenExpression"


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // IdentifiersParser.g:215:1: constant : ( Number | dateLiteral | timestampLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );
    public final HiveParser_IdentifiersParser.constant_return constant() throws RecognitionException {
        HiveParser_IdentifiersParser.constant_return retval = new HiveParser_IdentifiersParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Number115=null;
        Token StringLiteral118=null;
        Token BigintLiteral120=null;
        Token SmallintLiteral121=null;
        Token TinyintLiteral122=null;
        Token DecimalLiteral123=null;
        HiveParser_IdentifiersParser.dateLiteral_return dateLiteral116 =null;

        HiveParser_IdentifiersParser.timestampLiteral_return timestampLiteral117 =null;

        HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence119 =null;

        HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral124 =null;

        HiveParser_IdentifiersParser.booleanValue_return booleanValue125 =null;


        CommonTree Number115_tree=null;
        CommonTree StringLiteral118_tree=null;
        CommonTree BigintLiteral120_tree=null;
        CommonTree SmallintLiteral121_tree=null;
        CommonTree TinyintLiteral122_tree=null;
        CommonTree DecimalLiteral123_tree=null;

         gParent.pushMsg("constant", state); 
        try {
            // IdentifiersParser.g:218:5: ( Number | dateLiteral | timestampLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue )
            int alt30=11;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // IdentifiersParser.g:219:5: Number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Number115=(Token)match(input,Number,FOLLOW_Number_in_constant1425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Number115_tree = 
                    (CommonTree)adaptor.create(Number115)
                    ;
                    adaptor.addChild(root_0, Number115_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:220:7: dateLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dateLiteral_in_constant1433);
                    dateLiteral116=dateLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral116.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:221:7: timestampLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestampLiteral_in_constant1441);
                    timestampLiteral117=timestampLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestampLiteral117.getTree());

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:222:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral118=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constant1449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral118_tree = 
                    (CommonTree)adaptor.create(StringLiteral118)
                    ;
                    adaptor.addChild(root_0, StringLiteral118_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:223:7: stringLiteralSequence
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringLiteralSequence_in_constant1457);
                    stringLiteralSequence119=stringLiteralSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralSequence119.getTree());

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:224:7: BigintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BigintLiteral120=(Token)match(input,BigintLiteral,FOLLOW_BigintLiteral_in_constant1465); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BigintLiteral120_tree = 
                    (CommonTree)adaptor.create(BigintLiteral120)
                    ;
                    adaptor.addChild(root_0, BigintLiteral120_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:225:7: SmallintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SmallintLiteral121=(Token)match(input,SmallintLiteral,FOLLOW_SmallintLiteral_in_constant1473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SmallintLiteral121_tree = 
                    (CommonTree)adaptor.create(SmallintLiteral121)
                    ;
                    adaptor.addChild(root_0, SmallintLiteral121_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:226:7: TinyintLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TinyintLiteral122=(Token)match(input,TinyintLiteral,FOLLOW_TinyintLiteral_in_constant1481); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TinyintLiteral122_tree = 
                    (CommonTree)adaptor.create(TinyintLiteral122)
                    ;
                    adaptor.addChild(root_0, TinyintLiteral122_tree);
                    }

                    }
                    break;
                case 9 :
                    // IdentifiersParser.g:227:7: DecimalLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DecimalLiteral123=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_constant1489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DecimalLiteral123_tree = 
                    (CommonTree)adaptor.create(DecimalLiteral123)
                    ;
                    adaptor.addChild(root_0, DecimalLiteral123_tree);
                    }

                    }
                    break;
                case 10 :
                    // IdentifiersParser.g:228:7: charSetStringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_charSetStringLiteral_in_constant1497);
                    charSetStringLiteral124=charSetStringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, charSetStringLiteral124.getTree());

                    }
                    break;
                case 11 :
                    // IdentifiersParser.g:229:7: booleanValue
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_booleanValue_in_constant1505);
                    booleanValue125=booleanValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanValue125.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class stringLiteralSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringLiteralSequence"
    // IdentifiersParser.g:232:1: stringLiteralSequence : StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) ;
    public final HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence() throws RecognitionException {
        HiveParser_IdentifiersParser.stringLiteralSequence_return retval = new HiveParser_IdentifiersParser.stringLiteralSequence_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral126=null;
        Token StringLiteral127=null;

        CommonTree StringLiteral126_tree=null;
        CommonTree StringLiteral127_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            // IdentifiersParser.g:233:5: ( StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) )
            // IdentifiersParser.g:234:5: StringLiteral ( StringLiteral )+
            {
            StringLiteral126=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1526); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral126);


            // IdentifiersParser.g:234:19: ( StringLiteral )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // IdentifiersParser.g:234:19: StringLiteral
            	    {
            	    StringLiteral127=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1528); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral127);


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            // AST REWRITE
            // elements: StringLiteral, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:34: -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
            {
                // IdentifiersParser.g:234:37: ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_STRINGLITERALSEQUENCE, "TOK_STRINGLITERALSEQUENCE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                if ( !(stream_StringLiteral.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_StringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_StringLiteral.nextNode()
                    );

                }
                stream_StringLiteral.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringLiteralSequence"


    public static class charSetStringLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "charSetStringLiteral"
    // IdentifiersParser.g:237:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
    public final HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.charSetStringLiteral_return retval = new HiveParser_IdentifiersParser.charSetStringLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token csName=null;
        Token csLiteral=null;

        CommonTree csName_tree=null;
        CommonTree csLiteral_tree=null;
        RewriteRuleTokenStream stream_CharSetLiteral=new RewriteRuleTokenStream(adaptor,"token CharSetLiteral");
        RewriteRuleTokenStream stream_CharSetName=new RewriteRuleTokenStream(adaptor,"token CharSetName");

         gParent.pushMsg("character string literal", state); 
        try {
            // IdentifiersParser.g:240:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
            // IdentifiersParser.g:241:5: csName= CharSetName csLiteral= CharSetLiteral
            {
            csName=(Token)match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral1573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetName.add(csName);


            csLiteral=(Token)match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral1577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CharSetLiteral.add(csLiteral);


            // AST REWRITE
            // elements: csLiteral, csName
            // token labels: csName, csLiteral
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_csName=new RewriteRuleTokenStream(adaptor,"token csName",csName);
            RewriteRuleTokenStream stream_csLiteral=new RewriteRuleTokenStream(adaptor,"token csLiteral",csLiteral);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 241:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
            {
                // IdentifiersParser.g:241:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_CHARSETLITERAL, "TOK_CHARSETLITERAL")
                , root_1);

                adaptor.addChild(root_1, stream_csName.nextNode());

                adaptor.addChild(root_1, stream_csLiteral.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "charSetStringLiteral"


    public static class dateLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dateLiteral"
    // IdentifiersParser.g:244:1: dateLiteral : KW_DATE StringLiteral ->;
    public final HiveParser_IdentifiersParser.dateLiteral_return dateLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.dateLiteral_return retval = new HiveParser_IdentifiersParser.dateLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_DATE128=null;
        Token StringLiteral129=null;

        CommonTree KW_DATE128_tree=null;
        CommonTree StringLiteral129_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");

        try {
            // IdentifiersParser.g:245:5: ( KW_DATE StringLiteral ->)
            // IdentifiersParser.g:246:5: KW_DATE StringLiteral
            {
            KW_DATE128=(Token)match(input,KW_DATE,FOLLOW_KW_DATE_in_dateLiteral1610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATE.add(KW_DATE128);


            StringLiteral129=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dateLiteral1612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral129);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 246:27: ->
            {
                adaptor.addChild(root_0, 
                      // Create DateLiteral token, but with the text of the string value
                      // This makes the dateLiteral more consistent with the other type literals.
                      adaptor.create(TOK_DATELITERAL, (StringLiteral129!=null?StringLiteral129.getText():null))
                    );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dateLiteral"


    public static class timestampLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestampLiteral"
    // IdentifiersParser.g:254:1: timestampLiteral : KW_TIMESTAMP StringLiteral ->;
    public final HiveParser_IdentifiersParser.timestampLiteral_return timestampLiteral() throws RecognitionException {
        HiveParser_IdentifiersParser.timestampLiteral_return retval = new HiveParser_IdentifiersParser.timestampLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_TIMESTAMP130=null;
        Token StringLiteral131=null;

        CommonTree KW_TIMESTAMP130_tree=null;
        CommonTree StringLiteral131_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token KW_TIMESTAMP");

        try {
            // IdentifiersParser.g:255:5: ( KW_TIMESTAMP StringLiteral ->)
            // IdentifiersParser.g:256:5: KW_TIMESTAMP StringLiteral
            {
            KW_TIMESTAMP130=(Token)match(input,KW_TIMESTAMP,FOLLOW_KW_TIMESTAMP_in_timestampLiteral1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TIMESTAMP.add(KW_TIMESTAMP130);


            StringLiteral131=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_timestampLiteral1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral131);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 256:32: ->
            {
                adaptor.addChild(root_0, 
                      adaptor.create(TOK_TIMESTAMPLITERAL, (StringLiteral131!=null?StringLiteral131.getText():null))
                    );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "timestampLiteral"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // IdentifiersParser.g:262:1: expression : precedenceOrExpression ;
    public final HiveParser_IdentifiersParser.expression_return expression() throws RecognitionException {
        HiveParser_IdentifiersParser.expression_return retval = new HiveParser_IdentifiersParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression132 =null;



         gParent.pushMsg("expression specification", state); 
        try {
            // IdentifiersParser.g:265:5: ( precedenceOrExpression )
            // IdentifiersParser.g:266:5: precedenceOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceOrExpression_in_expression1682);
            precedenceOrExpression132=precedenceOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceOrExpression132.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class atomExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExpression"
    // IdentifiersParser.g:269:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !);
    public final HiveParser_IdentifiersParser.atomExpression_return atomExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.atomExpression_return retval = new HiveParser_IdentifiersParser.atomExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL133=null;
        Token LPAREN140=null;
        Token RPAREN142=null;
        HiveParser_IdentifiersParser.constant_return constant134 =null;

        HiveParser_IdentifiersParser.castExpression_return castExpression135 =null;

        HiveParser_IdentifiersParser.caseExpression_return caseExpression136 =null;

        HiveParser_IdentifiersParser.whenExpression_return whenExpression137 =null;

        HiveParser_IdentifiersParser.function_return function138 =null;

        HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn139 =null;

        HiveParser_IdentifiersParser.expression_return expression141 =null;


        CommonTree KW_NULL133_tree=null;
        CommonTree LPAREN140_tree=null;
        CommonTree RPAREN142_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

        try {
            // IdentifiersParser.g:270:5: ( KW_NULL -> TOK_NULL | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !)
            int alt32=8;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // IdentifiersParser.g:271:5: KW_NULL
                    {
                    KW_NULL133=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression1703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL133);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:13: -> TOK_NULL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(TOK_NULL, "TOK_NULL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:272:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_atomExpression1715);
                    constant134=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant134.getTree());

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:273:7: castExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_castExpression_in_atomExpression1723);
                    castExpression135=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression135.getTree());

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:274:7: caseExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_caseExpression_in_atomExpression1731);
                    caseExpression136=caseExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression136.getTree());

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:275:7: whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whenExpression_in_atomExpression1739);
                    whenExpression137=whenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression137.getTree());

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:276:7: ( functionName LPAREN )=> function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_atomExpression1755);
                    function138=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function138.getTree());

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:277:7: tableOrColumn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tableOrColumn_in_atomExpression1763);
                    tableOrColumn139=gHiveParser.tableOrColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableOrColumn139.getTree());

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:278:7: LPAREN ! expression RPAREN !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression1771); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_atomExpression1774);
                    expression141=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());

                    RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression1776); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomExpression"


    public static class precedenceFieldExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceFieldExpression"
    // IdentifiersParser.g:282:1: precedenceFieldExpression : atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* ;
    public final HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceFieldExpression_return retval = new HiveParser_IdentifiersParser.precedenceFieldExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LSQUARE144=null;
        Token RSQUARE146=null;
        Token DOT147=null;
        HiveParser_IdentifiersParser.atomExpression_return atomExpression143 =null;

        HiveParser_IdentifiersParser.expression_return expression145 =null;

        HiveParser_IdentifiersParser.identifier_return identifier148 =null;


        CommonTree LSQUARE144_tree=null;
        CommonTree RSQUARE146_tree=null;
        CommonTree DOT147_tree=null;

        try {
            // IdentifiersParser.g:283:5: ( atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* )
            // IdentifiersParser.g:284:5: atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression1799);
            atomExpression143=atomExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atomExpression143.getTree());

            // IdentifiersParser.g:284:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
            loop33:
            do {
                int alt33=3;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // IdentifiersParser.g:284:21: ( LSQUARE ^ expression RSQUARE !)
            	    {
            	    // IdentifiersParser.g:284:21: ( LSQUARE ^ expression RSQUARE !)
            	    // IdentifiersParser.g:284:22: LSQUARE ^ expression RSQUARE !
            	    {
            	    LSQUARE144=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression1803); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LSQUARE144_tree = 
            	    (CommonTree)adaptor.create(LSQUARE144)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE144_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_expression_in_precedenceFieldExpression1806);
            	    expression145=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression145.getTree());

            	    RSQUARE146=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression1808); if (state.failed) return retval;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // IdentifiersParser.g:284:54: ( DOT ^ identifier )
            	    {
            	    // IdentifiersParser.g:284:54: ( DOT ^ identifier )
            	    // IdentifiersParser.g:284:55: DOT ^ identifier
            	    {
            	    DOT147=(Token)match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression1815); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT147_tree = 
            	    (CommonTree)adaptor.create(DOT147)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DOT147_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_identifier_in_precedenceFieldExpression1818);
            	    identifier148=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier148.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceFieldExpression"


    public static class precedenceUnaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryOperator"
    // IdentifiersParser.g:287:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
    public final HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryOperator_return retval = new HiveParser_IdentifiersParser.precedenceUnaryOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set149=null;

        CommonTree set149_tree=null;

        try {
            // IdentifiersParser.g:288:5: ( PLUS | MINUS | TILDE )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set149=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set149)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnaryOperator"


    public static class nullCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullCondition"
    // IdentifiersParser.g:292:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
    public final HiveParser_IdentifiersParser.nullCondition_return nullCondition() throws RecognitionException {
        HiveParser_IdentifiersParser.nullCondition_return retval = new HiveParser_IdentifiersParser.nullCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NULL150=null;
        Token KW_NOT151=null;
        Token KW_NULL152=null;

        CommonTree KW_NULL150_tree=null;
        CommonTree KW_NOT151_tree=null;
        CommonTree KW_NULL152_tree=null;
        RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

        try {
            // IdentifiersParser.g:293:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
            int alt34=2;
            switch ( input.LA(1) ) {
            case KW_NULL:
                {
                alt34=1;
                }
                break;
            case KW_NOT:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // IdentifiersParser.g:294:5: KW_NULL
                    {
                    KW_NULL150=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL150);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:13: -> ^( TOK_ISNULL )
                    {
                        // IdentifiersParser.g:294:16: ^( TOK_ISNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNULL, "TOK_ISNULL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:295:7: KW_NOT KW_NULL
                    {
                    KW_NOT151=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition1885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT151);


                    KW_NULL152=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL152);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 295:22: -> ^( TOK_ISNOTNULL )
                    {
                        // IdentifiersParser.g:295:25: ^( TOK_ISNOTNULL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_ISNOTNULL, "TOK_ISNOTNULL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nullCondition"


    public static class precedenceUnaryPrefixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnaryPrefixExpression"
    // IdentifiersParser.g:298:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator ^)* precedenceFieldExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator153 =null;

        HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression154 =null;



        try {
            // IdentifiersParser.g:299:5: ( ( precedenceUnaryOperator ^)* precedenceFieldExpression )
            // IdentifiersParser.g:300:5: ( precedenceUnaryOperator ^)* precedenceFieldExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:300:5: ( precedenceUnaryOperator ^)*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                case TILDE:
                    {
                    alt35=1;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // IdentifiersParser.g:300:6: precedenceUnaryOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1915);
            	    precedenceUnaryOperator153=precedenceUnaryOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator153.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1920);
            precedenceFieldExpression154=precedenceFieldExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceFieldExpression154.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnaryPrefixExpression"


    public static class precedenceUnarySuffixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceUnarySuffixExpression"
    // IdentifiersParser.g:303:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
    public final HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression155 =null;

        HiveParser_IdentifiersParser.nullCondition_return nullCondition156 =null;


        CommonTree a_tree=null;
        RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
        RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
        RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");
        try {
            // IdentifiersParser.g:304:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
            // IdentifiersParser.g:304:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
            {
            pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1937);
            precedenceUnaryPrefixExpression155=precedenceUnaryPrefixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression155.getTree());

            // IdentifiersParser.g:304:39: (a= KW_IS nullCondition )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // IdentifiersParser.g:304:40: a= KW_IS nullCondition
                    {
                    a=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_IS.add(a);


                    pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1944);
                    nullCondition156=nullCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullCondition.add(nullCondition156.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: precedenceUnaryPrefixExpression, precedenceUnaryPrefixExpression, nullCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
            if (a != null) {
                // IdentifiersParser.g:305:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_nullCondition.nextTree());

                adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 306:5: -> precedenceUnaryPrefixExpression
            {
                adaptor.addChild(root_0, stream_precedenceUnaryPrefixExpression.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceUnarySuffixExpression"


    public static class precedenceBitwiseXorOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorOperator"
    // IdentifiersParser.g:310:1: precedenceBitwiseXorOperator : BITWISEXOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEXOR157=null;

        CommonTree BITWISEXOR157_tree=null;

        try {
            // IdentifiersParser.g:311:5: ( BITWISEXOR )
            // IdentifiersParser.g:312:5: BITWISEXOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEXOR157=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator1992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEXOR157_tree = 
            (CommonTree)adaptor.create(BITWISEXOR157)
            ;
            adaptor.addChild(root_0, BITWISEXOR157_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseXorOperator"


    public static class precedenceBitwiseXorExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseXorExpression"
    // IdentifiersParser.g:315:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression158 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator159 =null;

        HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression160 =null;



        try {
            // IdentifiersParser.g:316:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* )
            // IdentifiersParser.g:317:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2013);
            precedenceUnarySuffixExpression158=precedenceUnarySuffixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression158.getTree());

            // IdentifiersParser.g:317:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // IdentifiersParser.g:317:38: precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2016);
            	    precedenceBitwiseXorOperator159=precedenceBitwiseXorOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator159.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2019);
            	    precedenceUnarySuffixExpression160=precedenceUnarySuffixExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression160.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseXorExpression"


    public static class precedenceStarOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarOperator"
    // IdentifiersParser.g:321:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
    public final HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarOperator_return retval = new HiveParser_IdentifiersParser.precedenceStarOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set161=null;

        CommonTree set161_tree=null;

        try {
            // IdentifiersParser.g:322:5: ( STAR | DIVIDE | MOD | DIV )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set161=(Token)input.LT(1);

            if ( (input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||input.LA(1)==MOD||input.LA(1)==STAR ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set161)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceStarOperator"


    public static class precedenceStarExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceStarExpression"
    // IdentifiersParser.g:326:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceStarExpression_return retval = new HiveParser_IdentifiersParser.precedenceStarExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression162 =null;

        HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator163 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression164 =null;



        try {
            // IdentifiersParser.g:327:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* )
            // IdentifiersParser.g:328:5: precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2076);
            precedenceBitwiseXorExpression162=precedenceBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression162.getTree());

            // IdentifiersParser.g:328:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // IdentifiersParser.g:328:37: precedenceStarOperator ^ precedenceBitwiseXorExpression
            	    {
            	    pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression2079);
            	    precedenceStarOperator163=precedenceStarOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator163.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2082);
            	    precedenceBitwiseXorExpression164=precedenceBitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression164.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceStarExpression"


    public static class precedencePlusOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusOperator"
    // IdentifiersParser.g:332:1: precedencePlusOperator : ( PLUS | MINUS );
    public final HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusOperator_return retval = new HiveParser_IdentifiersParser.precedencePlusOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set165=null;

        CommonTree set165_tree=null;

        try {
            // IdentifiersParser.g:333:5: ( PLUS | MINUS )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set165=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set165)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedencePlusOperator"


    public static class precedencePlusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedencePlusExpression"
    // IdentifiersParser.g:337:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* ;
    public final HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedencePlusExpression_return retval = new HiveParser_IdentifiersParser.precedencePlusExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression166 =null;

        HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator167 =null;

        HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression168 =null;



        try {
            // IdentifiersParser.g:338:5: ( precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* )
            // IdentifiersParser.g:339:5: precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2131);
            precedenceStarExpression166=precedenceStarExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression166.getTree());

            // IdentifiersParser.g:339:30: ( precedencePlusOperator ^ precedenceStarExpression )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // IdentifiersParser.g:339:31: precedencePlusOperator ^ precedenceStarExpression
            	    {
            	    pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression2134);
            	    precedencePlusOperator167=precedencePlusOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator167.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2137);
            	    precedenceStarExpression168=precedenceStarExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression168.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedencePlusExpression"


    public static class precedenceAmpersandOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandOperator"
    // IdentifiersParser.g:343:1: precedenceAmpersandOperator : AMPERSAND ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND169=null;

        CommonTree AMPERSAND169_tree=null;

        try {
            // IdentifiersParser.g:344:5: ( AMPERSAND )
            // IdentifiersParser.g:345:5: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND169=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND169_tree = 
            (CommonTree)adaptor.create(AMPERSAND169)
            ;
            adaptor.addChild(root_0, AMPERSAND169_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAmpersandOperator"


    public static class precedenceAmpersandExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAmpersandExpression"
    // IdentifiersParser.g:348:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression170 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator171 =null;

        HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression172 =null;



        try {
            // IdentifiersParser.g:349:5: ( precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* )
            // IdentifiersParser.g:350:5: precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2182);
            precedencePlusExpression170=precedencePlusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression170.getTree());

            // IdentifiersParser.g:350:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case AMPERSAND:
                    {
                    alt40=1;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // IdentifiersParser.g:350:31: precedenceAmpersandOperator ^ precedencePlusExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2185);
            	    precedenceAmpersandOperator171=precedenceAmpersandOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator171.getTree(), root_0);

            	    pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2188);
            	    precedencePlusExpression172=precedencePlusExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression172.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAmpersandExpression"


    public static class precedenceBitwiseOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrOperator"
    // IdentifiersParser.g:354:1: precedenceBitwiseOrOperator : BITWISEOR ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITWISEOR173=null;

        CommonTree BITWISEOR173_tree=null;

        try {
            // IdentifiersParser.g:355:5: ( BITWISEOR )
            // IdentifiersParser.g:356:5: BITWISEOR
            {
            root_0 = (CommonTree)adaptor.nil();


            BITWISEOR173=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BITWISEOR173_tree = 
            (CommonTree)adaptor.create(BITWISEOR173)
            ;
            adaptor.addChild(root_0, BITWISEOR173_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseOrOperator"


    public static class precedenceBitwiseOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceBitwiseOrExpression"
    // IdentifiersParser.g:359:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression174 =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator175 =null;

        HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression176 =null;



        try {
            // IdentifiersParser.g:360:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* )
            // IdentifiersParser.g:361:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2233);
            precedenceAmpersandExpression174=precedenceAmpersandExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression174.getTree());

            // IdentifiersParser.g:361:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case BITWISEOR:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // IdentifiersParser.g:361:36: precedenceBitwiseOrOperator ^ precedenceAmpersandExpression
            	    {
            	    pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2236);
            	    precedenceBitwiseOrOperator175=precedenceBitwiseOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator175.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2239);
            	    precedenceAmpersandExpression176=precedenceAmpersandExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression176.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceBitwiseOrExpression"


    public static class precedenceEqualNegatableOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualNegatableOperator"
    // IdentifiersParser.g:366:1: precedenceEqualNegatableOperator : ( KW_LIKE | KW_RLIKE | KW_REGEXP );
    public final HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set177=null;

        CommonTree set177_tree=null;

        try {
            // IdentifiersParser.g:367:5: ( KW_LIKE | KW_RLIKE | KW_REGEXP )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set177=(Token)input.LT(1);

            if ( input.LA(1)==KW_LIKE||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set177)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualNegatableOperator"


    public static class precedenceEqualOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualOperator"
    // IdentifiersParser.g:371:1: precedenceEqualOperator : ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
    public final HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL179=null;
        Token EQUAL_NS180=null;
        Token NOTEQUAL181=null;
        Token LESSTHANOREQUALTO182=null;
        Token LESSTHAN183=null;
        Token GREATERTHANOREQUALTO184=null;
        Token GREATERTHAN185=null;
        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator178 =null;


        CommonTree EQUAL179_tree=null;
        CommonTree EQUAL_NS180_tree=null;
        CommonTree NOTEQUAL181_tree=null;
        CommonTree LESSTHANOREQUALTO182_tree=null;
        CommonTree LESSTHAN183_tree=null;
        CommonTree GREATERTHANOREQUALTO184_tree=null;
        CommonTree GREATERTHAN185_tree=null;

        try {
            // IdentifiersParser.g:372:5: ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
            int alt42=8;
            switch ( input.LA(1) ) {
            case KW_LIKE:
            case KW_REGEXP:
            case KW_RLIKE:
                {
                alt42=1;
                }
                break;
            case EQUAL:
                {
                alt42=2;
                }
                break;
            case EQUAL_NS:
                {
                alt42=3;
                }
                break;
            case NOTEQUAL:
                {
                alt42=4;
                }
                break;
            case LESSTHANOREQUALTO:
                {
                alt42=5;
                }
                break;
            case LESSTHAN:
                {
                alt42=6;
                }
                break;
            case GREATERTHANOREQUALTO:
                {
                alt42=7;
                }
                break;
            case GREATERTHAN:
                {
                alt42=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // IdentifiersParser.g:373:5: precedenceEqualNegatableOperator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2293);
                    precedenceEqualNegatableOperator178=precedenceEqualNegatableOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualNegatableOperator178.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:373:40: EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL179=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_precedenceEqualOperator2297); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL179_tree = 
                    (CommonTree)adaptor.create(EQUAL179)
                    ;
                    adaptor.addChild(root_0, EQUAL179_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:373:48: EQUAL_NS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQUAL_NS180=(Token)match(input,EQUAL_NS,FOLLOW_EQUAL_NS_in_precedenceEqualOperator2301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL_NS180_tree = 
                    (CommonTree)adaptor.create(EQUAL_NS180)
                    ;
                    adaptor.addChild(root_0, EQUAL_NS180_tree);
                    }

                    }
                    break;
                case 4 :
                    // IdentifiersParser.g:373:59: NOTEQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOTEQUAL181=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_precedenceEqualOperator2305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOTEQUAL181_tree = 
                    (CommonTree)adaptor.create(NOTEQUAL181)
                    ;
                    adaptor.addChild(root_0, NOTEQUAL181_tree);
                    }

                    }
                    break;
                case 5 :
                    // IdentifiersParser.g:373:70: LESSTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHANOREQUALTO182=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHANOREQUALTO182_tree = 
                    (CommonTree)adaptor.create(LESSTHANOREQUALTO182)
                    ;
                    adaptor.addChild(root_0, LESSTHANOREQUALTO182_tree);
                    }

                    }
                    break;
                case 6 :
                    // IdentifiersParser.g:373:90: LESSTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LESSTHAN183=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_precedenceEqualOperator2313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESSTHAN183_tree = 
                    (CommonTree)adaptor.create(LESSTHAN183)
                    ;
                    adaptor.addChild(root_0, LESSTHAN183_tree);
                    }

                    }
                    break;
                case 7 :
                    // IdentifiersParser.g:373:101: GREATERTHANOREQUALTO
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHANOREQUALTO184=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHANOREQUALTO184_tree = 
                    (CommonTree)adaptor.create(GREATERTHANOREQUALTO184)
                    ;
                    adaptor.addChild(root_0, GREATERTHANOREQUALTO184_tree);
                    }

                    }
                    break;
                case 8 :
                    // IdentifiersParser.g:373:124: GREATERTHAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GREATERTHAN185=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_precedenceEqualOperator2321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATERTHAN185_tree = 
                    (CommonTree)adaptor.create(GREATERTHAN185)
                    ;
                    adaptor.addChild(root_0, GREATERTHAN185_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualOperator"


    public static class subQueryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subQueryExpression"
    // IdentifiersParser.g:376:1: subQueryExpression : LPAREN ! selectStatement[true] RPAREN !;
    public final HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.subQueryExpression_return retval = new HiveParser_IdentifiersParser.subQueryExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN186=null;
        Token RPAREN188=null;
        HiveParser.selectStatement_return selectStatement187 =null;


        CommonTree LPAREN186_tree=null;
        CommonTree RPAREN188_tree=null;

        try {
            // IdentifiersParser.g:377:5: ( LPAREN ! selectStatement[true] RPAREN !)
            // IdentifiersParser.g:378:5: LPAREN ! selectStatement[true] RPAREN !
            {
            root_0 = (CommonTree)adaptor.nil();


            LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQueryExpression2344); if (state.failed) return retval;

            pushFollow(FOLLOW_selectStatement_in_subQueryExpression2347);
            selectStatement187=gHiveParser.selectStatement(true);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectStatement187.getTree());

            RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQueryExpression2350); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subQueryExpression"


    public static class precedenceEqualExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceEqualExpression"
    // IdentifiersParser.g:381:1: precedenceEqualExpression : ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) );
    public final HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceEqualExpression_return retval = new HiveParser_IdentifiersParser.precedenceEqualExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT189=null;
        Token KW_NOT192=null;
        Token KW_IN193=null;
        Token KW_NOT195=null;
        Token KW_IN196=null;
        Token KW_IN198=null;
        Token KW_IN200=null;
        Token KW_NOT202=null;
        Token KW_BETWEEN203=null;
        Token KW_AND204=null;
        Token KW_BETWEEN205=null;
        Token KW_AND206=null;
        Token KW_EXISTS207=null;
        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return left =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return notExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return equalExpr =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return min =null;

        HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return max =null;

        HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator190 =null;

        HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator191 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression194 =null;

        HiveParser_IdentifiersParser.expressions_return expressions197 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression199 =null;

        HiveParser_IdentifiersParser.expressions_return expressions201 =null;

        HiveParser_IdentifiersParser.subQueryExpression_return subQueryExpression208 =null;


        CommonTree KW_NOT189_tree=null;
        CommonTree KW_NOT192_tree=null;
        CommonTree KW_IN193_tree=null;
        CommonTree KW_NOT195_tree=null;
        CommonTree KW_IN196_tree=null;
        CommonTree KW_IN198_tree=null;
        CommonTree KW_IN200_tree=null;
        CommonTree KW_NOT202_tree=null;
        CommonTree KW_BETWEEN203_tree=null;
        CommonTree KW_AND204_tree=null;
        CommonTree KW_BETWEEN205_tree=null;
        CommonTree KW_AND206_tree=null;
        CommonTree KW_EXISTS207_tree=null;
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_EXISTS=new RewriteRuleTokenStream(adaptor,"token KW_EXISTS");
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleSubtreeStream stream_subQueryExpression=new RewriteRuleSubtreeStream(adaptor,"rule subQueryExpression");
        RewriteRuleSubtreeStream stream_precedenceEqualNegatableOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualNegatableOperator");
        RewriteRuleSubtreeStream stream_precedenceEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualOperator");
        RewriteRuleSubtreeStream stream_precedenceBitwiseOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceBitwiseOrExpression");
        RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");
        try {
            // IdentifiersParser.g:382:5: ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // IdentifiersParser.g:383:5: (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
                    {
                    // IdentifiersParser.g:383:5: (left= precedenceBitwiseOrExpression -> $left)
                    // IdentifiersParser.g:383:6: left= precedenceBitwiseOrExpression
                    {
                    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2378);
                    left=precedenceBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(left.getTree());

                    // AST REWRITE
                    // elements: left
                    // token labels: 
                    // rule labels: retval, left
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 383:41: -> $left
                    {
                        adaptor.addChild(root_0, stream_left.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    // IdentifiersParser.g:384:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
                    loop43:
                    do {
                        int alt43=9;
                        alt43 = dfa43.predict(input);
                        switch (alt43) {
                    	case 1 :
                    	    // IdentifiersParser.g:385:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
                    	    {
                    	    // IdentifiersParser.g:385:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:385:9: KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression
                    	    {
                    	    KW_NOT189=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2400); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT189);


                    	    pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2402);
                    	    precedenceEqualNegatableOperator190=precedenceEqualNegatableOperator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceEqualNegatableOperator.add(precedenceEqualNegatableOperator190.getTree());

                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2406);
                    	    notExpr=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(notExpr.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: notExpr, precedenceEqualNegatableOperator, precedenceEqualExpression, KW_NOT
                    	    // token labels: 
                    	    // rule labels: retval, notExpr
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr",notExpr!=null?notExpr.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 386:8: -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
                    	    {
                    	        // IdentifiersParser.g:386:11: ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:386:20: ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr)
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualNegatableOperator.nextNode(), root_2);

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_2, stream_notExpr.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // IdentifiersParser.g:387:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
                    	    {
                    	    // IdentifiersParser.g:387:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:387:8: precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2439);
                    	    precedenceEqualOperator191=precedenceEqualOperator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceEqualOperator.add(precedenceEqualOperator191.getTree());

                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2443);
                    	    equalExpr=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(equalExpr.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: precedenceEqualOperator, precedenceEqualExpression, equalExpr
                    	    // token labels: 
                    	    // rule labels: equalExpr, retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr",equalExpr!=null?equalExpr.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 388:8: -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
                    	    {
                    	        // IdentifiersParser.g:388:11: ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualOperator.nextNode(), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_equalExpr.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // IdentifiersParser.g:389:7: ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression )
                    	    {
                    	    // IdentifiersParser.g:389:42: ( KW_NOT KW_IN subQueryExpression )
                    	    // IdentifiersParser.g:389:43: KW_NOT KW_IN subQueryExpression
                    	    {
                    	    KW_NOT192=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2484); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT192);


                    	    KW_IN193=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2486); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN193);


                    	    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2488);
                    	    subQueryExpression194=subQueryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression194.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: precedenceEqualExpression, KW_NOT, KW_IN, subQueryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 390:8: -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) )
                    	    {
                    	        // IdentifiersParser.g:390:11: ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:390:20: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                    	        , root_2);

                    	        // IdentifiersParser.g:390:40: ^( TOK_SUBQUERY_OP KW_IN )
                    	        {
                    	        CommonTree root_3 = (CommonTree)adaptor.nil();
                    	        root_3 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                    	        , root_3);

                    	        adaptor.addChild(root_3, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_2, root_3);
                    	        }

                    	        adaptor.addChild(root_2, stream_subQueryExpression.nextTree());

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // IdentifiersParser.g:391:7: ( KW_NOT KW_IN expressions )
                    	    {
                    	    // IdentifiersParser.g:391:7: ( KW_NOT KW_IN expressions )
                    	    // IdentifiersParser.g:391:8: KW_NOT KW_IN expressions
                    	    {
                    	    KW_NOT195=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2527); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT195);


                    	    KW_IN196=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2529); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN196);


                    	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2531);
                    	    expressions197=expressions();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressions.add(expressions197.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: KW_IN, precedenceEqualExpression, expressions, KW_NOT
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 392:8: -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
                    	    {
                    	        // IdentifiersParser.g:392:11: ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        stream_KW_NOT.nextNode()
                    	        , root_1);

                    	        // IdentifiersParser.g:392:20: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_2);

                    	        adaptor.addChild(root_2, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_2, stream_retval.nextTree());

                    	        adaptor.addChild(root_2, stream_expressions.nextTree());

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // IdentifiersParser.g:393:7: ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression )
                    	    {
                    	    // IdentifiersParser.g:393:35: ( KW_IN subQueryExpression )
                    	    // IdentifiersParser.g:393:36: KW_IN subQueryExpression
                    	    {
                    	    KW_IN198=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2575); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN198);


                    	    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2577);
                    	    subQueryExpression199=subQueryExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression199.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: KW_IN, precedenceEqualExpression, subQueryExpression
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 394:8: -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	    {
                    	        // IdentifiersParser.g:394:11: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                    	        , root_1);

                    	        // IdentifiersParser.g:394:31: ^( TOK_SUBQUERY_OP KW_IN )
                    	        {
                    	        CommonTree root_2 = (CommonTree)adaptor.nil();
                    	        root_2 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                    	        , root_2);

                    	        adaptor.addChild(root_2, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_1, root_2);
                    	        }

                    	        adaptor.addChild(root_1, stream_subQueryExpression.nextTree());

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // IdentifiersParser.g:395:7: ( KW_IN expressions )
                    	    {
                    	    // IdentifiersParser.g:395:7: ( KW_IN expressions )
                    	    // IdentifiersParser.g:395:8: KW_IN expressions
                    	    {
                    	    KW_IN200=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2612); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN200);


                    	    pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2614);
                    	    expressions201=expressions();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressions.add(expressions201.getTree());

                    	    }


                    	    // AST REWRITE
                    	    // elements: precedenceEqualExpression, KW_IN, expressions
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 396:8: -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	    {
                    	        // IdentifiersParser.g:396:11: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        stream_KW_IN.nextNode()
                    	        );

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_expressions.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // IdentifiersParser.g:397:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    {
                    	    // IdentifiersParser.g:397:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    // IdentifiersParser.g:397:9: KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
                    	    {
                    	    KW_NOT202=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2645); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT202);


                    	    KW_BETWEEN203=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2647); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN203);


                    	    // IdentifiersParser.g:397:27: (min= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:397:28: min= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2652);
                    	    min=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

                    	    }


                    	    KW_AND204=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2655); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND204);


                    	    // IdentifiersParser.g:397:70: (max= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:397:71: max= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2660);
                    	    max=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

                    	    }


                    	    }


                    	    // AST REWRITE
                    	    // elements: min, left, max
                    	    // token labels: 
                    	    // rule labels: min, retval, max, left
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
                    	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 398:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
                    	    {
                    	        // IdentifiersParser.g:398:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(Identifier, "between")
                    	        );

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(KW_TRUE, "KW_TRUE")
                    	        );

                    	        adaptor.addChild(root_1, stream_left.nextTree());

                    	        adaptor.addChild(root_1, stream_min.nextTree());

                    	        adaptor.addChild(root_1, stream_max.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // IdentifiersParser.g:399:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    {
                    	    // IdentifiersParser.g:399:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
                    	    // IdentifiersParser.g:399:9: KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
                    	    {
                    	    KW_BETWEEN205=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2700); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN205);


                    	    // IdentifiersParser.g:399:20: (min= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:399:21: min= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2705);
                    	    min=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());

                    	    }


                    	    KW_AND206=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2708); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND206);


                    	    // IdentifiersParser.g:399:63: (max= precedenceBitwiseOrExpression )
                    	    // IdentifiersParser.g:399:64: max= precedenceBitwiseOrExpression
                    	    {
                    	    pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2713);
                    	    max=precedenceBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());

                    	    }


                    	    }


                    	    // AST REWRITE
                    	    // elements: min, left, max
                    	    // token labels: 
                    	    // rule labels: min, retval, max, left
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    	    RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.tree:null);
                    	    RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.tree:null);

                    	    root_0 = (CommonTree)adaptor.nil();
                    	    // 400:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
                    	    {
                    	        // IdentifiersParser.g:400:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
                    	        {
                    	        CommonTree root_1 = (CommonTree)adaptor.nil();
                    	        root_1 = (CommonTree)adaptor.becomeRoot(
                    	        (CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                    	        , root_1);

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(Identifier, "between")
                    	        );

                    	        adaptor.addChild(root_1, 
                    	        (CommonTree)adaptor.create(KW_FALSE, "KW_FALSE")
                    	        );

                    	        adaptor.addChild(root_1, stream_left.nextTree());

                    	        adaptor.addChild(root_1, stream_min.nextTree());

                    	        adaptor.addChild(root_1, stream_max.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:402:7: ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression )
                    {
                    // IdentifiersParser.g:402:38: ( KW_EXISTS subQueryExpression )
                    // IdentifiersParser.g:402:39: KW_EXISTS subQueryExpression
                    {
                    KW_EXISTS207=(Token)match(input,KW_EXISTS,FOLLOW_KW_EXISTS_in_precedenceEqualExpression2768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXISTS.add(KW_EXISTS207);


                    pushFollow(FOLLOW_subQueryExpression_in_precedenceEqualExpression2770);
                    subQueryExpression208=subQueryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subQueryExpression.add(subQueryExpression208.getTree());

                    }


                    // AST REWRITE
                    // elements: KW_EXISTS, subQueryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 402:69: -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression )
                    {
                        // IdentifiersParser.g:402:72: ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SUBQUERY_EXPR, "TOK_SUBQUERY_EXPR")
                        , root_1);

                        // IdentifiersParser.g:402:92: ^( TOK_SUBQUERY_OP KW_EXISTS )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TOK_SUBQUERY_OP, "TOK_SUBQUERY_OP")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_KW_EXISTS.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_subQueryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceEqualExpression"


    public static class expressions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressions"
    // IdentifiersParser.g:405:1: expressions : LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* ;
    public final HiveParser_IdentifiersParser.expressions_return expressions() throws RecognitionException {
        HiveParser_IdentifiersParser.expressions_return retval = new HiveParser_IdentifiersParser.expressions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN209=null;
        Token COMMA211=null;
        Token RPAREN213=null;
        HiveParser_IdentifiersParser.expression_return expression210 =null;

        HiveParser_IdentifiersParser.expression_return expression212 =null;


        CommonTree LPAREN209_tree=null;
        CommonTree COMMA211_tree=null;
        CommonTree RPAREN213_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // IdentifiersParser.g:406:5: ( LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* )
            // IdentifiersParser.g:407:5: LPAREN expression ( COMMA expression )* RPAREN
            {
            LPAREN209=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expressions2806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN209);


            pushFollow(FOLLOW_expression_in_expressions2808);
            expression210=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression210.getTree());

            // IdentifiersParser.g:407:23: ( COMMA expression )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt45=1;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // IdentifiersParser.g:407:24: COMMA expression
            	    {
            	    COMMA211=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions2811); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA211);


            	    pushFollow(FOLLOW_expression_in_expressions2813);
            	    expression212=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression212.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            RPAREN213=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expressions2817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN213);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 407:50: -> ( expression )*
            {
                // IdentifiersParser.g:407:53: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressions"


    public static class precedenceNotOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotOperator"
    // IdentifiersParser.g:410:1: precedenceNotOperator : KW_NOT ;
    public final HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotOperator_return retval = new HiveParser_IdentifiersParser.precedenceNotOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_NOT214=null;

        CommonTree KW_NOT214_tree=null;

        try {
            // IdentifiersParser.g:411:5: ( KW_NOT )
            // IdentifiersParser.g:412:5: KW_NOT
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_NOT214=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator2843); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_NOT214_tree = 
            (CommonTree)adaptor.create(KW_NOT214)
            ;
            adaptor.addChild(root_0, KW_NOT214_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceNotOperator"


    public static class precedenceNotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceNotExpression"
    // IdentifiersParser.g:415:1: precedenceNotExpression : ( precedenceNotOperator ^)* precedenceEqualExpression ;
    public final HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceNotExpression_return retval = new HiveParser_IdentifiersParser.precedenceNotExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator215 =null;

        HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression216 =null;



        try {
            // IdentifiersParser.g:416:5: ( ( precedenceNotOperator ^)* precedenceEqualExpression )
            // IdentifiersParser.g:417:5: ( precedenceNotOperator ^)* precedenceEqualExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            // IdentifiersParser.g:417:5: ( precedenceNotOperator ^)*
            loop46:
            do {
                int alt46=2;
                switch ( input.LA(1) ) {
                case KW_NOT:
                    {
                    alt46=1;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // IdentifiersParser.g:417:6: precedenceNotOperator ^
            	    {
            	    pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression2865);
            	    precedenceNotOperator215=precedenceNotOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator215.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2870);
            precedenceEqualExpression216=precedenceEqualExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualExpression216.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceNotExpression"


    public static class precedenceAndOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndOperator"
    // IdentifiersParser.g:421:1: precedenceAndOperator : KW_AND ;
    public final HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndOperator_return retval = new HiveParser_IdentifiersParser.precedenceAndOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_AND217=null;

        CommonTree KW_AND217_tree=null;

        try {
            // IdentifiersParser.g:422:5: ( KW_AND )
            // IdentifiersParser.g:423:5: KW_AND
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_AND217=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator2892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_AND217_tree = 
            (CommonTree)adaptor.create(KW_AND217)
            ;
            adaptor.addChild(root_0, KW_AND217_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAndOperator"


    public static class precedenceAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceAndExpression"
    // IdentifiersParser.g:426:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceAndExpression_return retval = new HiveParser_IdentifiersParser.precedenceAndExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression218 =null;

        HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator219 =null;

        HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression220 =null;



        try {
            // IdentifiersParser.g:427:5: ( precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* )
            // IdentifiersParser.g:428:5: precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2913);
            precedenceNotExpression218=precedenceNotExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression218.getTree());

            // IdentifiersParser.g:428:29: ( precedenceAndOperator ^ precedenceNotExpression )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case KW_AND:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // IdentifiersParser.g:428:30: precedenceAndOperator ^ precedenceNotExpression
            	    {
            	    pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression2916);
            	    precedenceAndOperator219=precedenceAndOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator219.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2919);
            	    precedenceNotExpression220=precedenceNotExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression220.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceAndExpression"


    public static class precedenceOrOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrOperator"
    // IdentifiersParser.g:432:1: precedenceOrOperator : KW_OR ;
    public final HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceOrOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_OR221=null;

        CommonTree KW_OR221_tree=null;

        try {
            // IdentifiersParser.g:433:5: ( KW_OR )
            // IdentifiersParser.g:434:5: KW_OR
            {
            root_0 = (CommonTree)adaptor.nil();


            KW_OR221=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator2943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_OR221_tree = 
            (CommonTree)adaptor.create(KW_OR221)
            ;
            adaptor.addChild(root_0, KW_OR221_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceOrOperator"


    public static class precedenceOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precedenceOrExpression"
    // IdentifiersParser.g:437:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* ;
    public final HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
        HiveParser_IdentifiersParser.precedenceOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceOrExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression222 =null;

        HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator223 =null;

        HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression224 =null;



        try {
            // IdentifiersParser.g:438:5: ( precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* )
            // IdentifiersParser.g:439:5: precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2964);
            precedenceAndExpression222=precedenceAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression222.getTree());

            // IdentifiersParser.g:439:29: ( precedenceOrOperator ^ precedenceAndExpression )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case KW_OR:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // IdentifiersParser.g:439:30: precedenceOrOperator ^ precedenceAndExpression
            	    {
            	    pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression2967);
            	    precedenceOrOperator223=precedenceOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator223.getTree(), root_0);

            	    pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2970);
            	    precedenceAndExpression224=precedenceAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression224.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "precedenceOrExpression"


    public static class booleanValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanValue"
    // IdentifiersParser.g:443:1: booleanValue : ( KW_TRUE ^| KW_FALSE ^);
    public final HiveParser_IdentifiersParser.booleanValue_return booleanValue() throws RecognitionException {
        HiveParser_IdentifiersParser.booleanValue_return retval = new HiveParser_IdentifiersParser.booleanValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_TRUE225=null;
        Token KW_FALSE226=null;

        CommonTree KW_TRUE225_tree=null;
        CommonTree KW_FALSE226_tree=null;

        try {
            // IdentifiersParser.g:444:5: ( KW_TRUE ^| KW_FALSE ^)
            int alt49=2;
            switch ( input.LA(1) ) {
            case KW_TRUE:
                {
                alt49=1;
                }
                break;
            case KW_FALSE:
                {
                alt49=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // IdentifiersParser.g:445:5: KW_TRUE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_TRUE225=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue2994); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE225_tree = 
                    (CommonTree)adaptor.create(KW_TRUE225)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE225_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:445:16: KW_FALSE ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    KW_FALSE226=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue2999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE226_tree = 
                    (CommonTree)adaptor.create(KW_FALSE226)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE226_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanValue"


    public static class tableOrPartition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrPartition"
    // IdentifiersParser.g:448:1: tableOrPartition : tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) ;
    public final HiveParser_IdentifiersParser.tableOrPartition_return tableOrPartition() throws RecognitionException {
        HiveParser_IdentifiersParser.tableOrPartition_return retval = new HiveParser_IdentifiersParser.tableOrPartition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_FromClauseParser.tableName_return tableName227 =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec228 =null;


        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        try {
            // IdentifiersParser.g:449:4: ( tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) )
            // IdentifiersParser.g:450:4: tableName ( partitionSpec )?
            {
            pushFollow(FOLLOW_tableName_in_tableOrPartition3019);
            tableName227=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tableName227.getTree());

            // IdentifiersParser.g:450:14: ( partitionSpec )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case KW_PARTITION:
                    {
                    alt50=1;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // IdentifiersParser.g:450:14: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_tableOrPartition3021);
                    partitionSpec228=partitionSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec228.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tableName, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 450:29: -> ^( TOK_TAB tableName ( partitionSpec )? )
            {
                // IdentifiersParser.g:450:32: ^( TOK_TAB tableName ( partitionSpec )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_TAB, "TOK_TAB")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                // IdentifiersParser.g:450:52: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableOrPartition"


    public static class partitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionSpec"
    // IdentifiersParser.g:453:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.partitionSpec_return partitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionSpec_return retval = new HiveParser_IdentifiersParser.partitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION229=null;
        Token LPAREN230=null;
        Token COMMA232=null;
        Token RPAREN234=null;
        HiveParser_IdentifiersParser.partitionVal_return partitionVal231 =null;

        HiveParser_IdentifiersParser.partitionVal_return partitionVal233 =null;


        CommonTree KW_PARTITION229_tree=null;
        CommonTree LPAREN230_tree=null;
        CommonTree COMMA232_tree=null;
        CommonTree RPAREN234_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");
        try {
            // IdentifiersParser.g:454:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
            // IdentifiersParser.g:455:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
            {
            KW_PARTITION229=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec3053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION229);


            LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec3060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN230);


            pushFollow(FOLLOW_partitionVal_in_partitionSpec3062);
            partitionVal231=partitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal231.getTree());

            // IdentifiersParser.g:456:26: ( COMMA partitionVal )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt51=1;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // IdentifiersParser.g:456:27: COMMA partitionVal
            	    {
            	    COMMA232=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionSpec3065); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA232);


            	    pushFollow(FOLLOW_partitionVal_in_partitionSpec3068);
            	    partitionVal233=partitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal233.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            RPAREN234=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec3073); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN234);


            // AST REWRITE
            // elements: partitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 456:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
            {
                // IdentifiersParser.g:456:60: ^( TOK_PARTSPEC ( partitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_partitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionVal.nextTree());

                }
                stream_partitionVal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionSpec"


    public static class partitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionVal"
    // IdentifiersParser.g:459:1: partitionVal : identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) ;
    public final HiveParser_IdentifiersParser.partitionVal_return partitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.partitionVal_return retval = new HiveParser_IdentifiersParser.partitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL236=null;
        HiveParser_IdentifiersParser.identifier_return identifier235 =null;

        HiveParser_IdentifiersParser.constant_return constant237 =null;


        CommonTree EQUAL236_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:460:5: ( identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) )
            // IdentifiersParser.g:461:5: identifier ( EQUAL constant )?
            {
            pushFollow(FOLLOW_identifier_in_partitionVal3104);
            identifier235=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier235.getTree());

            // IdentifiersParser.g:461:16: ( EQUAL constant )?
            int alt52=2;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt52=1;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // IdentifiersParser.g:461:17: EQUAL constant
                    {
                    EQUAL236=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal3107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL236);


                    pushFollow(FOLLOW_constant_in_partitionVal3109);
                    constant237=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant237.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 461:34: -> ^( TOK_PARTVAL identifier ( constant )? )
            {
                // IdentifiersParser.g:461:37: ^( TOK_PARTVAL identifier ( constant )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // IdentifiersParser.g:461:62: ( constant )?
                if ( stream_constant.hasNext() ) {
                    adaptor.addChild(root_1, stream_constant.nextTree());

                }
                stream_constant.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitionVal"


    public static class dropPartitionSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionSpec"
    // IdentifiersParser.g:464:1: dropPartitionSpec : KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) ;
    public final HiveParser_IdentifiersParser.dropPartitionSpec_return dropPartitionSpec() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionSpec_return retval = new HiveParser_IdentifiersParser.dropPartitionSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token KW_PARTITION238=null;
        Token LPAREN239=null;
        Token COMMA241=null;
        Token RPAREN243=null;
        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal240 =null;

        HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal242 =null;


        CommonTree KW_PARTITION238_tree=null;
        CommonTree LPAREN239_tree=null;
        CommonTree COMMA241_tree=null;
        CommonTree RPAREN243_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_dropPartitionVal=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionVal");
        try {
            // IdentifiersParser.g:465:5: ( KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) )
            // IdentifiersParser.g:466:5: KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN
            {
            KW_PARTITION238=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_dropPartitionSpec3143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION238);


            LPAREN239=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dropPartitionSpec3150); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN239);


            pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3152);
            dropPartitionVal240=dropPartitionVal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal240.getTree());

            // IdentifiersParser.g:467:30: ( COMMA dropPartitionVal )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // IdentifiersParser.g:467:31: COMMA dropPartitionVal
            	    {
            	    COMMA241=(Token)match(input,COMMA,FOLLOW_COMMA_in_dropPartitionSpec3155); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA241);


            	    pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3158);
            	    dropPartitionVal242=dropPartitionVal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal242.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dropPartitionSpec3163); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN243);


            // AST REWRITE
            // elements: dropPartitionVal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 467:65: -> ^( TOK_PARTSPEC ( dropPartitionVal )+ )
            {
                // IdentifiersParser.g:467:68: ^( TOK_PARTSPEC ( dropPartitionVal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC")
                , root_1);

                if ( !(stream_dropPartitionVal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dropPartitionVal.hasNext() ) {
                    adaptor.addChild(root_1, stream_dropPartitionVal.nextTree());

                }
                stream_dropPartitionVal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionSpec"


    public static class dropPartitionVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionVal"
    // IdentifiersParser.g:470:1: dropPartitionVal : identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) ;
    public final HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionVal_return retval = new HiveParser_IdentifiersParser.dropPartitionVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier244 =null;

        HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator245 =null;

        HiveParser_IdentifiersParser.constant_return constant246 =null;


        RewriteRuleSubtreeStream stream_dropPartitionOperator=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionOperator");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // IdentifiersParser.g:471:5: ( identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) )
            // IdentifiersParser.g:472:5: identifier dropPartitionOperator constant
            {
            pushFollow(FOLLOW_identifier_in_dropPartitionVal3194);
            identifier244=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier244.getTree());

            pushFollow(FOLLOW_dropPartitionOperator_in_dropPartitionVal3196);
            dropPartitionOperator245=dropPartitionOperator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dropPartitionOperator.add(dropPartitionOperator245.getTree());

            pushFollow(FOLLOW_constant_in_dropPartitionVal3198);
            constant246=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant.add(constant246.getTree());

            // AST REWRITE
            // elements: dropPartitionOperator, identifier, constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 472:47: -> ^( TOK_PARTVAL identifier dropPartitionOperator constant )
            {
                // IdentifiersParser.g:472:50: ^( TOK_PARTVAL identifier dropPartitionOperator constant )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_dropPartitionOperator.nextTree());

                adaptor.addChild(root_1, stream_constant.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionVal"


    public static class dropPartitionOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPartitionOperator"
    // IdentifiersParser.g:475:1: dropPartitionOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
    public final HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator() throws RecognitionException {
        HiveParser_IdentifiersParser.dropPartitionOperator_return retval = new HiveParser_IdentifiersParser.dropPartitionOperator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set247=null;

        CommonTree set247_tree=null;

        try {
            // IdentifiersParser.g:476:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set247=(Token)input.LT(1);

            if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set247)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropPartitionOperator"


    public static class sysFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sysFuncNames"
    // IdentifiersParser.g:480:1: sysFuncNames : ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN );
    public final HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.sysFuncNames_return retval = new HiveParser_IdentifiersParser.sysFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set248=null;

        CommonTree set248_tree=null;

        try {
            // IdentifiersParser.g:481:5: ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set248=(Token)input.LT(1);

            if ( (input.LA(1) >= AMPERSAND && input.LA(1) <= BITWISEXOR)||(input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||(input.LA(1) >= EQUAL && input.LA(1) <= EQUAL_NS)||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_AND||input.LA(1)==KW_ARRAY||(input.LA(1) >= KW_BETWEEN && input.LA(1) <= KW_BOOLEAN)||input.LA(1)==KW_CASE||input.LA(1)==KW_DOUBLE||input.LA(1)==KW_FLOAT||input.LA(1)==KW_IF||input.LA(1)==KW_IN||input.LA(1)==KW_INT||input.LA(1)==KW_LIKE||input.LA(1)==KW_MAP||input.LA(1)==KW_NOT||input.LA(1)==KW_OR||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE||input.LA(1)==KW_SMALLINT||(input.LA(1) >= KW_STRING && input.LA(1) <= KW_STRUCT)||input.LA(1)==KW_TINYINT||input.LA(1)==KW_UNIONTYPE||input.LA(1)==KW_WHEN||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||(input.LA(1) >= MINUS && input.LA(1) <= NOTEQUAL)||input.LA(1)==PLUS||input.LA(1)==STAR||input.LA(1)==TILDE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set248)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sysFuncNames"


    public static class descFuncNames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "descFuncNames"
    // IdentifiersParser.g:525:1: descFuncNames : ( sysFuncNames | StringLiteral | functionIdentifier );
    public final HiveParser_IdentifiersParser.descFuncNames_return descFuncNames() throws RecognitionException {
        HiveParser_IdentifiersParser.descFuncNames_return retval = new HiveParser_IdentifiersParser.descFuncNames_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral250=null;
        HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames249 =null;

        HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier251 =null;


        CommonTree StringLiteral250_tree=null;

        try {
            // IdentifiersParser.g:526:5: ( sysFuncNames | StringLiteral | functionIdentifier )
            int alt54=3;
            switch ( input.LA(1) ) {
            case AMPERSAND:
            case BITWISEOR:
            case BITWISEXOR:
            case DIV:
            case DIVIDE:
            case EQUAL:
            case EQUAL_NS:
            case GREATERTHAN:
            case GREATERTHANOREQUALTO:
            case KW_AND:
            case KW_ARRAY:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_CASE:
            case KW_DOUBLE:
            case KW_FLOAT:
            case KW_IF:
            case KW_IN:
            case KW_INT:
            case KW_LIKE:
            case KW_MAP:
            case KW_NOT:
            case KW_OR:
            case KW_REGEXP:
            case KW_RLIKE:
            case KW_SMALLINT:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TINYINT:
            case KW_UNIONTYPE:
            case KW_WHEN:
            case LESSTHAN:
            case LESSTHANOREQUALTO:
            case MINUS:
            case MOD:
            case NOTEQUAL:
            case PLUS:
            case STAR:
            case TILDE:
                {
                alt54=1;
                }
                break;
            case StringLiteral:
                {
                alt54=2;
                }
                break;
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // IdentifiersParser.g:527:7: sysFuncNames
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sysFuncNames_in_descFuncNames3617);
                    sysFuncNames249=sysFuncNames();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sysFuncNames249.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:528:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral250=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_descFuncNames3625); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral250_tree = 
                    (CommonTree)adaptor.create(StringLiteral250)
                    ;
                    adaptor.addChild(root_0, StringLiteral250_tree);
                    }

                    }
                    break;
                case 3 :
                    // IdentifiersParser.g:529:7: functionIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionIdentifier_in_descFuncNames3633);
                    functionIdentifier251=functionIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionIdentifier251.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "descFuncNames"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // IdentifiersParser.g:532:1: identifier : ( Identifier | nonReserved -> Identifier[$nonReserved.text] );
    public final HiveParser_IdentifiersParser.identifier_return identifier() throws RecognitionException {
        HiveParser_IdentifiersParser.identifier_return retval = new HiveParser_IdentifiersParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier252=null;
        HiveParser_IdentifiersParser.nonReserved_return nonReserved253 =null;


        CommonTree Identifier252_tree=null;
        RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");
        try {
            // IdentifiersParser.g:533:5: ( Identifier | nonReserved -> Identifier[$nonReserved.text] )
            int alt55=2;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt55=1;
                }
                break;
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt55=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // IdentifiersParser.g:534:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier252=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier3654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier252_tree = 
                    (CommonTree)adaptor.create(Identifier252)
                    ;
                    adaptor.addChild(root_0, Identifier252_tree);
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:535:7: nonReserved
                    {
                    pushFollow(FOLLOW_nonReserved_in_identifier3662);
                    nonReserved253=nonReserved();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved253.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:19: -> Identifier[$nonReserved.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(Identifier, (nonReserved253!=null?input.toString(nonReserved253.start,nonReserved253.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class functionIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionIdentifier"
    // IdentifiersParser.g:538:1: functionIdentifier : (db= identifier DOT fn= identifier -> Identifier[$db.text + \".\" + $fn.text] | identifier );
    public final HiveParser_IdentifiersParser.functionIdentifier_return functionIdentifier() throws RecognitionException {
        HiveParser_IdentifiersParser.functionIdentifier_return retval = new HiveParser_IdentifiersParser.functionIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT254=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return fn =null;

        HiveParser_IdentifiersParser.identifier_return identifier255 =null;


        CommonTree DOT254_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("function identifier", state); 
        try {
            // IdentifiersParser.g:541:5: (db= identifier DOT fn= identifier -> Identifier[$db.text + \".\" + $fn.text] | identifier )
            int alt56=2;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt56=1;
                    }
                    break;
                case EOF:
                case KW_AS:
                case LPAREN:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt56=1;
                    }
                    break;
                case EOF:
                case KW_AS:
                case LPAREN:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // IdentifiersParser.g:541:7: db= identifier DOT fn= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_functionIdentifier3696);
                    db=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT254=(Token)match(input,DOT,FOLLOW_DOT_in_functionIdentifier3698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT254);


                    pushFollow(FOLLOW_identifier_in_functionIdentifier3702);
                    fn=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(fn.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 542:5: -> Identifier[$db.text + \".\" + $fn.text]
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(Identifier, (db!=null?input.toString(db.start,db.stop):null) + "." + (fn!=null?input.toString(fn.start,fn.stop):null))
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:544:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_functionIdentifier3723);
                    identifier255=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier255.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionIdentifier"


    public static class principalIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "principalIdentifier"
    // IdentifiersParser.g:547:1: principalIdentifier : ( identifier | QuotedIdentifier );
    public final HiveParser_IdentifiersParser.principalIdentifier_return principalIdentifier() throws RecognitionException {
        HiveParser_IdentifiersParser.principalIdentifier_return retval = new HiveParser_IdentifiersParser.principalIdentifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token QuotedIdentifier257=null;
        HiveParser_IdentifiersParser.identifier_return identifier256 =null;


        CommonTree QuotedIdentifier257_tree=null;

         gParent.pushMsg("identifier for principal spec", state); 
        try {
            // IdentifiersParser.g:550:5: ( identifier | QuotedIdentifier )
            int alt57=2;
            switch ( input.LA(1) ) {
            case Identifier:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALL:
            case KW_ALTER:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ARRAY:
            case KW_AS:
            case KW_ASC:
            case KW_AUTHORIZATION:
            case KW_BEFORE:
            case KW_BETWEEN:
            case KW_BIGINT:
            case KW_BINARY:
            case KW_BOOLEAN:
            case KW_BOTH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_BY:
            case KW_CASCADE:
            case KW_CHANGE:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_CREATE:
            case KW_CUBE:
            case KW_CURSOR:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATE:
            case KW_DATETIME:
            case KW_DBPROPERTIES:
            case KW_DECIMAL:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELETE:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DESCRIBE:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DOUBLE:
            case KW_DROP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ESCAPED:
            case KW_EXCLUSIVE:
            case KW_EXISTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXTERNAL:
            case KW_FALSE:
            case KW_FETCH:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FLOAT:
            case KW_FOR:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FULL:
            case KW_FUNCTIONS:
            case KW_GRANT:
            case KW_GROUP:
            case KW_GROUPING:
            case KW_HOLD_DDLTIME:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_IMPORT:
            case KW_IN:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INNER:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_INSERT:
            case KW_INT:
            case KW_INTERSECT:
            case KW_INTO:
            case KW_IS:
            case KW_ITEMS:
            case KW_JAR:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_LATERAL:
            case KW_LEFT:
            case KW_LIKE:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCAL:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MAPJOIN:
            case KW_MATERIALIZED:
            case KW_MINUS:
            case KW_MSCK:
            case KW_NONE:
            case KW_NOSCAN:
            case KW_NO_DROP:
            case KW_NULL:
            case KW_OF:
            case KW_OFFLINE:
            case KW_OPTION:
            case KW_ORDER:
            case KW_OUT:
            case KW_OUTER:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITION:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PERCENT:
            case KW_PLUS:
            case KW_PRETTY:
            case KW_PRINCIPALS:
            case KW_PROCEDURE:
            case KW_PROTECTION:
            case KW_PURGE:
            case KW_RANGE:
            case KW_READ:
            case KW_READONLY:
            case KW_READS:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_REGEXP:
            case KW_RENAME:
            case KW_REPAIR:
            case KW_REPLACE:
            case KW_RESTRICT:
            case KW_REVOKE:
            case KW_REWRITE:
            case KW_RIGHT:
            case KW_RLIKE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_ROLLUP:
            case KW_ROW:
            case KW_ROWS:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SET:
            case KW_SETS:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SMALLINT:
            case KW_SORT:
            case KW_SORTED:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_TABLE:
            case KW_TABLES:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TIMESTAMP:
            case KW_TINYINT:
            case KW_TO:
            case KW_TOUCH:
            case KW_TRANSACTIONS:
            case KW_TRIGGER:
            case KW_TRUE:
            case KW_TRUNCATE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNION:
            case KW_UNIONTYPE:
            case KW_UNLOCK:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_UPDATE:
            case KW_URI:
            case KW_USE:
            case KW_USER:
            case KW_USING:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALUES:
            case KW_VALUE_TYPE:
            case KW_VIEW:
            case KW_WHILE:
            case KW_WITH:
                {
                alt57=1;
                }
                break;
            case QuotedIdentifier:
                {
                alt57=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // IdentifiersParser.g:550:7: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_principalIdentifier3750);
                    identifier256=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier256.getTree());

                    }
                    break;
                case 2 :
                    // IdentifiersParser.g:551:7: QuotedIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    QuotedIdentifier257=(Token)match(input,QuotedIdentifier,FOLLOW_QuotedIdentifier_in_principalIdentifier3758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QuotedIdentifier257_tree = 
                    (CommonTree)adaptor.create(QuotedIdentifier257)
                    ;
                    adaptor.addChild(root_0, QuotedIdentifier257_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "principalIdentifier"


    public static class nonReserved_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonReserved"
    // IdentifiersParser.g:554:1: nonReserved : ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_DEFINED | KW_ADMIN | KW_JAR | KW_FILE | KW_OWNER | KW_PRINCIPALS | KW_ALL | KW_DEFAULT | KW_NONE | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_REWRITE | KW_AUTHORIZATION | KW_VALUES | KW_URI | KW_SERVER );
    public final HiveParser_IdentifiersParser.nonReserved_return nonReserved() throws RecognitionException {
        HiveParser_IdentifiersParser.nonReserved_return retval = new HiveParser_IdentifiersParser.nonReserved_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set258=null;

        CommonTree set258_tree=null;

        try {
            // IdentifiersParser.g:555:5: ( KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_DEFINED | KW_ADMIN | KW_JAR | KW_FILE | KW_OWNER | KW_PRINCIPALS | KW_ALL | KW_DEFAULT | KW_NONE | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_REWRITE | KW_AUTHORIZATION | KW_VALUES | KW_URI | KW_SERVER )
            // IdentifiersParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set258=(Token)input.LT(1);

            if ( (input.LA(1) >= KW_ADD && input.LA(1) <= KW_ANALYZE)||(input.LA(1) >= KW_ARCHIVE && input.LA(1) <= KW_CASCADE)||input.LA(1)==KW_CHANGE||(input.LA(1) >= KW_CLUSTER && input.LA(1) <= KW_COLLECTION)||(input.LA(1) >= KW_COLUMNS && input.LA(1) <= KW_CONCATENATE)||(input.LA(1) >= KW_CONTINUE && input.LA(1) <= KW_CREATE)||input.LA(1)==KW_CUBE||(input.LA(1) >= KW_CURSOR && input.LA(1) <= KW_DATA)||(input.LA(1) >= KW_DATABASES && input.LA(1) <= KW_DISABLE)||(input.LA(1) >= KW_DISTRIBUTE && input.LA(1) <= KW_ELEM_TYPE)||input.LA(1)==KW_ENABLE||input.LA(1)==KW_ESCAPED||(input.LA(1) >= KW_EXCLUSIVE && input.LA(1) <= KW_EXPORT)||(input.LA(1) >= KW_EXTERNAL && input.LA(1) <= KW_FLOAT)||(input.LA(1) >= KW_FOR && input.LA(1) <= KW_FORMATTED)||input.LA(1)==KW_FULL||(input.LA(1) >= KW_FUNCTIONS && input.LA(1) <= KW_GROUPING)||(input.LA(1) >= KW_HOLD_DDLTIME && input.LA(1) <= KW_IDXPROPERTIES)||(input.LA(1) >= KW_IGNORE && input.LA(1) <= KW_JAR)||(input.LA(1) >= KW_KEYS && input.LA(1) <= KW_LEFT)||(input.LA(1) >= KW_LIKE && input.LA(1) <= KW_LONG)||(input.LA(1) >= KW_MAPJOIN && input.LA(1) <= KW_MINUS)||(input.LA(1) >= KW_MSCK && input.LA(1) <= KW_NOSCAN)||(input.LA(1) >= KW_NO_DROP && input.LA(1) <= KW_OFFLINE)||input.LA(1)==KW_OPTION||(input.LA(1) >= KW_ORDER && input.LA(1) <= KW_OUTPUTFORMAT)||(input.LA(1) >= KW_OVERWRITE && input.LA(1) <= KW_OWNER)||(input.LA(1) >= KW_PARTITION && input.LA(1) <= KW_PLUS)||(input.LA(1) >= KW_PRETTY && input.LA(1) <= KW_RECORDWRITER)||(input.LA(1) >= KW_REGEXP && input.LA(1) <= KW_SCHEMAS)||(input.LA(1) >= KW_SEMI && input.LA(1) <= KW_TABLES)||(input.LA(1) >= KW_TBLPROPERTIES && input.LA(1) <= KW_TERMINATED)||(input.LA(1) >= KW_TIMESTAMP && input.LA(1) <= KW_TRANSACTIONS)||(input.LA(1) >= KW_TRIGGER && input.LA(1) <= KW_UNARCHIVE)||(input.LA(1) >= KW_UNDO && input.LA(1) <= KW_UNIONTYPE)||(input.LA(1) >= KW_UNLOCK && input.LA(1) <= KW_VALUE_TYPE)||input.LA(1)==KW_VIEW||input.LA(1)==KW_WHILE||input.LA(1)==KW_WITH ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set258)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonReserved"

    // $ANTLR start synpred1_IdentifiersParser
    public final void synpred1_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:121:7: ( COMMA )
        // IdentifiersParser.g:121:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred1_IdentifiersParser563); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IdentifiersParser

    // $ANTLR start synpred2_IdentifiersParser
    public final void synpred2_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:132:17: ( COMMA )
        // IdentifiersParser.g:132:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred2_IdentifiersParser664); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_IdentifiersParser

    // $ANTLR start synpred3_IdentifiersParser
    public final void synpred3_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:143:17: ( COMMA )
        // IdentifiersParser.g:143:18: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred3_IdentifiersParser764); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_IdentifiersParser

    // $ANTLR start synpred4_IdentifiersParser
    public final void synpred4_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:156:7: ( COMMA )
        // IdentifiersParser.g:156:8: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred4_IdentifiersParser874); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_IdentifiersParser

    // $ANTLR start synpred5_IdentifiersParser
    public final void synpred5_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:276:7: ( functionName LPAREN )
        // IdentifiersParser.g:276:8: functionName LPAREN
        {
        pushFollow(FOLLOW_functionName_in_synpred5_IdentifiersParser1748);
        functionName();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred5_IdentifiersParser1750); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_IdentifiersParser

    // $ANTLR start synpred6_IdentifiersParser
    public final void synpred6_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:389:7: ( KW_NOT KW_IN LPAREN KW_SELECT )
        // IdentifiersParser.g:389:8: KW_NOT KW_IN LPAREN KW_SELECT
        {
        match(input,KW_NOT,FOLLOW_KW_NOT_in_synpred6_IdentifiersParser2472); if (state.failed) return ;

        match(input,KW_IN,FOLLOW_KW_IN_in_synpred6_IdentifiersParser2474); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_IdentifiersParser2476); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred6_IdentifiersParser2478); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_IdentifiersParser

    // $ANTLR start synpred7_IdentifiersParser
    public final void synpred7_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:393:7: ( KW_IN LPAREN KW_SELECT )
        // IdentifiersParser.g:393:8: KW_IN LPAREN KW_SELECT
        {
        match(input,KW_IN,FOLLOW_KW_IN_in_synpred7_IdentifiersParser2565); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred7_IdentifiersParser2567); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred7_IdentifiersParser2569); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_IdentifiersParser

    // $ANTLR start synpred8_IdentifiersParser
    public final void synpred8_IdentifiersParser_fragment() throws RecognitionException {
        // IdentifiersParser.g:402:7: ( KW_EXISTS LPAREN KW_SELECT )
        // IdentifiersParser.g:402:8: KW_EXISTS LPAREN KW_SELECT
        {
        match(input,KW_EXISTS,FOLLOW_KW_EXISTS_in_synpred8_IdentifiersParser2759); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred8_IdentifiersParser2761); if (state.failed) return ;

        match(input,KW_SELECT,FOLLOW_KW_SELECT_in_synpred8_IdentifiersParser2763); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_IdentifiersParser

    // Delegated rules

    public final boolean synpred4_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_IdentifiersParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_IdentifiersParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA6_eotS =
        "\u023b\uffff";
    static final String DFA6_eofS =
        "\u023b\uffff";
    static final String DFA6_minS =
        "\1\7\27\uffff\1\7\2\uffff\2\7\11\4\1\14\2\4\1\u011d\1\7\1\u011d"+
        "\1\4\1\u011d\4\4\1\7\1\4\u0207\uffff";
    static final String DFA6_maxS =
        "\1\u0130\27\uffff\1\u0130\2\uffff\2\u0130\2\u012c\3\u012e\4\u012c"+
        "\1\14\2\u012c\1\u011d\1\u0130\1\u011d\1\u012c\1\u011d\4\u012c\1"+
        "\u0130\1\u012c\u0207\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\30\uffff\1\3\31\uffff\107\1\1\uffff\1\2\26\1\1\uffff"+
        "\3\1\1\uffff\25\1\1\uffff\3\1\1\uffff\25\1\1\uffff\27\1\1\uffff"+
        "\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\30\1\2\uffff"+
        "\27\1\2\uffff\36\1\1\uffff\25\1\1\uffff\3\1\1\uffff\25\1\1\uffff"+
        "\2\1\1\uffff\25\1\1\uffff\2\1\1\uffff\25\1\1\uffff\2\1\1\uffff\25"+
        "\1\1\uffff\33\1\1\uffff\25\1\1\uffff";
    static final String DFA6_specialS =
        "\u023b\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\22\1\1\uffff"+
            "\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff"+
            "\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
            "\5\1\1\uffff\2\1\1\uffff\5\1\2\uffff\14\1\1\uffff\20\1\1\uffff"+
            "\25\1\1\uffff\3\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\14\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\30\2\uffff"+
            "\1\1\2\uffff\2\1\10\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\5\uffff\1\46\4\uffff\1\45\7\uffff\1\60\6\63\1\uffff\1"+
            "\63\1\54\15\63\1\52\1\51\1\63\1\uffff\4\63\1\uffff\6\63\1\uffff"+
            "\2\63\1\uffff\1\63\1\uffff\2\63\1\uffff\1\63\1\37\16\63\1\uffff"+
            "\4\63\1\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\61\2\63\1\uffff"+
            "\1\63\1\50\6\63\1\uffff\3\63\1\uffff\1\63\1\uffff\4\63\1\uffff"+
            "\2\63\1\53\20\63\1\uffff\4\63\1\uffff\12\63\1\uffff\1\55\3\63"+
            "\1\uffff\3\63\1\33\1\63\1\35\2\63\1\uffff\1\63\1\uffff\5\63"+
            "\1\uffff\2\63\1\uffff\5\63\2\uffff\14\63\1\uffff\20\63\1\uffff"+
            "\22\63\1\56\2\63\1\uffff\3\63\1\uffff\1\40\4\63\1\uffff\1\63"+
            "\1\47\2\63\1\uffff\2\63\1\57\1\uffff\14\63\1\uffff\1\63\2\uffff"+
            "\1\63\1\uffff\1\63\3\uffff\1\62\2\uffff\1\34\2\uffff\1\36\1"+
            "\34\3\uffff\1\32\4\uffff\1\43\1\41\1\34\1\44",
            "",
            "",
            "\1\72\5\uffff\1\76\4\uffff\1\75\7\uffff\1\110\6\113\1\uffff"+
            "\1\113\1\104\15\113\1\102\1\101\1\113\1\uffff\4\113\1\uffff"+
            "\6\113\1\uffff\2\113\1\uffff\1\113\1\uffff\2\113\1\uffff\1\113"+
            "\1\67\16\113\1\uffff\4\113\1\uffff\1\113\1\uffff\1\113\1\uffff"+
            "\1\113\1\111\2\113\1\uffff\1\113\1\100\6\113\1\uffff\3\113\1"+
            "\uffff\1\113\1\uffff\4\113\1\uffff\2\113\1\103\20\113\1\uffff"+
            "\4\113\1\uffff\12\113\1\uffff\1\105\3\113\1\uffff\3\113\1\114"+
            "\1\113\1\65\2\113\1\uffff\1\113\1\uffff\5\113\1\uffff\2\113"+
            "\1\uffff\5\113\2\uffff\14\113\1\uffff\20\113\1\uffff\22\113"+
            "\1\106\2\113\1\uffff\3\113\1\uffff\1\70\4\113\1\uffff\1\113"+
            "\1\77\2\113\1\uffff\2\113\1\107\1\uffff\14\113\1\uffff\1\113"+
            "\2\uffff\1\113\1\uffff\1\113\3\uffff\1\112\2\uffff\1\64\2\uffff"+
            "\1\66\1\64\10\uffff\1\73\1\71\1\64\1\74",
            "\1\122\5\uffff\1\126\4\uffff\1\125\7\uffff\1\140\6\141\1\uffff"+
            "\1\141\1\134\15\141\1\132\1\131\1\141\1\uffff\4\141\1\uffff"+
            "\6\141\1\uffff\2\141\1\uffff\1\141\1\uffff\2\141\1\uffff\1\141"+
            "\1\117\16\141\1\uffff\4\141\1\uffff\1\141\1\uffff\1\141\1\uffff"+
            "\4\141\1\uffff\1\141\1\130\6\141\1\uffff\3\141\1\uffff\1\141"+
            "\1\uffff\4\141\1\uffff\2\141\1\133\20\141\1\uffff\4\141\1\uffff"+
            "\12\141\1\uffff\1\135\3\141\1\uffff\3\141\1\uffff\1\141\1\115"+
            "\2\141\1\uffff\1\141\1\uffff\5\141\1\uffff\2\141\1\uffff\5\141"+
            "\2\uffff\14\141\1\uffff\20\141\1\uffff\22\141\1\136\2\141\1"+
            "\uffff\3\141\1\uffff\1\120\4\141\1\uffff\1\141\1\127\2\141\1"+
            "\uffff\2\141\1\137\1\uffff\14\141\1\uffff\1\141\2\uffff\1\141"+
            "\1\uffff\1\141\3\uffff\1\142\2\uffff\1\143\2\uffff\1\116\1\143"+
            "\10\uffff\1\123\1\121\1\143\1\124",
            "\1\152\1\153\1\147\3\uffff\1\174\3\uffff\2\150\1\uffff\1\145"+
            "\2\uffff\1\156\1\157\1\uffff\1\164\1\163\10\uffff\1\167\6\uffff"+
            "\1\166\130\uffff\1\165\12\uffff\1\146\10\uffff\1\155\22\uffff"+
            "\1\154\6\uffff\1\170\35\uffff\1\155\7\uffff\1\155\105\uffff"+
            "\1\162\1\161\1\172\1\144\1\uffff\1\151\1\150\1\160\1\uffff\1"+
            "\151\3\uffff\1\171\3\uffff\1\150",
            "\1\u0083\1\u0084\1\u0080\3\uffff\1\174\3\uffff\2\u0081\1\uffff"+
            "\1\176\2\uffff\1\u0087\1\u0088\1\uffff\1\u008d\1\u008c\10\uffff"+
            "\1\u0090\6\uffff\1\u008f\130\uffff\1\u008e\12\uffff\1\177\10"+
            "\uffff\1\u0086\22\uffff\1\u0085\6\uffff\1\u0091\35\uffff\1\u0086"+
            "\7\uffff\1\u0086\105\uffff\1\u008b\1\u008a\1\uffff\1\175\1\uffff"+
            "\1\u0082\1\u0081\1\u0089\1\uffff\1\u0082\3\uffff\1\u0092\3\uffff"+
            "\1\u0081",
            "\1\u009d\1\u009e\1\u009a\3\uffff\1\174\3\uffff\2\u009b\1\uffff"+
            "\1\u0095\2\uffff\1\u00a1\1\u00a2\1\uffff\1\u00a7\1\u00a6\10"+
            "\uffff\1\u00aa\6\uffff\1\u00a9\130\uffff\1\u00a8\12\uffff\1"+
            "\u0099\10\uffff\1\u00a0\22\uffff\1\u009f\6\uffff\1\u00ab\35"+
            "\uffff\1\u00a0\7\uffff\1\u00a0\105\uffff\1\u00a5\1\u00a4\1\u0096"+
            "\1\u0098\1\uffff\1\u009c\1\u009b\1\u00a3\1\uffff\1\u009c\3\uffff"+
            "\1\u00ac\3\uffff\1\u009b\1\uffff\1\u0094",
            "\1\u00b7\1\u00b8\1\u00b4\3\uffff\1\174\3\uffff\2\u00b5\1\uffff"+
            "\1\u00af\2\uffff\1\u00bb\1\u00bc\1\uffff\1\u00c1\1\u00c0\10"+
            "\uffff\1\u00c4\6\uffff\1\u00c3\130\uffff\1\u00c2\12\uffff\1"+
            "\u00b3\10\uffff\1\u00ba\22\uffff\1\u00b9\6\uffff\1\u00c5\35"+
            "\uffff\1\u00ba\7\uffff\1\u00ba\105\uffff\1\u00bf\1\u00be\1\u00b0"+
            "\1\u00b2\1\uffff\1\u00b6\1\u00b5\1\u00bd\1\uffff\1\u00b6\3\uffff"+
            "\1\u00c6\3\uffff\1\u00b5\1\uffff\1\u00ae",
            "\1\u00ce\1\u00cf\1\u00cb\3\uffff\1\174\3\uffff\2\u00cc\1\uffff"+
            "\1\u00c9\2\uffff\1\u00d2\1\u00d3\1\uffff\1\u00d8\1\u00d7\10"+
            "\uffff\1\u00db\6\uffff\1\u00da\130\uffff\1\u00d9\12\uffff\1"+
            "\u00ca\10\uffff\1\u00d1\22\uffff\1\u00d0\6\uffff\1\u00dc\35"+
            "\uffff\1\u00d1\7\uffff\1\u00d1\105\uffff\1\u00d6\1\u00d5\1\uffff"+
            "\1\u00c8\1\uffff\1\u00cd\1\u00cc\1\u00d4\1\uffff\1\u00cd\3\uffff"+
            "\1\u00dd\3\uffff\1\u00cc\1\uffff\1\u00de",
            "\1\u00e6\1\u00e7\1\u00e3\3\uffff\1\174\3\uffff\2\u00e4\1\uffff"+
            "\1\u00e1\2\uffff\1\u00ea\1\u00eb\1\uffff\1\u00f0\1\u00ef\10"+
            "\uffff\1\u00f3\6\uffff\1\u00f2\130\uffff\1\u00f1\12\uffff\1"+
            "\u00e2\10\uffff\1\u00e9\22\uffff\1\u00e8\6\uffff\1\u00f4\35"+
            "\uffff\1\u00e9\7\uffff\1\u00e9\105\uffff\1\u00ee\1\u00ed\1\uffff"+
            "\1\u00e0\1\uffff\1\u00e5\1\u00e4\1\u00ec\1\uffff\1\u00e5\3\uffff"+
            "\1\u00f5\3\uffff\1\u00e4",
            "\1\u00fd\1\u00fe\1\u00fa\3\uffff\1\174\3\uffff\2\u00fb\1\uffff"+
            "\1\u00f8\2\uffff\1\u0101\1\u0102\1\uffff\1\u0107\1\u0106\10"+
            "\uffff\1\u010a\6\uffff\1\u0109\130\uffff\1\u0108\12\uffff\1"+
            "\u00f9\10\uffff\1\u0100\22\uffff\1\u00ff\6\uffff\1\u010b\35"+
            "\uffff\1\u0100\7\uffff\1\u0100\105\uffff\1\u0105\1\u0104\1\uffff"+
            "\1\u00f7\1\uffff\1\u00fc\1\u00fb\1\u0103\1\uffff\1\u00fc\3\uffff"+
            "\1\u010c\3\uffff\1\u00fb",
            "\1\u0114\1\u0115\1\u0111\3\uffff\1\174\3\uffff\2\u0112\1\uffff"+
            "\1\u010f\2\uffff\1\u0118\1\u0119\1\uffff\1\u011e\1\u011d\10"+
            "\uffff\1\u0121\6\uffff\1\u0120\130\uffff\1\u011f\12\uffff\1"+
            "\u0110\10\uffff\1\u0117\22\uffff\1\u0116\6\uffff\1\u0122\35"+
            "\uffff\1\u0117\7\uffff\1\u0117\105\uffff\1\u011c\1\u011b\1\uffff"+
            "\1\u010e\1\uffff\1\u0113\1\u0112\1\u011a\1\uffff\1\u0113\3\uffff"+
            "\1\u0123\3\uffff\1\u0112",
            "\1\u012b\1\u012c\1\u0128\3\uffff\1\174\3\uffff\2\u0129\1\uffff"+
            "\1\u0126\2\uffff\1\u012f\1\u0130\1\uffff\1\u0135\1\u0134\10"+
            "\uffff\1\u0138\6\uffff\1\u0137\130\uffff\1\u0136\12\uffff\1"+
            "\u0127\10\uffff\1\u012e\22\uffff\1\u012d\6\uffff\1\u0139\35"+
            "\uffff\1\u012e\7\uffff\1\u012e\105\uffff\1\u0133\1\u0132\1\uffff"+
            "\1\u0125\1\uffff\1\u012a\1\u0129\1\u0131\1\uffff\1\u012a\3\uffff"+
            "\1\u013a\3\uffff\1\u0129",
            "\1\u013c",
            "\1\u0143\1\u0144\1\u0140\3\uffff\1\174\3\uffff\2\u0141\1\uffff"+
            "\1\u013e\2\uffff\1\u0147\1\u0148\1\uffff\1\u014d\1\u014c\10"+
            "\uffff\1\u0150\6\uffff\1\u014f\130\uffff\1\u014e\12\uffff\1"+
            "\u013f\10\uffff\1\u0146\22\uffff\1\u0145\6\uffff\1\u0151\35"+
            "\uffff\1\u0146\7\uffff\1\u0146\105\uffff\1\u014b\1\u014a\1\u0153"+
            "\1\u013d\1\uffff\1\u0142\1\u0141\1\u0149\1\uffff\1\u0142\3\uffff"+
            "\1\u0152\3\uffff\1\u0141",
            "\1\u015c\1\u015d\1\u0159\3\uffff\1\174\3\uffff\2\u015a\1\uffff"+
            "\1\u0157\2\uffff\1\u0160\1\u0161\1\uffff\1\u0166\1\u0165\10"+
            "\uffff\1\u0169\6\uffff\1\u0168\130\uffff\1\u0167\12\uffff\1"+
            "\u0158\10\uffff\1\u015f\22\uffff\1\u015e\6\uffff\1\u016a\35"+
            "\uffff\1\u015f\7\uffff\1\u015f\105\uffff\1\u0164\1\u0163\1\u016c"+
            "\1\u0156\1\uffff\1\u015b\1\u015a\1\u0162\1\uffff\1\u015b\3\uffff"+
            "\1\u016b\3\uffff\1\u015a",
            "\1\u016f",
            "\1\u0177\5\uffff\1\u017b\4\uffff\1\u017a\7\uffff\1\u0185\6"+
            "\u0188\1\uffff\1\u0188\1\u0181\15\u0188\1\u017f\1\u017e\1\u0188"+
            "\1\uffff\4\u0188\1\uffff\6\u0188\1\uffff\2\u0188\1\uffff\1\u0188"+
            "\1\uffff\2\u0188\1\uffff\1\u0188\1\u0174\16\u0188\1\uffff\4"+
            "\u0188\1\uffff\1\u0188\1\uffff\1\u0188\1\uffff\1\u0188\1\u0186"+
            "\2\u0188\1\uffff\1\u0188\1\u017d\6\u0188\1\uffff\3\u0188\1\uffff"+
            "\1\u0188\1\uffff\4\u0188\1\uffff\2\u0188\1\u0180\20\u0188\1"+
            "\uffff\4\u0188\1\uffff\12\u0188\1\uffff\1\u0182\3\u0188\1\uffff"+
            "\3\u0188\1\u0170\1\u0188\1\u0172\2\u0188\1\uffff\1\u0188\1\uffff"+
            "\5\u0188\1\uffff\2\u0188\1\uffff\5\u0188\2\uffff\14\u0188\1"+
            "\uffff\20\u0188\1\uffff\22\u0188\1\u0183\2\u0188\1\uffff\3\u0188"+
            "\1\uffff\1\u0175\4\u0188\1\uffff\1\u0188\1\u017c\2\u0188\1\uffff"+
            "\2\u0188\1\u0184\1\uffff\14\u0188\1\uffff\1\u0188\1\u0189\1"+
            "\uffff\1\u0188\1\uffff\1\u0188\3\uffff\1\u0187\2\uffff\1\u0171"+
            "\2\uffff\1\u0173\1\u0171\10\uffff\1\u0178\1\u0176\1\u0171\1"+
            "\u0179",
            "\1\u018a",
            "\1\u0193\1\u0194\1\u0190\3\uffff\1\174\3\uffff\2\u0191\1\uffff"+
            "\1\u018c\2\uffff\1\u0197\1\u0198\1\uffff\1\u019d\1\u019c\10"+
            "\uffff\1\u01a0\6\uffff\1\u019f\130\uffff\1\u019e\12\uffff\1"+
            "\u018f\10\uffff\1\u0196\22\uffff\1\u0195\6\uffff\1\u01a1\35"+
            "\uffff\1\u0196\7\uffff\1\u0196\105\uffff\1\u019b\1\u019a\1\u018b"+
            "\1\u018e\1\uffff\1\u0192\1\u0191\1\u0199\1\uffff\1\u0192\3\uffff"+
            "\1\u01a2\3\uffff\1\u0191",
            "\1\u01a4",
            "\1\u01ad\1\u01ae\1\u01aa\3\uffff\1\174\3\uffff\2\u01ab\1\uffff"+
            "\1\u01a6\2\uffff\1\u01b1\1\u01b2\1\uffff\1\u01b7\1\u01b6\10"+
            "\uffff\1\u01ba\6\uffff\1\u01b9\130\uffff\1\u01b8\12\uffff\1"+
            "\u01a9\10\uffff\1\u01b0\22\uffff\1\u01af\6\uffff\1\u01bb\35"+
            "\uffff\1\u01b0\7\uffff\1\u01b0\105\uffff\1\u01b5\1\u01b4\1\u01a5"+
            "\1\u01a8\1\uffff\1\u01ac\1\u01ab\1\u01b3\1\uffff\1\u01ac\3\uffff"+
            "\1\u01bc\3\uffff\1\u01ab",
            "\1\u01c6\1\u01c7\1\u01c3\3\uffff\1\174\3\uffff\2\u01c4\1\uffff"+
            "\1\u01bf\2\uffff\1\u01ca\1\u01cb\1\uffff\1\u01d0\1\u01cf\10"+
            "\uffff\1\u01d3\6\uffff\1\u01d2\130\uffff\1\u01d1\12\uffff\1"+
            "\u01c2\10\uffff\1\u01c9\22\uffff\1\u01c8\6\uffff\1\u01d4\35"+
            "\uffff\1\u01c9\7\uffff\1\u01c9\105\uffff\1\u01ce\1\u01cd\1\u01be"+
            "\1\u01c1\1\uffff\1\u01c5\1\u01c4\1\u01cc\1\uffff\1\u01c5\3\uffff"+
            "\1\u01d5\3\uffff\1\u01c4",
            "\1\u01df\1\u01e0\1\u01dc\3\uffff\1\174\3\uffff\2\u01dd\1\uffff"+
            "\1\u01d7\2\uffff\1\u01e3\1\u01e4\1\uffff\1\u01e9\1\u01e8\10"+
            "\uffff\1\u01ec\6\uffff\1\u01eb\130\uffff\1\u01ea\12\uffff\1"+
            "\u01db\10\uffff\1\u01e2\22\uffff\1\u01e1\6\uffff\1\u01ed\35"+
            "\uffff\1\u01e2\7\uffff\1\u01e2\105\uffff\1\u01e7\1\u01e6\1\u01d8"+
            "\1\u01da\1\uffff\1\u01de\1\u01dd\1\u01e5\1\uffff\1\u01de\3\uffff"+
            "\1\u01ee\3\uffff\1\u01dd",
            "\1\u01f8\1\u01f9\1\u01f5\3\uffff\1\174\3\uffff\2\u01f6\1\uffff"+
            "\1\u01f0\2\uffff\1\u01fc\1\u01fd\1\uffff\1\u0202\1\u0201\10"+
            "\uffff\1\u0205\6\uffff\1\u0204\130\uffff\1\u0203\12\uffff\1"+
            "\u01f4\10\uffff\1\u01fb\22\uffff\1\u01fa\6\uffff\1\u0206\35"+
            "\uffff\1\u01fb\7\uffff\1\u01fb\105\uffff\1\u0200\1\u01ff\1\u01f1"+
            "\1\u01f3\1\uffff\1\u01f7\1\u01f6\1\u01fe\1\uffff\1\u01f7\3\uffff"+
            "\1\u0207\3\uffff\1\u01f6",
            "\1\u0210\5\uffff\1\u0214\4\uffff\1\u0213\7\uffff\1\u021e\6"+
            "\u0221\1\uffff\1\u0221\1\u021a\15\u0221\1\u0218\1\u0217\1\u0221"+
            "\1\uffff\4\u0221\1\uffff\6\u0221\1\uffff\2\u0221\1\uffff\1\u0221"+
            "\1\uffff\2\u0221\1\uffff\1\u0221\1\u020d\16\u0221\1\uffff\4"+
            "\u0221\1\uffff\1\u0221\1\uffff\1\u0221\1\uffff\1\u0221\1\u021f"+
            "\2\u0221\1\uffff\1\u0221\1\u0216\6\u0221\1\uffff\3\u0221\1\uffff"+
            "\1\u0221\1\uffff\4\u0221\1\uffff\2\u0221\1\u0219\20\u0221\1"+
            "\uffff\4\u0221\1\uffff\12\u0221\1\uffff\1\u021b\3\u0221\1\uffff"+
            "\3\u0221\1\u0209\1\u0221\1\u020b\2\u0221\1\uffff\1\u0221\1\uffff"+
            "\5\u0221\1\uffff\2\u0221\1\uffff\5\u0221\2\uffff\14\u0221\1"+
            "\uffff\20\u0221\1\uffff\22\u0221\1\u021c\2\u0221\1\uffff\3\u0221"+
            "\1\uffff\1\u020e\4\u0221\1\uffff\1\u0221\1\u0215\2\u0221\1\uffff"+
            "\2\u0221\1\u021d\1\uffff\14\u0221\1\uffff\1\u0221\2\uffff\1"+
            "\u0221\1\uffff\1\u0221\3\uffff\1\u0220\2\uffff\1\u020a\2\uffff"+
            "\1\u020c\1\u020a\10\uffff\1\u0211\1\u020f\1\u020a\1\u0212",
            "\1\u022a\1\u022b\1\u0227\3\uffff\1\174\3\uffff\2\u0228\1\uffff"+
            "\1\u0222\2\uffff\1\u022e\1\u022f\1\uffff\1\u0234\1\u0233\10"+
            "\uffff\1\u0237\6\uffff\1\u0236\130\uffff\1\u0235\12\uffff\1"+
            "\u0226\10\uffff\1\u022d\22\uffff\1\u022c\6\uffff\1\u0238\35"+
            "\uffff\1\u022d\7\uffff\1\u022d\105\uffff\1\u0232\1\u0231\1\u0223"+
            "\1\u0225\1\uffff\1\u0229\1\u0228\1\u0230\1\uffff\1\u0229\3\uffff"+
            "\1\u0239\3\uffff\1\u0228",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );";
        }
    }
    static final String DFA24_eotS =
        "\101\uffff";
    static final String DFA24_eofS =
        "\1\2\100\uffff";
    static final String DFA24_minS =
        "\1\4\100\uffff";
    static final String DFA24_maxS =
        "\1\u012c\100\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\2\76\uffff";
    static final String DFA24_specialS =
        "\101\uffff}>";
    static final String[] DFA24_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\27\2\2\uffff\1\2\1\uffff\4\2\1\uffff\6\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\20\2\1\uffff\10\2\1\uffff\4\2\1\uffff"+
            "\10\2\1\uffff\5\2\1\uffff\7\2\1\uffff\25\2\1\uffff\12\2\1\uffff"+
            "\4\2\1\uffff\10\2\1\uffff\7\2\1\1\2\2\1\uffff\5\2\2\uffff\63"+
            "\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\14\2\1\uffff"+
            "\6\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "170:12: ( KW_OVER ws= window_specification )?";
        }
    }
    static final String DFA30_eotS =
        "\114\uffff";
    static final String DFA30_eofS =
        "\4\uffff\1\14\107\uffff";
    static final String DFA30_minS =
        "\1\7\3\uffff\1\4\107\uffff";
    static final String DFA30_maxS =
        "\1\u0130\3\uffff\1\u012e\107\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\4\76\uffff\1\5";
    static final String DFA30_specialS =
        "\114\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\5\5\uffff\1\11\4\uffff\1\10\67\uffff\1\2\36\uffff\1\12\u008e"+
            "\uffff\1\3\6\uffff\1\12\43\uffff\1\1\11\uffff\1\6\1\4\1\uffff"+
            "\1\7",
            "",
            "",
            "",
            "\3\14\3\uffff\1\14\3\uffff\2\14\1\uffff\1\14\2\uffff\2\14\1"+
            "\uffff\2\14\1\uffff\27\14\2\uffff\1\14\1\uffff\4\14\1\uffff"+
            "\6\14\1\uffff\4\14\1\uffff\2\14\1\uffff\20\14\1\uffff\10\14"+
            "\1\uffff\4\14\1\uffff\10\14\1\uffff\5\14\1\uffff\7\14\1\uffff"+
            "\25\14\1\uffff\12\14\1\uffff\4\14\1\uffff\10\14\1\uffff\7\14"+
            "\1\uffff\2\14\1\uffff\5\14\2\uffff\63\14\1\uffff\11\14\1\uffff"+
            "\4\14\1\uffff\3\14\1\uffff\14\14\1\uffff\6\14\1\uffff\2\14\1"+
            "\uffff\1\14\1\uffff\3\14\1\uffff\1\14\3\uffff\2\14\2\uffff\1"+
            "\14\1\uffff\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "215:1: constant : ( Number | dateLiteral | timestampLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );";
        }
    }
    static final String DFA31_eotS =
        "\101\uffff";
    static final String DFA31_eofS =
        "\1\1\100\uffff";
    static final String DFA31_minS =
        "\1\4\100\uffff";
    static final String DFA31_maxS =
        "\1\u012e\100\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\76\uffff\1\1";
    static final String DFA31_specialS =
        "\101\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\27\1\2\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff"+
            "\63\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff"+
            "\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\1\1\3\uffff"+
            "\2\1\2\uffff\1\1\1\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()+ loopback of 234:19: ( StringLiteral )+";
        }
    }
    static final String DFA32_eotS =
        "\u02c7\uffff";
    static final String DFA32_eofS =
        "\1\uffff\1\27\1\uffff\2\132\6\uffff\2\2\3\uffff\1\132\1\uffff\4"+
        "\132\u02b1\uffff";
    static final String DFA32_minS =
        "\1\7\1\4\1\uffff\2\4\6\uffff\2\4\1\uffff\1\7\1\uffff\1\4\1\uffff"+
        "\4\4\2\uffff\1\32\77\uffff\1\32\100\uffff\1\32\100\uffff\1\32\77"+
        "\uffff\1\32\131\uffff\1\32\77\uffff\1\32\77\uffff\1\32\76\uffff"+
        "\1\32\77\uffff\1\32\77\uffff\24\0";
    static final String DFA32_maxS =
        "\1\u0130\1\u012c\1\uffff\2\u012e\6\uffff\2\u012c\1\uffff\1\u0130"+
        "\1\uffff\1\u012c\1\uffff\4\u012c\2\uffff\1\u0119\77\uffff\1\u0119"+
        "\100\uffff\1\u0119\100\uffff\1\u0119\77\uffff\1\u0119\131\uffff"+
        "\1\u0119\77\uffff\1\u0119\77\uffff\1\u0119\76\uffff\1\u0119\77\uffff"+
        "\1\u0119\77\uffff\24\0";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\12\uffff\1\3\1\uffff\1\6\1\uffff\1\6\4\uffff\1\10\1"+
        "\1\76\uffff\1\6\2\uffff\1\6\1\7\77\uffff\1\6\175\uffff\1\6\77\uffff"+
        "\1\6\1\4\30\uffff\1\5\1\6\77\uffff\1\6\77\uffff\1\6\100\uffff\1"+
        "\6\77\uffff\1\6\122\uffff";
    static final String DFA32_specialS =
        "\1\0\1\1\1\uffff\1\2\1\3\6\uffff\1\4\1\5\3\uffff\1\6\1\uffff\1\7"+
        "\1\10\1\11\1\12\u029d\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
        "\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36}>";
    static final String[] DFA32_transitionS = {
            "\1\2\5\uffff\1\2\4\uffff\1\2\7\uffff\1\24\6\25\1\uffff\1\25"+
            "\1\20\15\25\1\16\1\15\1\25\1\uffff\4\25\1\uffff\6\25\1\uffff"+
            "\2\25\1\uffff\1\25\1\uffff\2\25\1\uffff\1\25\1\3\16\25\1\uffff"+
            "\4\25\1\uffff\1\25\1\uffff\1\25\1\uffff\4\25\1\uffff\1\25\1"+
            "\14\6\25\1\uffff\3\25\1\uffff\1\25\1\uffff\4\25\1\uffff\2\25"+
            "\1\17\20\25\1\uffff\4\25\1\uffff\12\25\1\uffff\1\21\3\25\1\uffff"+
            "\3\25\1\uffff\1\25\1\1\2\25\1\uffff\1\25\1\uffff\5\25\1\uffff"+
            "\2\25\1\uffff\5\25\2\uffff\14\25\1\uffff\20\25\1\uffff\22\25"+
            "\1\22\2\25\1\uffff\3\25\1\uffff\1\4\4\25\1\uffff\1\25\1\13\2"+
            "\25\1\uffff\2\25\1\23\1\uffff\14\25\1\uffff\1\25\2\uffff\1\25"+
            "\1\uffff\1\25\3\uffff\1\26\5\uffff\1\2\11\uffff\2\2\1\uffff"+
            "\1\2",
            "\3\27\3\uffff\1\27\3\uffff\2\27\1\uffff\1\30\2\uffff\2\27\1"+
            "\uffff\2\27\1\uffff\27\27\2\uffff\1\27\1\uffff\4\27\1\uffff"+
            "\6\27\1\uffff\4\27\1\uffff\2\27\1\uffff\20\27\1\uffff\10\27"+
            "\1\uffff\4\27\1\uffff\10\27\1\uffff\5\27\1\uffff\7\27\1\uffff"+
            "\25\27\1\uffff\12\27\1\uffff\4\27\1\uffff\10\27\1\uffff\7\27"+
            "\1\uffff\2\27\1\uffff\5\27\2\uffff\63\27\1\uffff\11\27\1\uffff"+
            "\4\27\1\uffff\3\27\1\uffff\14\27\1\uffff\6\27\1\uffff\2\27\1"+
            "\126\1\27\1\uffff\3\27\1\uffff\1\27\3\uffff\2\27\2\uffff\1\27",
            "",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\130\2\uffff\2"+
            "\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4\132"+
            "\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132\1"+
            "\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1\uffff"+
            "\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff\10"+
            "\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63\132"+
            "\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132\1"+
            "\uffff\6\132\1\uffff\2\132\1\131\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132\1\uffff\1\2",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u0099\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u009a\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\u00da\2\uffff\2\2\1"+
            "\uffff\2\2\1\uffff\27\2\2\uffff\1\2\1\uffff\4\2\1\uffff\6\2"+
            "\1\uffff\4\2\1\uffff\2\2\1\uffff\20\2\1\uffff\10\2\1\uffff\4"+
            "\2\1\uffff\10\2\1\uffff\5\2\1\uffff\7\2\1\uffff\25\2\1\uffff"+
            "\12\2\1\uffff\4\2\1\uffff\10\2\1\uffff\7\2\1\uffff\2\2\1\uffff"+
            "\5\2\2\uffff\63\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\14\2\1\uffff\6\2\1\uffff\2\2\1\u0118\1\2\1\uffff\3\2\1\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\1\2",
            "\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\u011a\2\uffff\2\2\1"+
            "\uffff\2\2\1\uffff\27\2\2\uffff\1\2\1\uffff\4\2\1\uffff\6\2"+
            "\1\uffff\4\2\1\uffff\2\2\1\uffff\20\2\1\uffff\10\2\1\uffff\4"+
            "\2\1\uffff\10\2\1\uffff\5\2\1\uffff\7\2\1\uffff\25\2\1\uffff"+
            "\12\2\1\uffff\4\2\1\uffff\10\2\1\uffff\7\2\1\uffff\2\2\1\uffff"+
            "\5\2\2\uffff\63\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
            "\14\2\1\uffff\6\2\1\uffff\2\2\1\u0158\1\2\1\uffff\3\2\1\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\1\2",
            "",
            "\1\u0159\5\uffff\1\u0159\4\uffff\1\u0159\7\uffff\7\u0159\1"+
            "\uffff\22\u0159\1\uffff\4\u0159\1\uffff\6\u0159\1\uffff\2\u0159"+
            "\1\uffff\1\u0159\1\uffff\2\u0159\1\uffff\20\u0159\1\uffff\4"+
            "\u0159\1\uffff\1\u0159\1\uffff\1\u0159\1\uffff\4\u0159\1\uffff"+
            "\10\u0159\1\uffff\3\u0159\1\uffff\1\u0159\1\uffff\4\u0159\1"+
            "\uffff\23\u0159\1\uffff\4\u0159\1\uffff\12\u0159\1\uffff\4\u0159"+
            "\1\uffff\10\u0159\1\uffff\1\u0159\1\uffff\5\u0159\1\uffff\2"+
            "\u0159\1\uffff\5\u0159\2\uffff\14\u0159\1\uffff\20\u0159\1\uffff"+
            "\25\u0159\1\uffff\3\u0159\1\uffff\5\u0159\1\uffff\4\u0159\1"+
            "\uffff\3\u0159\1\uffff\14\u0159\1\uffff\1\u0159\1\u0172\1\uffff"+
            "\1\u0159\1\uffff\1\u0159\3\uffff\1\u0159\2\uffff\1\u0159\2\uffff"+
            "\2\u0159\10\uffff\4\u0159",
            "",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u0174\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u0173\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132",
            "",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u01b4\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u01b3\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u01f4\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u01f3\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u0233\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u0234\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132",
            "\3\132\3\uffff\1\132\3\uffff\2\132\1\uffff\1\u0273\2\uffff"+
            "\2\132\1\uffff\2\132\1\uffff\27\132\2\uffff\1\132\1\uffff\4"+
            "\132\1\uffff\6\132\1\uffff\4\132\1\uffff\2\132\1\uffff\20\132"+
            "\1\uffff\10\132\1\uffff\4\132\1\uffff\10\132\1\uffff\5\132\1"+
            "\uffff\7\132\1\uffff\25\132\1\uffff\12\132\1\uffff\4\132\1\uffff"+
            "\10\132\1\uffff\7\132\1\uffff\2\132\1\uffff\5\132\2\uffff\63"+
            "\132\1\uffff\11\132\1\uffff\4\132\1\uffff\3\132\1\uffff\14\132"+
            "\1\uffff\6\132\1\uffff\2\132\1\u0274\1\132\1\uffff\3\132\1\uffff"+
            "\1\132\3\uffff\2\132\2\uffff\1\132",
            "",
            "",
            "\1\u02b3\6\u02b4\1\uffff\17\u02b4\2\uffff\1\u02b4\1\uffff\4"+
            "\u02b4\1\uffff\6\u02b4\1\uffff\2\u02b4\1\uffff\1\u02b4\1\uffff"+
            "\2\u02b4\1\uffff\20\u02b4\1\uffff\4\u02b4\1\uffff\1\u02b4\1"+
            "\uffff\1\u02b4\1\uffff\4\u02b4\1\uffff\10\u02b4\1\uffff\3\u02b4"+
            "\1\uffff\1\u02b4\1\uffff\4\u02b4\1\uffff\2\u02b4\1\uffff\20"+
            "\u02b4\1\uffff\4\u02b4\1\uffff\12\u02b4\2\uffff\3\u02b4\1\uffff"+
            "\3\u02b4\1\uffff\4\u02b4\1\uffff\1\u02b4\1\uffff\5\u02b4\1\uffff"+
            "\2\u02b4\1\uffff\5\u02b4\2\uffff\14\u02b4\1\uffff\20\u02b4\1"+
            "\uffff\25\u02b4\1\uffff\3\u02b4\1\uffff\5\u02b4\1\uffff\4\u02b4"+
            "\1\uffff\3\u02b4\1\uffff\14\u02b4\1\uffff\1\u02b4\2\uffff\1"+
            "\u02b4\1\uffff\1\u02b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02b5\6\u02b6\1\uffff\17\u02b6\2\uffff\1\u02b6\1\uffff\4"+
            "\u02b6\1\uffff\6\u02b6\1\uffff\2\u02b6\1\uffff\1\u02b6\1\uffff"+
            "\2\u02b6\1\uffff\20\u02b6\1\uffff\4\u02b6\1\uffff\1\u02b6\1"+
            "\uffff\1\u02b6\1\uffff\4\u02b6\1\uffff\10\u02b6\1\uffff\3\u02b6"+
            "\1\uffff\1\u02b6\1\uffff\4\u02b6\1\uffff\2\u02b6\1\uffff\20"+
            "\u02b6\1\uffff\4\u02b6\1\uffff\12\u02b6\2\uffff\3\u02b6\1\uffff"+
            "\3\u02b6\1\uffff\4\u02b6\1\uffff\1\u02b6\1\uffff\5\u02b6\1\uffff"+
            "\2\u02b6\1\uffff\5\u02b6\2\uffff\14\u02b6\1\uffff\20\u02b6\1"+
            "\uffff\25\u02b6\1\uffff\3\u02b6\1\uffff\5\u02b6\1\uffff\4\u02b6"+
            "\1\uffff\3\u02b6\1\uffff\14\u02b6\1\uffff\1\u02b6\2\uffff\1"+
            "\u02b6\1\uffff\1\u02b6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02b7\6\u02b8\1\uffff\17\u02b8\2\uffff\1\u02b8\1\uffff\4"+
            "\u02b8\1\uffff\6\u02b8\1\uffff\2\u02b8\1\uffff\1\u02b8\1\uffff"+
            "\2\u02b8\1\uffff\20\u02b8\1\uffff\4\u02b8\1\uffff\1\u02b8\1"+
            "\uffff\1\u02b8\1\uffff\4\u02b8\1\uffff\10\u02b8\1\uffff\3\u02b8"+
            "\1\uffff\1\u02b8\1\uffff\4\u02b8\1\uffff\2\u02b8\1\uffff\20"+
            "\u02b8\1\uffff\4\u02b8\1\uffff\12\u02b8\2\uffff\3\u02b8\1\uffff"+
            "\3\u02b8\1\uffff\4\u02b8\1\uffff\1\u02b8\1\uffff\5\u02b8\1\uffff"+
            "\2\u02b8\1\uffff\5\u02b8\2\uffff\14\u02b8\1\uffff\20\u02b8\1"+
            "\uffff\25\u02b8\1\uffff\3\u02b8\1\uffff\5\u02b8\1\uffff\4\u02b8"+
            "\1\uffff\3\u02b8\1\uffff\14\u02b8\1\uffff\1\u02b8\2\uffff\1"+
            "\u02b8\1\uffff\1\u02b8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02b9\6\u02ba\1\uffff\17\u02ba\2\uffff\1\u02ba\1\uffff\4"+
            "\u02ba\1\uffff\6\u02ba\1\uffff\2\u02ba\1\uffff\1\u02ba\1\uffff"+
            "\2\u02ba\1\uffff\20\u02ba\1\uffff\4\u02ba\1\uffff\1\u02ba\1"+
            "\uffff\1\u02ba\1\uffff\4\u02ba\1\uffff\10\u02ba\1\uffff\3\u02ba"+
            "\1\uffff\1\u02ba\1\uffff\4\u02ba\1\uffff\2\u02ba\1\uffff\20"+
            "\u02ba\1\uffff\4\u02ba\1\uffff\12\u02ba\2\uffff\3\u02ba\1\uffff"+
            "\3\u02ba\1\uffff\4\u02ba\1\uffff\1\u02ba\1\uffff\5\u02ba\1\uffff"+
            "\2\u02ba\1\uffff\5\u02ba\2\uffff\14\u02ba\1\uffff\20\u02ba\1"+
            "\uffff\25\u02ba\1\uffff\3\u02ba\1\uffff\5\u02ba\1\uffff\4\u02ba"+
            "\1\uffff\3\u02ba\1\uffff\14\u02ba\1\uffff\1\u02ba\2\uffff\1"+
            "\u02ba\1\uffff\1\u02ba",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02bb\6\u02bc\1\uffff\17\u02bc\2\uffff\1\u02bc\1\uffff\4"+
            "\u02bc\1\uffff\6\u02bc\1\uffff\2\u02bc\1\uffff\1\u02bc\1\uffff"+
            "\2\u02bc\1\uffff\20\u02bc\1\uffff\4\u02bc\1\uffff\1\u02bc\1"+
            "\uffff\1\u02bc\1\uffff\4\u02bc\1\uffff\10\u02bc\1\uffff\3\u02bc"+
            "\1\uffff\1\u02bc\1\uffff\4\u02bc\1\uffff\2\u02bc\1\uffff\20"+
            "\u02bc\1\uffff\4\u02bc\1\uffff\12\u02bc\2\uffff\3\u02bc\1\uffff"+
            "\3\u02bc\1\uffff\4\u02bc\1\uffff\1\u02bc\1\uffff\5\u02bc\1\uffff"+
            "\2\u02bc\1\uffff\5\u02bc\2\uffff\14\u02bc\1\uffff\20\u02bc\1"+
            "\uffff\25\u02bc\1\uffff\3\u02bc\1\uffff\5\u02bc\1\uffff\4\u02bc"+
            "\1\uffff\3\u02bc\1\uffff\14\u02bc\1\uffff\1\u02bc\2\uffff\1"+
            "\u02bc\1\uffff\1\u02bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02bd\6\u02be\1\uffff\17\u02be\2\uffff\1\u02be\1\uffff\4"+
            "\u02be\1\uffff\6\u02be\1\uffff\2\u02be\1\uffff\1\u02be\1\uffff"+
            "\2\u02be\1\uffff\20\u02be\1\uffff\4\u02be\1\uffff\1\u02be\1"+
            "\uffff\1\u02be\1\uffff\4\u02be\1\uffff\10\u02be\1\uffff\3\u02be"+
            "\1\uffff\1\u02be\1\uffff\4\u02be\1\uffff\2\u02be\1\uffff\20"+
            "\u02be\1\uffff\4\u02be\1\uffff\12\u02be\2\uffff\3\u02be\1\uffff"+
            "\3\u02be\1\uffff\4\u02be\1\uffff\1\u02be\1\uffff\5\u02be\1\uffff"+
            "\2\u02be\1\uffff\5\u02be\2\uffff\14\u02be\1\uffff\20\u02be\1"+
            "\uffff\25\u02be\1\uffff\3\u02be\1\uffff\5\u02be\1\uffff\4\u02be"+
            "\1\uffff\3\u02be\1\uffff\14\u02be\1\uffff\1\u02be\2\uffff\1"+
            "\u02be\1\uffff\1\u02be",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02bf\6\u02c0\1\uffff\17\u02c0\2\uffff\1\u02c0\1\uffff\4"+
            "\u02c0\1\uffff\6\u02c0\1\uffff\2\u02c0\1\uffff\1\u02c0\1\uffff"+
            "\2\u02c0\1\uffff\20\u02c0\1\uffff\4\u02c0\1\uffff\1\u02c0\1"+
            "\uffff\1\u02c0\1\uffff\4\u02c0\1\uffff\10\u02c0\1\uffff\3\u02c0"+
            "\1\uffff\1\u02c0\1\uffff\4\u02c0\1\uffff\2\u02c0\1\uffff\20"+
            "\u02c0\1\uffff\4\u02c0\1\uffff\12\u02c0\2\uffff\3\u02c0\1\uffff"+
            "\3\u02c0\1\uffff\4\u02c0\1\uffff\1\u02c0\1\uffff\5\u02c0\1\uffff"+
            "\2\u02c0\1\uffff\5\u02c0\2\uffff\14\u02c0\1\uffff\20\u02c0\1"+
            "\uffff\25\u02c0\1\uffff\3\u02c0\1\uffff\5\u02c0\1\uffff\4\u02c0"+
            "\1\uffff\3\u02c0\1\uffff\14\u02c0\1\uffff\1\u02c0\2\uffff\1"+
            "\u02c0\1\uffff\1\u02c0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02c1\6\u02c2\1\uffff\17\u02c2\2\uffff\1\u02c2\1\uffff\4"+
            "\u02c2\1\uffff\6\u02c2\1\uffff\2\u02c2\1\uffff\1\u02c2\1\uffff"+
            "\2\u02c2\1\uffff\20\u02c2\1\uffff\4\u02c2\1\uffff\1\u02c2\1"+
            "\uffff\1\u02c2\1\uffff\4\u02c2\1\uffff\10\u02c2\1\uffff\3\u02c2"+
            "\1\uffff\1\u02c2\1\uffff\4\u02c2\1\uffff\2\u02c2\1\uffff\20"+
            "\u02c2\1\uffff\4\u02c2\1\uffff\12\u02c2\2\uffff\3\u02c2\1\uffff"+
            "\3\u02c2\1\uffff\4\u02c2\1\uffff\1\u02c2\1\uffff\5\u02c2\1\uffff"+
            "\2\u02c2\1\uffff\5\u02c2\2\uffff\14\u02c2\1\uffff\20\u02c2\1"+
            "\uffff\25\u02c2\1\uffff\3\u02c2\1\uffff\5\u02c2\1\uffff\4\u02c2"+
            "\1\uffff\3\u02c2\1\uffff\14\u02c2\1\uffff\1\u02c2\2\uffff\1"+
            "\u02c2\1\uffff\1\u02c2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02c3\6\u02c4\1\uffff\17\u02c4\2\uffff\1\u02c4\1\uffff\4"+
            "\u02c4\1\uffff\6\u02c4\1\uffff\2\u02c4\1\uffff\1\u02c4\1\uffff"+
            "\2\u02c4\1\uffff\20\u02c4\1\uffff\4\u02c4\1\uffff\1\u02c4\1"+
            "\uffff\1\u02c4\1\uffff\4\u02c4\1\uffff\10\u02c4\1\uffff\3\u02c4"+
            "\1\uffff\1\u02c4\1\uffff\4\u02c4\1\uffff\2\u02c4\1\uffff\20"+
            "\u02c4\1\uffff\4\u02c4\1\uffff\12\u02c4\2\uffff\3\u02c4\1\uffff"+
            "\3\u02c4\1\uffff\4\u02c4\1\uffff\1\u02c4\1\uffff\5\u02c4\1\uffff"+
            "\2\u02c4\1\uffff\5\u02c4\2\uffff\14\u02c4\1\uffff\20\u02c4\1"+
            "\uffff\25\u02c4\1\uffff\3\u02c4\1\uffff\5\u02c4\1\uffff\4\u02c4"+
            "\1\uffff\3\u02c4\1\uffff\14\u02c4\1\uffff\1\u02c4\2\uffff\1"+
            "\u02c4\1\uffff\1\u02c4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02c5\6\u02c6\1\uffff\17\u02c6\2\uffff\1\u02c6\1\uffff\4"+
            "\u02c6\1\uffff\6\u02c6\1\uffff\2\u02c6\1\uffff\1\u02c6\1\uffff"+
            "\2\u02c6\1\uffff\20\u02c6\1\uffff\4\u02c6\1\uffff\1\u02c6\1"+
            "\uffff\1\u02c6\1\uffff\4\u02c6\1\uffff\10\u02c6\1\uffff\3\u02c6"+
            "\1\uffff\1\u02c6\1\uffff\4\u02c6\1\uffff\2\u02c6\1\uffff\20"+
            "\u02c6\1\uffff\4\u02c6\1\uffff\12\u02c6\2\uffff\3\u02c6\1\uffff"+
            "\3\u02c6\1\uffff\4\u02c6\1\uffff\1\u02c6\1\uffff\5\u02c6\1\uffff"+
            "\2\u02c6\1\uffff\5\u02c6\2\uffff\14\u02c6\1\uffff\20\u02c6\1"+
            "\uffff\25\u02c6\1\uffff\3\u02c6\1\uffff\5\u02c6\1\uffff\4\u02c6"+
            "\1\uffff\3\u02c6\1\uffff\14\u02c6\1\uffff\1\u02c6\2\uffff\1"+
            "\u02c6\1\uffff\1\u02c6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "269:1: atomExpression : ( KW_NULL -> TOK_NULL | constant | castExpression | caseExpression | whenExpression | ( functionName LPAREN )=> function | tableOrColumn | LPAREN ! expression RPAREN !);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_0==KW_NULL) ) {s = 1;}

                        else if ( (LA32_0==BigintLiteral||LA32_0==CharSetName||LA32_0==DecimalLiteral||LA32_0==Number||(LA32_0 >= SmallintLiteral && LA32_0 <= StringLiteral)||LA32_0==TinyintLiteral) ) {s = 2;}

                        else if ( (LA32_0==KW_DATE) ) {s = 3;}

                        else if ( (LA32_0==KW_TIMESTAMP) ) {s = 4;}

                        else if ( (LA32_0==KW_TRUE) ) {s = 11;}

                        else if ( (LA32_0==KW_FALSE) ) {s = 12;}

                        else if ( (LA32_0==KW_CAST) ) {s = 13;}

                        else if ( (LA32_0==KW_CASE) ) {s = 14;}

                        else if ( (LA32_0==KW_IF) && (synpred5_IdentifiersParser())) {s = 15;}

                        else if ( (LA32_0==KW_ARRAY) ) {s = 16;}

                        else if ( (LA32_0==KW_MAP) && (synpred5_IdentifiersParser())) {s = 17;}

                        else if ( (LA32_0==KW_STRUCT) ) {s = 18;}

                        else if ( (LA32_0==KW_UNIONTYPE) ) {s = 19;}

                        else if ( (LA32_0==Identifier) ) {s = 20;}

                        else if ( ((LA32_0 >= KW_ADD && LA32_0 <= KW_ANALYZE)||LA32_0==KW_ARCHIVE||(LA32_0 >= KW_AS && LA32_0 <= KW_CASCADE)||LA32_0==KW_CHANGE||(LA32_0 >= KW_CLUSTER && LA32_0 <= KW_COLLECTION)||(LA32_0 >= KW_COLUMNS && LA32_0 <= KW_CONCATENATE)||(LA32_0 >= KW_CONTINUE && LA32_0 <= KW_CREATE)||LA32_0==KW_CUBE||(LA32_0 >= KW_CURSOR && LA32_0 <= KW_DATA)||LA32_0==KW_DATABASES||(LA32_0 >= KW_DATETIME && LA32_0 <= KW_DISABLE)||(LA32_0 >= KW_DISTRIBUTE && LA32_0 <= KW_ELEM_TYPE)||LA32_0==KW_ENABLE||LA32_0==KW_ESCAPED||(LA32_0 >= KW_EXCLUSIVE && LA32_0 <= KW_EXPORT)||LA32_0==KW_EXTERNAL||(LA32_0 >= KW_FETCH && LA32_0 <= KW_FLOAT)||(LA32_0 >= KW_FOR && LA32_0 <= KW_FORMATTED)||LA32_0==KW_FULL||(LA32_0 >= KW_FUNCTIONS && LA32_0 <= KW_GROUPING)||(LA32_0 >= KW_HOLD_DDLTIME && LA32_0 <= KW_IDXPROPERTIES)||(LA32_0 >= KW_IGNORE && LA32_0 <= KW_JAR)||(LA32_0 >= KW_KEYS && LA32_0 <= KW_LEFT)||(LA32_0 >= KW_LIKE && LA32_0 <= KW_LONG)||(LA32_0 >= KW_MAPJOIN && LA32_0 <= KW_MINUS)||(LA32_0 >= KW_MSCK && LA32_0 <= KW_NOSCAN)||LA32_0==KW_NO_DROP||(LA32_0 >= KW_OF && LA32_0 <= KW_OFFLINE)||LA32_0==KW_OPTION||(LA32_0 >= KW_ORDER && LA32_0 <= KW_OUTPUTFORMAT)||(LA32_0 >= KW_OVERWRITE && LA32_0 <= KW_OWNER)||(LA32_0 >= KW_PARTITION && LA32_0 <= KW_PLUS)||(LA32_0 >= KW_PRETTY && LA32_0 <= KW_RECORDWRITER)||(LA32_0 >= KW_REGEXP && LA32_0 <= KW_SCHEMAS)||(LA32_0 >= KW_SEMI && LA32_0 <= KW_STRING)||(LA32_0 >= KW_TABLE && LA32_0 <= KW_TABLES)||(LA32_0 >= KW_TBLPROPERTIES && LA32_0 <= KW_TERMINATED)||(LA32_0 >= KW_TINYINT && LA32_0 <= KW_TRANSACTIONS)||LA32_0==KW_TRIGGER||(LA32_0 >= KW_TRUNCATE && LA32_0 <= KW_UNARCHIVE)||(LA32_0 >= KW_UNDO && LA32_0 <= KW_UNION)||(LA32_0 >= KW_UNLOCK && LA32_0 <= KW_VALUE_TYPE)||LA32_0==KW_VIEW||LA32_0==KW_WHILE||LA32_0==KW_WITH) ) {s = 21;}

                        else if ( (LA32_0==LPAREN) ) {s = 22;}

                         
                        input.seek(index32_0);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_1==EOF||(LA32_1 >= AMPERSAND && LA32_1 <= BITWISEXOR)||LA32_1==COMMA||(LA32_1 >= DIV && LA32_1 <= DIVIDE)||(LA32_1 >= EQUAL && LA32_1 <= EQUAL_NS)||(LA32_1 >= GREATERTHAN && LA32_1 <= GREATERTHANOREQUALTO)||(LA32_1 >= Identifier && LA32_1 <= KW_CASCADE)||LA32_1==KW_CHANGE||(LA32_1 >= KW_CLUSTER && LA32_1 <= KW_COLLECTION)||(LA32_1 >= KW_COLUMNS && LA32_1 <= KW_CONCATENATE)||(LA32_1 >= KW_CONTINUE && LA32_1 <= KW_CUBE)||(LA32_1 >= KW_CURSOR && LA32_1 <= KW_DATA)||(LA32_1 >= KW_DATABASES && LA32_1 <= KW_DISABLE)||(LA32_1 >= KW_DISTRIBUTE && LA32_1 <= KW_ESCAPED)||(LA32_1 >= KW_EXCLUSIVE && LA32_1 <= KW_EXPORT)||(LA32_1 >= KW_EXTERNAL && LA32_1 <= KW_FLOAT)||(LA32_1 >= KW_FOR && LA32_1 <= KW_FULL)||(LA32_1 >= KW_FUNCTIONS && LA32_1 <= KW_IDXPROPERTIES)||(LA32_1 >= KW_IGNORE && LA32_1 <= KW_LEFT)||(LA32_1 >= KW_LIKE && LA32_1 <= KW_LONG)||(LA32_1 >= KW_MAP && LA32_1 <= KW_MINUS)||(LA32_1 >= KW_MSCK && LA32_1 <= KW_OFFLINE)||(LA32_1 >= KW_OPTION && LA32_1 <= KW_OUTPUTFORMAT)||(LA32_1 >= KW_OVERWRITE && LA32_1 <= KW_OWNER)||(LA32_1 >= KW_PARTITION && LA32_1 <= KW_PLUS)||(LA32_1 >= KW_PRETTY && LA32_1 <= KW_TABLES)||(LA32_1 >= KW_TBLPROPERTIES && LA32_1 <= KW_TRANSACTIONS)||(LA32_1 >= KW_TRIGGER && LA32_1 <= KW_UNARCHIVE)||(LA32_1 >= KW_UNDO && LA32_1 <= KW_UNIONTYPE)||(LA32_1 >= KW_UNLOCK && LA32_1 <= KW_VALUE_TYPE)||(LA32_1 >= KW_VIEW && LA32_1 <= KW_WITH)||(LA32_1 >= LESSTHAN && LA32_1 <= LESSTHANOREQUALTO)||LA32_1==LSQUARE||(LA32_1 >= MINUS && LA32_1 <= NOTEQUAL)||LA32_1==PLUS||(LA32_1 >= RPAREN && LA32_1 <= RSQUARE)||LA32_1==STAR) ) {s = 23;}

                        else if ( (LA32_1==DOT) ) {s = 24;}

                        else if ( (LA32_1==LPAREN) && (synpred5_IdentifiersParser())) {s = 86;}

                         
                        input.seek(index32_1);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_3==StringLiteral) ) {s = 2;}

                        else if ( (LA32_3==DOT) ) {s = 88;}

                        else if ( (LA32_3==LPAREN) && (synpred5_IdentifiersParser())) {s = 89;}

                        else if ( (LA32_3==EOF||(LA32_3 >= AMPERSAND && LA32_3 <= BITWISEXOR)||LA32_3==COMMA||(LA32_3 >= DIV && LA32_3 <= DIVIDE)||(LA32_3 >= EQUAL && LA32_3 <= EQUAL_NS)||(LA32_3 >= GREATERTHAN && LA32_3 <= GREATERTHANOREQUALTO)||(LA32_3 >= Identifier && LA32_3 <= KW_CASCADE)||LA32_3==KW_CHANGE||(LA32_3 >= KW_CLUSTER && LA32_3 <= KW_COLLECTION)||(LA32_3 >= KW_COLUMNS && LA32_3 <= KW_CONCATENATE)||(LA32_3 >= KW_CONTINUE && LA32_3 <= KW_CUBE)||(LA32_3 >= KW_CURSOR && LA32_3 <= KW_DATA)||(LA32_3 >= KW_DATABASES && LA32_3 <= KW_DISABLE)||(LA32_3 >= KW_DISTRIBUTE && LA32_3 <= KW_ESCAPED)||(LA32_3 >= KW_EXCLUSIVE && LA32_3 <= KW_EXPORT)||(LA32_3 >= KW_EXTERNAL && LA32_3 <= KW_FLOAT)||(LA32_3 >= KW_FOR && LA32_3 <= KW_FULL)||(LA32_3 >= KW_FUNCTIONS && LA32_3 <= KW_IDXPROPERTIES)||(LA32_3 >= KW_IGNORE && LA32_3 <= KW_LEFT)||(LA32_3 >= KW_LIKE && LA32_3 <= KW_LONG)||(LA32_3 >= KW_MAP && LA32_3 <= KW_MINUS)||(LA32_3 >= KW_MSCK && LA32_3 <= KW_OFFLINE)||(LA32_3 >= KW_OPTION && LA32_3 <= KW_OUTPUTFORMAT)||(LA32_3 >= KW_OVERWRITE && LA32_3 <= KW_OWNER)||(LA32_3 >= KW_PARTITION && LA32_3 <= KW_PLUS)||(LA32_3 >= KW_PRETTY && LA32_3 <= KW_TABLES)||(LA32_3 >= KW_TBLPROPERTIES && LA32_3 <= KW_TRANSACTIONS)||(LA32_3 >= KW_TRIGGER && LA32_3 <= KW_UNARCHIVE)||(LA32_3 >= KW_UNDO && LA32_3 <= KW_UNIONTYPE)||(LA32_3 >= KW_UNLOCK && LA32_3 <= KW_VALUE_TYPE)||(LA32_3 >= KW_VIEW && LA32_3 <= KW_WITH)||(LA32_3 >= LESSTHAN && LA32_3 <= LESSTHANOREQUALTO)||LA32_3==LSQUARE||(LA32_3 >= MINUS && LA32_3 <= NOTEQUAL)||LA32_3==PLUS||(LA32_3 >= RPAREN && LA32_3 <= RSQUARE)||LA32_3==STAR) ) {s = 90;}

                         
                        input.seek(index32_3);

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_4==StringLiteral) ) {s = 2;}

                        else if ( (LA32_4==DOT) ) {s = 153;}

                        else if ( (LA32_4==LPAREN) && (synpred5_IdentifiersParser())) {s = 154;}

                        else if ( (LA32_4==EOF||(LA32_4 >= AMPERSAND && LA32_4 <= BITWISEXOR)||LA32_4==COMMA||(LA32_4 >= DIV && LA32_4 <= DIVIDE)||(LA32_4 >= EQUAL && LA32_4 <= EQUAL_NS)||(LA32_4 >= GREATERTHAN && LA32_4 <= GREATERTHANOREQUALTO)||(LA32_4 >= Identifier && LA32_4 <= KW_CASCADE)||LA32_4==KW_CHANGE||(LA32_4 >= KW_CLUSTER && LA32_4 <= KW_COLLECTION)||(LA32_4 >= KW_COLUMNS && LA32_4 <= KW_CONCATENATE)||(LA32_4 >= KW_CONTINUE && LA32_4 <= KW_CUBE)||(LA32_4 >= KW_CURSOR && LA32_4 <= KW_DATA)||(LA32_4 >= KW_DATABASES && LA32_4 <= KW_DISABLE)||(LA32_4 >= KW_DISTRIBUTE && LA32_4 <= KW_ESCAPED)||(LA32_4 >= KW_EXCLUSIVE && LA32_4 <= KW_EXPORT)||(LA32_4 >= KW_EXTERNAL && LA32_4 <= KW_FLOAT)||(LA32_4 >= KW_FOR && LA32_4 <= KW_FULL)||(LA32_4 >= KW_FUNCTIONS && LA32_4 <= KW_IDXPROPERTIES)||(LA32_4 >= KW_IGNORE && LA32_4 <= KW_LEFT)||(LA32_4 >= KW_LIKE && LA32_4 <= KW_LONG)||(LA32_4 >= KW_MAP && LA32_4 <= KW_MINUS)||(LA32_4 >= KW_MSCK && LA32_4 <= KW_OFFLINE)||(LA32_4 >= KW_OPTION && LA32_4 <= KW_OUTPUTFORMAT)||(LA32_4 >= KW_OVERWRITE && LA32_4 <= KW_OWNER)||(LA32_4 >= KW_PARTITION && LA32_4 <= KW_PLUS)||(LA32_4 >= KW_PRETTY && LA32_4 <= KW_TABLES)||(LA32_4 >= KW_TBLPROPERTIES && LA32_4 <= KW_TRANSACTIONS)||(LA32_4 >= KW_TRIGGER && LA32_4 <= KW_UNARCHIVE)||(LA32_4 >= KW_UNDO && LA32_4 <= KW_UNIONTYPE)||(LA32_4 >= KW_UNLOCK && LA32_4 <= KW_VALUE_TYPE)||(LA32_4 >= KW_VIEW && LA32_4 <= KW_WITH)||(LA32_4 >= LESSTHAN && LA32_4 <= LESSTHANOREQUALTO)||LA32_4==LSQUARE||(LA32_4 >= MINUS && LA32_4 <= NOTEQUAL)||LA32_4==PLUS||(LA32_4 >= RPAREN && LA32_4 <= RSQUARE)||LA32_4==STAR) ) {s = 90;}

                         
                        input.seek(index32_4);

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_11==EOF||(LA32_11 >= AMPERSAND && LA32_11 <= BITWISEXOR)||LA32_11==COMMA||(LA32_11 >= DIV && LA32_11 <= DIVIDE)||(LA32_11 >= EQUAL && LA32_11 <= EQUAL_NS)||(LA32_11 >= GREATERTHAN && LA32_11 <= GREATERTHANOREQUALTO)||(LA32_11 >= Identifier && LA32_11 <= KW_CASCADE)||LA32_11==KW_CHANGE||(LA32_11 >= KW_CLUSTER && LA32_11 <= KW_COLLECTION)||(LA32_11 >= KW_COLUMNS && LA32_11 <= KW_CONCATENATE)||(LA32_11 >= KW_CONTINUE && LA32_11 <= KW_CUBE)||(LA32_11 >= KW_CURSOR && LA32_11 <= KW_DATA)||(LA32_11 >= KW_DATABASES && LA32_11 <= KW_DISABLE)||(LA32_11 >= KW_DISTRIBUTE && LA32_11 <= KW_ESCAPED)||(LA32_11 >= KW_EXCLUSIVE && LA32_11 <= KW_EXPORT)||(LA32_11 >= KW_EXTERNAL && LA32_11 <= KW_FLOAT)||(LA32_11 >= KW_FOR && LA32_11 <= KW_FULL)||(LA32_11 >= KW_FUNCTIONS && LA32_11 <= KW_IDXPROPERTIES)||(LA32_11 >= KW_IGNORE && LA32_11 <= KW_LEFT)||(LA32_11 >= KW_LIKE && LA32_11 <= KW_LONG)||(LA32_11 >= KW_MAP && LA32_11 <= KW_MINUS)||(LA32_11 >= KW_MSCK && LA32_11 <= KW_OFFLINE)||(LA32_11 >= KW_OPTION && LA32_11 <= KW_OUTPUTFORMAT)||(LA32_11 >= KW_OVERWRITE && LA32_11 <= KW_OWNER)||(LA32_11 >= KW_PARTITION && LA32_11 <= KW_PLUS)||(LA32_11 >= KW_PRETTY && LA32_11 <= KW_TABLES)||(LA32_11 >= KW_TBLPROPERTIES && LA32_11 <= KW_TRANSACTIONS)||(LA32_11 >= KW_TRIGGER && LA32_11 <= KW_UNARCHIVE)||(LA32_11 >= KW_UNDO && LA32_11 <= KW_UNIONTYPE)||(LA32_11 >= KW_UNLOCK && LA32_11 <= KW_VALUE_TYPE)||(LA32_11 >= KW_VIEW && LA32_11 <= KW_WITH)||(LA32_11 >= LESSTHAN && LA32_11 <= LESSTHANOREQUALTO)||LA32_11==LSQUARE||(LA32_11 >= MINUS && LA32_11 <= NOTEQUAL)||LA32_11==PLUS||(LA32_11 >= RPAREN && LA32_11 <= RSQUARE)||LA32_11==STAR) ) {s = 2;}

                        else if ( (LA32_11==DOT) ) {s = 218;}

                        else if ( (LA32_11==LPAREN) && (synpred5_IdentifiersParser())) {s = 280;}

                         
                        input.seek(index32_11);

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_12==EOF||(LA32_12 >= AMPERSAND && LA32_12 <= BITWISEXOR)||LA32_12==COMMA||(LA32_12 >= DIV && LA32_12 <= DIVIDE)||(LA32_12 >= EQUAL && LA32_12 <= EQUAL_NS)||(LA32_12 >= GREATERTHAN && LA32_12 <= GREATERTHANOREQUALTO)||(LA32_12 >= Identifier && LA32_12 <= KW_CASCADE)||LA32_12==KW_CHANGE||(LA32_12 >= KW_CLUSTER && LA32_12 <= KW_COLLECTION)||(LA32_12 >= KW_COLUMNS && LA32_12 <= KW_CONCATENATE)||(LA32_12 >= KW_CONTINUE && LA32_12 <= KW_CUBE)||(LA32_12 >= KW_CURSOR && LA32_12 <= KW_DATA)||(LA32_12 >= KW_DATABASES && LA32_12 <= KW_DISABLE)||(LA32_12 >= KW_DISTRIBUTE && LA32_12 <= KW_ESCAPED)||(LA32_12 >= KW_EXCLUSIVE && LA32_12 <= KW_EXPORT)||(LA32_12 >= KW_EXTERNAL && LA32_12 <= KW_FLOAT)||(LA32_12 >= KW_FOR && LA32_12 <= KW_FULL)||(LA32_12 >= KW_FUNCTIONS && LA32_12 <= KW_IDXPROPERTIES)||(LA32_12 >= KW_IGNORE && LA32_12 <= KW_LEFT)||(LA32_12 >= KW_LIKE && LA32_12 <= KW_LONG)||(LA32_12 >= KW_MAP && LA32_12 <= KW_MINUS)||(LA32_12 >= KW_MSCK && LA32_12 <= KW_OFFLINE)||(LA32_12 >= KW_OPTION && LA32_12 <= KW_OUTPUTFORMAT)||(LA32_12 >= KW_OVERWRITE && LA32_12 <= KW_OWNER)||(LA32_12 >= KW_PARTITION && LA32_12 <= KW_PLUS)||(LA32_12 >= KW_PRETTY && LA32_12 <= KW_TABLES)||(LA32_12 >= KW_TBLPROPERTIES && LA32_12 <= KW_TRANSACTIONS)||(LA32_12 >= KW_TRIGGER && LA32_12 <= KW_UNARCHIVE)||(LA32_12 >= KW_UNDO && LA32_12 <= KW_UNIONTYPE)||(LA32_12 >= KW_UNLOCK && LA32_12 <= KW_VALUE_TYPE)||(LA32_12 >= KW_VIEW && LA32_12 <= KW_WITH)||(LA32_12 >= LESSTHAN && LA32_12 <= LESSTHANOREQUALTO)||LA32_12==LSQUARE||(LA32_12 >= MINUS && LA32_12 <= NOTEQUAL)||LA32_12==PLUS||(LA32_12 >= RPAREN && LA32_12 <= RSQUARE)||LA32_12==STAR) ) {s = 2;}

                        else if ( (LA32_12==DOT) ) {s = 282;}

                        else if ( (LA32_12==LPAREN) && (synpred5_IdentifiersParser())) {s = 344;}

                         
                        input.seek(index32_12);

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_16==LPAREN) && (synpred5_IdentifiersParser())) {s = 371;}

                        else if ( (LA32_16==DOT) ) {s = 372;}

                        else if ( (LA32_16==EOF||(LA32_16 >= AMPERSAND && LA32_16 <= BITWISEXOR)||LA32_16==COMMA||(LA32_16 >= DIV && LA32_16 <= DIVIDE)||(LA32_16 >= EQUAL && LA32_16 <= EQUAL_NS)||(LA32_16 >= GREATERTHAN && LA32_16 <= GREATERTHANOREQUALTO)||(LA32_16 >= Identifier && LA32_16 <= KW_CASCADE)||LA32_16==KW_CHANGE||(LA32_16 >= KW_CLUSTER && LA32_16 <= KW_COLLECTION)||(LA32_16 >= KW_COLUMNS && LA32_16 <= KW_CONCATENATE)||(LA32_16 >= KW_CONTINUE && LA32_16 <= KW_CUBE)||(LA32_16 >= KW_CURSOR && LA32_16 <= KW_DATA)||(LA32_16 >= KW_DATABASES && LA32_16 <= KW_DISABLE)||(LA32_16 >= KW_DISTRIBUTE && LA32_16 <= KW_ESCAPED)||(LA32_16 >= KW_EXCLUSIVE && LA32_16 <= KW_EXPORT)||(LA32_16 >= KW_EXTERNAL && LA32_16 <= KW_FLOAT)||(LA32_16 >= KW_FOR && LA32_16 <= KW_FULL)||(LA32_16 >= KW_FUNCTIONS && LA32_16 <= KW_IDXPROPERTIES)||(LA32_16 >= KW_IGNORE && LA32_16 <= KW_LEFT)||(LA32_16 >= KW_LIKE && LA32_16 <= KW_LONG)||(LA32_16 >= KW_MAP && LA32_16 <= KW_MINUS)||(LA32_16 >= KW_MSCK && LA32_16 <= KW_OFFLINE)||(LA32_16 >= KW_OPTION && LA32_16 <= KW_OUTPUTFORMAT)||(LA32_16 >= KW_OVERWRITE && LA32_16 <= KW_OWNER)||(LA32_16 >= KW_PARTITION && LA32_16 <= KW_PLUS)||(LA32_16 >= KW_PRETTY && LA32_16 <= KW_TABLES)||(LA32_16 >= KW_TBLPROPERTIES && LA32_16 <= KW_TRANSACTIONS)||(LA32_16 >= KW_TRIGGER && LA32_16 <= KW_UNARCHIVE)||(LA32_16 >= KW_UNDO && LA32_16 <= KW_UNIONTYPE)||(LA32_16 >= KW_UNLOCK && LA32_16 <= KW_VALUE_TYPE)||(LA32_16 >= KW_VIEW && LA32_16 <= KW_WITH)||(LA32_16 >= LESSTHAN && LA32_16 <= LESSTHANOREQUALTO)||LA32_16==LSQUARE||(LA32_16 >= MINUS && LA32_16 <= NOTEQUAL)||LA32_16==PLUS||(LA32_16 >= RPAREN && LA32_16 <= RSQUARE)||LA32_16==STAR) ) {s = 90;}

                         
                        input.seek(index32_16);

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_18 = input.LA(1);

                         
                        int index32_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_18==LPAREN) && (synpred5_IdentifiersParser())) {s = 435;}

                        else if ( (LA32_18==DOT) ) {s = 436;}

                        else if ( (LA32_18==EOF||(LA32_18 >= AMPERSAND && LA32_18 <= BITWISEXOR)||LA32_18==COMMA||(LA32_18 >= DIV && LA32_18 <= DIVIDE)||(LA32_18 >= EQUAL && LA32_18 <= EQUAL_NS)||(LA32_18 >= GREATERTHAN && LA32_18 <= GREATERTHANOREQUALTO)||(LA32_18 >= Identifier && LA32_18 <= KW_CASCADE)||LA32_18==KW_CHANGE||(LA32_18 >= KW_CLUSTER && LA32_18 <= KW_COLLECTION)||(LA32_18 >= KW_COLUMNS && LA32_18 <= KW_CONCATENATE)||(LA32_18 >= KW_CONTINUE && LA32_18 <= KW_CUBE)||(LA32_18 >= KW_CURSOR && LA32_18 <= KW_DATA)||(LA32_18 >= KW_DATABASES && LA32_18 <= KW_DISABLE)||(LA32_18 >= KW_DISTRIBUTE && LA32_18 <= KW_ESCAPED)||(LA32_18 >= KW_EXCLUSIVE && LA32_18 <= KW_EXPORT)||(LA32_18 >= KW_EXTERNAL && LA32_18 <= KW_FLOAT)||(LA32_18 >= KW_FOR && LA32_18 <= KW_FULL)||(LA32_18 >= KW_FUNCTIONS && LA32_18 <= KW_IDXPROPERTIES)||(LA32_18 >= KW_IGNORE && LA32_18 <= KW_LEFT)||(LA32_18 >= KW_LIKE && LA32_18 <= KW_LONG)||(LA32_18 >= KW_MAP && LA32_18 <= KW_MINUS)||(LA32_18 >= KW_MSCK && LA32_18 <= KW_OFFLINE)||(LA32_18 >= KW_OPTION && LA32_18 <= KW_OUTPUTFORMAT)||(LA32_18 >= KW_OVERWRITE && LA32_18 <= KW_OWNER)||(LA32_18 >= KW_PARTITION && LA32_18 <= KW_PLUS)||(LA32_18 >= KW_PRETTY && LA32_18 <= KW_TABLES)||(LA32_18 >= KW_TBLPROPERTIES && LA32_18 <= KW_TRANSACTIONS)||(LA32_18 >= KW_TRIGGER && LA32_18 <= KW_UNARCHIVE)||(LA32_18 >= KW_UNDO && LA32_18 <= KW_UNIONTYPE)||(LA32_18 >= KW_UNLOCK && LA32_18 <= KW_VALUE_TYPE)||(LA32_18 >= KW_VIEW && LA32_18 <= KW_WITH)||(LA32_18 >= LESSTHAN && LA32_18 <= LESSTHANOREQUALTO)||LA32_18==LSQUARE||(LA32_18 >= MINUS && LA32_18 <= NOTEQUAL)||LA32_18==PLUS||(LA32_18 >= RPAREN && LA32_18 <= RSQUARE)||LA32_18==STAR) ) {s = 90;}

                         
                        input.seek(index32_18);

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_19 = input.LA(1);

                         
                        int index32_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_19==LPAREN) && (synpred5_IdentifiersParser())) {s = 499;}

                        else if ( (LA32_19==DOT) ) {s = 500;}

                        else if ( (LA32_19==EOF||(LA32_19 >= AMPERSAND && LA32_19 <= BITWISEXOR)||LA32_19==COMMA||(LA32_19 >= DIV && LA32_19 <= DIVIDE)||(LA32_19 >= EQUAL && LA32_19 <= EQUAL_NS)||(LA32_19 >= GREATERTHAN && LA32_19 <= GREATERTHANOREQUALTO)||(LA32_19 >= Identifier && LA32_19 <= KW_CASCADE)||LA32_19==KW_CHANGE||(LA32_19 >= KW_CLUSTER && LA32_19 <= KW_COLLECTION)||(LA32_19 >= KW_COLUMNS && LA32_19 <= KW_CONCATENATE)||(LA32_19 >= KW_CONTINUE && LA32_19 <= KW_CUBE)||(LA32_19 >= KW_CURSOR && LA32_19 <= KW_DATA)||(LA32_19 >= KW_DATABASES && LA32_19 <= KW_DISABLE)||(LA32_19 >= KW_DISTRIBUTE && LA32_19 <= KW_ESCAPED)||(LA32_19 >= KW_EXCLUSIVE && LA32_19 <= KW_EXPORT)||(LA32_19 >= KW_EXTERNAL && LA32_19 <= KW_FLOAT)||(LA32_19 >= KW_FOR && LA32_19 <= KW_FULL)||(LA32_19 >= KW_FUNCTIONS && LA32_19 <= KW_IDXPROPERTIES)||(LA32_19 >= KW_IGNORE && LA32_19 <= KW_LEFT)||(LA32_19 >= KW_LIKE && LA32_19 <= KW_LONG)||(LA32_19 >= KW_MAP && LA32_19 <= KW_MINUS)||(LA32_19 >= KW_MSCK && LA32_19 <= KW_OFFLINE)||(LA32_19 >= KW_OPTION && LA32_19 <= KW_OUTPUTFORMAT)||(LA32_19 >= KW_OVERWRITE && LA32_19 <= KW_OWNER)||(LA32_19 >= KW_PARTITION && LA32_19 <= KW_PLUS)||(LA32_19 >= KW_PRETTY && LA32_19 <= KW_TABLES)||(LA32_19 >= KW_TBLPROPERTIES && LA32_19 <= KW_TRANSACTIONS)||(LA32_19 >= KW_TRIGGER && LA32_19 <= KW_UNARCHIVE)||(LA32_19 >= KW_UNDO && LA32_19 <= KW_UNIONTYPE)||(LA32_19 >= KW_UNLOCK && LA32_19 <= KW_VALUE_TYPE)||(LA32_19 >= KW_VIEW && LA32_19 <= KW_WITH)||(LA32_19 >= LESSTHAN && LA32_19 <= LESSTHANOREQUALTO)||LA32_19==LSQUARE||(LA32_19 >= MINUS && LA32_19 <= NOTEQUAL)||LA32_19==PLUS||(LA32_19 >= RPAREN && LA32_19 <= RSQUARE)||LA32_19==STAR) ) {s = 90;}

                         
                        input.seek(index32_19);

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_20 = input.LA(1);

                         
                        int index32_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_20==DOT) ) {s = 563;}

                        else if ( (LA32_20==LPAREN) && (synpred5_IdentifiersParser())) {s = 564;}

                        else if ( (LA32_20==EOF||(LA32_20 >= AMPERSAND && LA32_20 <= BITWISEXOR)||LA32_20==COMMA||(LA32_20 >= DIV && LA32_20 <= DIVIDE)||(LA32_20 >= EQUAL && LA32_20 <= EQUAL_NS)||(LA32_20 >= GREATERTHAN && LA32_20 <= GREATERTHANOREQUALTO)||(LA32_20 >= Identifier && LA32_20 <= KW_CASCADE)||LA32_20==KW_CHANGE||(LA32_20 >= KW_CLUSTER && LA32_20 <= KW_COLLECTION)||(LA32_20 >= KW_COLUMNS && LA32_20 <= KW_CONCATENATE)||(LA32_20 >= KW_CONTINUE && LA32_20 <= KW_CUBE)||(LA32_20 >= KW_CURSOR && LA32_20 <= KW_DATA)||(LA32_20 >= KW_DATABASES && LA32_20 <= KW_DISABLE)||(LA32_20 >= KW_DISTRIBUTE && LA32_20 <= KW_ESCAPED)||(LA32_20 >= KW_EXCLUSIVE && LA32_20 <= KW_EXPORT)||(LA32_20 >= KW_EXTERNAL && LA32_20 <= KW_FLOAT)||(LA32_20 >= KW_FOR && LA32_20 <= KW_FULL)||(LA32_20 >= KW_FUNCTIONS && LA32_20 <= KW_IDXPROPERTIES)||(LA32_20 >= KW_IGNORE && LA32_20 <= KW_LEFT)||(LA32_20 >= KW_LIKE && LA32_20 <= KW_LONG)||(LA32_20 >= KW_MAP && LA32_20 <= KW_MINUS)||(LA32_20 >= KW_MSCK && LA32_20 <= KW_OFFLINE)||(LA32_20 >= KW_OPTION && LA32_20 <= KW_OUTPUTFORMAT)||(LA32_20 >= KW_OVERWRITE && LA32_20 <= KW_OWNER)||(LA32_20 >= KW_PARTITION && LA32_20 <= KW_PLUS)||(LA32_20 >= KW_PRETTY && LA32_20 <= KW_TABLES)||(LA32_20 >= KW_TBLPROPERTIES && LA32_20 <= KW_TRANSACTIONS)||(LA32_20 >= KW_TRIGGER && LA32_20 <= KW_UNARCHIVE)||(LA32_20 >= KW_UNDO && LA32_20 <= KW_UNIONTYPE)||(LA32_20 >= KW_UNLOCK && LA32_20 <= KW_VALUE_TYPE)||(LA32_20 >= KW_VIEW && LA32_20 <= KW_WITH)||(LA32_20 >= LESSTHAN && LA32_20 <= LESSTHANOREQUALTO)||LA32_20==LSQUARE||(LA32_20 >= MINUS && LA32_20 <= NOTEQUAL)||LA32_20==PLUS||(LA32_20 >= RPAREN && LA32_20 <= RSQUARE)||LA32_20==STAR) ) {s = 90;}

                         
                        input.seek(index32_20);

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_21 = input.LA(1);

                         
                        int index32_21 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA32_21==DOT) ) {s = 627;}

                        else if ( (LA32_21==LPAREN) && (synpred5_IdentifiersParser())) {s = 628;}

                        else if ( (LA32_21==EOF||(LA32_21 >= AMPERSAND && LA32_21 <= BITWISEXOR)||LA32_21==COMMA||(LA32_21 >= DIV && LA32_21 <= DIVIDE)||(LA32_21 >= EQUAL && LA32_21 <= EQUAL_NS)||(LA32_21 >= GREATERTHAN && LA32_21 <= GREATERTHANOREQUALTO)||(LA32_21 >= Identifier && LA32_21 <= KW_CASCADE)||LA32_21==KW_CHANGE||(LA32_21 >= KW_CLUSTER && LA32_21 <= KW_COLLECTION)||(LA32_21 >= KW_COLUMNS && LA32_21 <= KW_CONCATENATE)||(LA32_21 >= KW_CONTINUE && LA32_21 <= KW_CUBE)||(LA32_21 >= KW_CURSOR && LA32_21 <= KW_DATA)||(LA32_21 >= KW_DATABASES && LA32_21 <= KW_DISABLE)||(LA32_21 >= KW_DISTRIBUTE && LA32_21 <= KW_ESCAPED)||(LA32_21 >= KW_EXCLUSIVE && LA32_21 <= KW_EXPORT)||(LA32_21 >= KW_EXTERNAL && LA32_21 <= KW_FLOAT)||(LA32_21 >= KW_FOR && LA32_21 <= KW_FULL)||(LA32_21 >= KW_FUNCTIONS && LA32_21 <= KW_IDXPROPERTIES)||(LA32_21 >= KW_IGNORE && LA32_21 <= KW_LEFT)||(LA32_21 >= KW_LIKE && LA32_21 <= KW_LONG)||(LA32_21 >= KW_MAP && LA32_21 <= KW_MINUS)||(LA32_21 >= KW_MSCK && LA32_21 <= KW_OFFLINE)||(LA32_21 >= KW_OPTION && LA32_21 <= KW_OUTPUTFORMAT)||(LA32_21 >= KW_OVERWRITE && LA32_21 <= KW_OWNER)||(LA32_21 >= KW_PARTITION && LA32_21 <= KW_PLUS)||(LA32_21 >= KW_PRETTY && LA32_21 <= KW_TABLES)||(LA32_21 >= KW_TBLPROPERTIES && LA32_21 <= KW_TRANSACTIONS)||(LA32_21 >= KW_TRIGGER && LA32_21 <= KW_UNARCHIVE)||(LA32_21 >= KW_UNDO && LA32_21 <= KW_UNIONTYPE)||(LA32_21 >= KW_UNLOCK && LA32_21 <= KW_VALUE_TYPE)||(LA32_21 >= KW_VIEW && LA32_21 <= KW_WITH)||(LA32_21 >= LESSTHAN && LA32_21 <= LESSTHANOREQUALTO)||LA32_21==LSQUARE||(LA32_21 >= MINUS && LA32_21 <= NOTEQUAL)||LA32_21==PLUS||(LA32_21 >= RPAREN && LA32_21 <= RSQUARE)||LA32_21==STAR) ) {s = 90;}

                         
                        input.seek(index32_21);

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_691 = input.LA(1);

                         
                        int index32_691 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 23;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_691);

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_692 = input.LA(1);

                         
                        int index32_692 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 23;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_692);

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_693 = input.LA(1);

                         
                        int index32_693 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_693);

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_694 = input.LA(1);

                         
                        int index32_694 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_694);

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_695 = input.LA(1);

                         
                        int index32_695 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_695);

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_696 = input.LA(1);

                         
                        int index32_696 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_696);

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_697 = input.LA(1);

                         
                        int index32_697 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 2;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_697);

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_698 = input.LA(1);

                         
                        int index32_698 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 2;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_698);

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_699 = input.LA(1);

                         
                        int index32_699 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 2;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_699);

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_700 = input.LA(1);

                         
                        int index32_700 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 2;}

                        else if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                         
                        input.seek(index32_700);

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_701 = input.LA(1);

                         
                        int index32_701 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_701);

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_702 = input.LA(1);

                         
                        int index32_702 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_702);

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_703 = input.LA(1);

                         
                        int index32_703 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_703);

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_704 = input.LA(1);

                         
                        int index32_704 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_704);

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_705 = input.LA(1);

                         
                        int index32_705 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_705);

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_706 = input.LA(1);

                         
                        int index32_706 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_706);

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_707 = input.LA(1);

                         
                        int index32_707 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_707);

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_708 = input.LA(1);

                         
                        int index32_708 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_708);

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_709 = input.LA(1);

                         
                        int index32_709 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_709);

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_710 = input.LA(1);

                         
                        int index32_710 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_IdentifiersParser()) ) {s = 628;}

                        else if ( (true) ) {s = 90;}

                         
                        input.seek(index32_710);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA33_eotS =
        "\100\uffff";
    static final String DFA33_eofS =
        "\1\1\77\uffff";
    static final String DFA33_minS =
        "\1\4\77\uffff";
    static final String DFA33_maxS =
        "\1\u012c\77\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\3\74\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\100\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\77\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\27\1\2\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff"+
            "\63\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff"+
            "\6\1\1\uffff\2\1\1\uffff\1\76\1\uffff\3\1\1\uffff\1\1\3\uffff"+
            "\2\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 284:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*";
        }
    }
    static final String DFA36_eotS =
        "\123\uffff";
    static final String DFA36_eofS =
        "\2\2\121\uffff";
    static final String DFA36_minS =
        "\1\4\1\12\121\uffff";
    static final String DFA36_maxS =
        "\1\u012c\1\u0128\121\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\73\uffff\1\1\24\uffff";
    static final String DFA36_specialS =
        "\123\uffff}>";
    static final String[] DFA36_transitionS = {
            "\3\2\3\uffff\1\2\3\uffff\2\2\4\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\27\2\2\uffff\1\2\1\uffff\4\2\1\uffff\6\2\1\uffff\4\2\1\uffff"+
            "\2\2\1\uffff\20\2\1\uffff\10\2\1\uffff\4\2\1\uffff\10\2\1\uffff"+
            "\5\2\1\uffff\7\2\1\uffff\15\2\1\1\7\2\1\uffff\12\2\1\uffff\4"+
            "\2\1\uffff\10\2\1\uffff\7\2\1\uffff\2\2\1\uffff\5\2\2\uffff"+
            "\63\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\14\2\1\uffff"+
            "\6\2\1\uffff\2\2\3\uffff\3\2\1\uffff\1\2\3\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\2\52\uffff\1\2\44\uffff\1\2\31\uffff\1\2\4\uffff\1\2\1\uffff"+
            "\1\2\14\uffff\1\2\11\uffff\1\2\3\uffff\1\2\11\uffff\1\2\7\uffff"+
            "\1\76\1\uffff\1\76\5\uffff\1\2\33\uffff\1\2\20\uffff\1\2\13"+
            "\uffff\1\2\32\uffff\1\2\21\uffff\1\2\1\uffff\1\2\17\uffff\1"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "304:39: (a= KW_IS nullCondition )?";
        }
    }
    static final String DFA37_eotS =
        "\75\uffff";
    static final String DFA37_eofS =
        "\1\1\74\uffff";
    static final String DFA37_minS =
        "\1\4\74\uffff";
    static final String DFA37_maxS =
        "\1\u012c\74\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\72\uffff\1\1";
    static final String DFA37_specialS =
        "\75\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\1\1\74\3\uffff\1\1\3\uffff\2\1\4\uffff\2\1\1\uffff\2\1\1"+
            "\uffff\27\1\2\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\4\1"+
            "\1\uffff\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10"+
            "\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff"+
            "\63\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff"+
            "\6\1\1\uffff\2\1\3\uffff\3\1\1\uffff\1\1\3\uffff\2\1\2\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*";
        }
    }
    static final String DFA38_eotS =
        "\74\uffff";
    static final String DFA38_eofS =
        "\1\1\73\uffff";
    static final String DFA38_minS =
        "\1\4\73\uffff";
    static final String DFA38_maxS =
        "\1\u012c\73\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\71\uffff\1\1";
    static final String DFA38_specialS =
        "\74\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\1\4\uffff\1\1\3\uffff\2\73\4\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\27\1\2\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\4\1\1\uffff"+
            "\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff\63\1\1\uffff"+
            "\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff\6\1\1\uffff"+
            "\2\1\3\uffff\1\1\1\73\1\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1"+
            "\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 328:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*";
        }
    }
    static final String DFA44_eotS =
        "\167\uffff";
    static final String DFA44_eofS =
        "\26\uffff\1\1\140\uffff";
    static final String DFA44_minS =
        "\1\7\25\uffff\1\4\3\uffff\1\7\122\uffff\1\0\11\uffff";
    static final String DFA44_maxS =
        "\1\u0130\25\uffff\1\u012c\3\uffff\1\u0130\122\uffff\1\0\11\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\163\uffff\2\2";
    static final String DFA44_specialS =
        "\32\uffff\1\0\122\uffff\1\1\11\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\22\1\1\uffff"+
            "\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\26\2"+
            "\1\1\uffff\10\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\23\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\uffff\5\1\1\uffff\2\1\1\uffff\5\1\2\uffff"+
            "\14\1\1\uffff\20\1\1\uffff\25\1\1\uffff\3\1\1\uffff\5\1\1\uffff"+
            "\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\2\1\10\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\1\uffff\27\1\2\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff\12\1\1\uffff"+
            "\4\1\1\uffff\10\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff"+
            "\63\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14\1\1\uffff"+
            "\6\1\1\uffff\2\1\1\32\1\1\1\uffff\3\1\1\uffff\1\1\3\uffff\2"+
            "\1\2\uffff\1\1",
            "",
            "",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\22\1\1\uffff"+
            "\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\25\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff"+
            "\12\1\1\uffff\1\155\3\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1"+
            "\1\uffff\2\1\1\uffff\5\1\2\uffff\14\1\1\166\20\1\1\165\25\1"+
            "\1\uffff\3\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff\14"+
            "\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff\1"+
            "\1\2\uffff\2\1\3\uffff\1\1\3\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "381:1: precedenceEqualExpression : ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* | ( KW_EXISTS LPAREN KW_SELECT )=> ( KW_EXISTS subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_EXISTS ) subQueryExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_26 = input.LA(1);

                         
                        int index44_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA44_26==BigintLiteral||LA44_26==CharSetName||LA44_26==DecimalLiteral||(LA44_26 >= Identifier && LA44_26 <= KW_ANALYZE)||(LA44_26 >= KW_ARCHIVE && LA44_26 <= KW_CHANGE)||(LA44_26 >= KW_CLUSTER && LA44_26 <= KW_COLLECTION)||(LA44_26 >= KW_COLUMNS && LA44_26 <= KW_CONCATENATE)||(LA44_26 >= KW_CONTINUE && LA44_26 <= KW_CREATE)||LA44_26==KW_CUBE||(LA44_26 >= KW_CURSOR && LA44_26 <= KW_DATA)||(LA44_26 >= KW_DATABASES && LA44_26 <= KW_ELEM_TYPE)||LA44_26==KW_ENABLE||LA44_26==KW_ESCAPED||(LA44_26 >= KW_EXCLUSIVE && LA44_26 <= KW_EXPORT)||(LA44_26 >= KW_EXTERNAL && LA44_26 <= KW_FLOAT)||(LA44_26 >= KW_FOR && LA44_26 <= KW_FORMATTED)||LA44_26==KW_FULL||(LA44_26 >= KW_FUNCTIONS && LA44_26 <= KW_GROUPING)||(LA44_26 >= KW_HOLD_DDLTIME && LA44_26 <= KW_JAR)||(LA44_26 >= KW_KEYS && LA44_26 <= KW_LEFT)||(LA44_26 >= KW_LIKE && LA44_26 <= KW_LONG)||(LA44_26 >= KW_MAPJOIN && LA44_26 <= KW_MINUS)||(LA44_26 >= KW_MSCK && LA44_26 <= KW_OFFLINE)||LA44_26==KW_OPTION||(LA44_26 >= KW_ORDER && LA44_26 <= KW_OUTPUTFORMAT)||(LA44_26 >= KW_OVERWRITE && LA44_26 <= KW_OWNER)||(LA44_26 >= KW_PARTITION && LA44_26 <= KW_PLUS)||(LA44_26 >= KW_PRETTY && LA44_26 <= KW_RECORDWRITER)||(LA44_26 >= KW_REGEXP && LA44_26 <= KW_SCHEMAS)||(LA44_26 >= KW_SEMI && LA44_26 <= KW_TABLES)||(LA44_26 >= KW_TBLPROPERTIES && LA44_26 <= KW_TERMINATED)||(LA44_26 >= KW_TIMESTAMP && LA44_26 <= KW_TRANSACTIONS)||(LA44_26 >= KW_TRIGGER && LA44_26 <= KW_UNARCHIVE)||(LA44_26 >= KW_UNDO && LA44_26 <= KW_UNIONTYPE)||(LA44_26 >= KW_UNLOCK && LA44_26 <= KW_VALUE_TYPE)||LA44_26==KW_VIEW||LA44_26==KW_WHILE||LA44_26==KW_WITH||LA44_26==LPAREN||LA44_26==MINUS||(LA44_26 >= Number && LA44_26 <= PLUS)||LA44_26==RPAREN||(LA44_26 >= STAR && LA44_26 <= TinyintLiteral)) ) {s = 1;}

                        else if ( (LA44_26==KW_MAP) ) {s = 109;}

                        else if ( (LA44_26==KW_SELECT) && (synpred8_IdentifiersParser())) {s = 117;}

                        else if ( (LA44_26==KW_REDUCE) && (synpred8_IdentifiersParser())) {s = 118;}

                         
                        input.seek(index44_26);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_109 = input.LA(1);

                         
                        int index44_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred8_IdentifiersParser()) ) {s = 118;}

                         
                        input.seek(index44_109);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA43_eotS =
        "\u03aa\uffff";
    static final String DFA43_eofS =
        "\1\1\53\uffff\1\1\1\uffff\1\1\7\uffff\1\1\5\uffff\1\57\1\uffff\4"+
        "\57\1\uffff\2\57\1\uffff\2\57\u0362\uffff";
    static final String DFA43_minS =
        "\1\12\53\uffff\1\7\1\50\1\12\7\uffff\1\7\5\uffff\1\4\1\uffff\4\4"+
        "\1\uffff\2\4\1\uffff\2\4\1\uffff\1\7\27\uffff\1\u011d\25\uffff\1"+
        "\7\4\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff\2\4\1\uffff\1\7\u027b"+
        "\uffff\1\0\1\uffff\1\0\u00a2\uffff";
    static final String DFA43_maxS =
        "\1\u0129\53\uffff\1\u0130\1\u00d5\1\u0128\7\uffff\1\u0130\5\uffff"+
        "\1\u012c\1\uffff\4\u012c\1\uffff\2\u012c\1\uffff\2\u012c\1\uffff"+
        "\1\u0130\27\uffff\1\u011d\25\uffff\1\u0130\4\uffff\1\u012c\1\uffff"+
        "\4\u012c\1\uffff\2\u012c\1\uffff\2\u012c\1\uffff\1\u0130\u027b\uffff"+
        "\1\0\1\uffff\1\0\u00a2\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\11\55\uffff\1\2\62\uffff\1\7\1\1\47\uffff\1\10\25\uffff"+
        "\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\u0081"+
        "\uffff\1\2\100\uffff\1\2\100\uffff\2\2\127\uffff\1\2\3\uffff\1\5"+
        "\1\uffff\1\5\1\6\u009b\uffff\1\10\2\uffff\1\3\1\4";
    static final String DFA43_specialS =
        "\167\uffff\1\0\u028d\uffff\1\1\1\uffff\1\2\u00a2\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\11\uffff\2\57\1\uffff\2\57\1\uffff\16\1\1\66\10\1\2\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\4\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\10\1\1\uffff\4\1\1\uffff\10\1\1\uffff\5\1\1\uffff"+
            "\7\1\1\uffff\2\1\1\56\22\1\1\uffff\1\54\11\1\1\uffff\4\1\1\uffff"+
            "\3\1\1\55\4\1\1\uffff\7\1\1\uffff\2\1\1\uffff\5\1\2\uffff\15"+
            "\1\1\54\7\1\1\54\35\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1"+
            "\uffff\14\1\1\uffff\6\1\1\uffff\2\57\5\uffff\1\57\5\uffff\2"+
            "\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\2\uffff\1\1\2\uffff\1\57\4\uffff\1\57\7\uffff\7\57\1"+
            "\uffff\22\57\1\uffff\1\77\3\57\1\uffff\6\57\1\uffff\2\57\1\uffff"+
            "\1\57\1\uffff\2\57\1\uffff\20\57\1\uffff\1\100\3\57\1\uffff"+
            "\1\57\1\uffff\1\57\1\uffff\4\57\1\uffff\10\57\1\uffff\3\57\1"+
            "\1\1\57\1\uffff\2\57\1\74\1\57\1\1\14\57\1\107\6\57\1\uffff"+
            "\2\57\1\106\1\57\1\uffff\1\57\1\103\10\57\1\uffff\1\111\3\57"+
            "\1\uffff\3\57\1\uffff\4\57\1\uffff\1\57\1\uffff\1\76\4\57\1"+
            "\uffff\2\57\1\uffff\5\57\2\uffff\14\57\1\1\20\57\1\1\13\57\1"+
            "\101\11\57\1\uffff\3\57\1\uffff\5\57\1\uffff\4\57\1\uffff\1"+
            "\57\1\104\1\57\1\uffff\14\57\1\uffff\1\57\1\uffff\1\1\1\57\1"+
            "\1\1\57\3\uffff\1\57\2\uffff\1\57\2\uffff\2\57\3\uffff\1\1\4"+
            "\uffff\4\57",
            "\1\142\130\uffff\1\141\23\uffff\1\143\67\uffff\1\143\7\uffff"+
            "\1\143",
            "\1\1\52\uffff\1\1\44\uffff\1\1\31\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\1\1\14\uffff\1\1\11\uffff\1\1\3\uffff\1\1\11\uffff\1\1\17\uffff"+
            "\1\1\33\uffff\1\1\20\uffff\1\1\13\uffff\1\1\32\uffff\1\1\21"+
            "\uffff\1\1\1\uffff\1\1\4\uffff\1\167\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008b\2\uffff\1\1\2\uffff\1\u008b\4\uffff\1\u008b\7\uffff"+
            "\7\u008b\1\uffff\22\u008b\1\uffff\1\177\3\u008b\1\uffff\6\u008b"+
            "\1\uffff\2\u008b\1\uffff\1\u008b\1\uffff\2\u008b\1\uffff\20"+
            "\u008b\1\uffff\1\u0080\3\u008b\1\uffff\1\u008b\1\uffff\1\u008b"+
            "\1\uffff\4\u008b\1\uffff\10\u008b\1\uffff\3\u008b\1\1\1\u008b"+
            "\1\uffff\2\u008b\1\174\1\u008b\1\1\14\u008b\1\u0087\6\u008b"+
            "\1\uffff\2\u008b\1\u0086\1\u008b\1\uffff\1\u008b\1\u0083\10"+
            "\u008b\1\uffff\1\u0089\3\u008b\1\uffff\3\u008b\1\uffff\4\u008b"+
            "\1\uffff\1\u008b\1\uffff\1\176\4\u008b\1\uffff\2\u008b\1\uffff"+
            "\5\u008b\2\uffff\14\u008b\1\1\20\u008b\1\1\13\u008b\1\u0081"+
            "\11\u008b\1\uffff\3\u008b\1\uffff\5\u008b\1\uffff\4\u008b\1"+
            "\uffff\1\u008b\1\u0084\1\u008b\1\uffff\14\u008b\1\uffff\1\u008b"+
            "\1\uffff\1\1\1\u008b\1\1\1\u008b\3\uffff\1\u008b\2\uffff\1\u008b"+
            "\2\uffff\2\u008b\3\uffff\1\1\4\uffff\4\u008b",
            "",
            "",
            "",
            "",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\25\57\1\u00a1\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\25\57\1\u00e2\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\25\57\1\u0123\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\25\57\1\u0164\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\25\57\1\u01a5\1\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\27\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\7\57"+
            "\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff\11\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57\1\uffff\4\57\1"+
            "\uffff\3\57\1\1\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\4\57\1\u0227\22\57\2\uffff\1\57\1\uffff"+
            "\4\57\1\uffff\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1"+
            "\uffff\10\57\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff"+
            "\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff"+
            "\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\6\57"+
            "\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff"+
            "\1\57",
            "",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\27\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57\1\uffff\7\57"+
            "\1\uffff\2\57\1\uffff\5\57\2\uffff\63\57\1\uffff\11\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff\1\u0268\5\57\1\uffff"+
            "\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2\uffff\1\57",
            "\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1"+
            "\uffff\2\57\1\uffff\27\57\2\uffff\1\57\1\uffff\4\57\1\uffff"+
            "\6\57\1\uffff\4\57\1\uffff\2\57\1\uffff\20\57\1\uffff\10\57"+
            "\1\uffff\4\57\1\uffff\10\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
            "\14\57\1\u02aa\10\57\1\uffff\12\57\1\uffff\4\57\1\uffff\10\57"+
            "\1\uffff\7\57\1\uffff\1\u02a9\1\57\1\uffff\5\57\2\uffff\63\57"+
            "\1\uffff\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\14\57\1\uffff"+
            "\6\57\1\uffff\4\57\1\uffff\3\57\1\uffff\1\57\3\uffff\2\57\2"+
            "\uffff\1\57",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\22\1\1\uffff"+
            "\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff"+
            "\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
            "\5\1\1\uffff\2\1\1\uffff\5\1\2\uffff\14\1\1\uffff\20\1\1\uffff"+
            "\25\1\1\uffff\3\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\14\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u0302\2"+
            "\uffff\1\1\2\uffff\2\1\7\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0305",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0309\5\uffff\1\u0309\4\uffff\1\u0309\7\uffff\7\u0309\1"+
            "\uffff\22\u0309\1\uffff\4\u0309\1\uffff\6\u0309\1\uffff\2\u0309"+
            "\1\uffff\1\u0309\1\uffff\2\u0309\1\uffff\20\u0309\1\uffff\4"+
            "\u0309\1\uffff\1\u0309\1\uffff\1\u0309\1\uffff\4\u0309\1\uffff"+
            "\10\u0309\1\uffff\3\u0309\1\uffff\1\u0309\1\uffff\4\u0309\1"+
            "\uffff\23\u0309\1\uffff\4\u0309\1\uffff\12\u0309\1\uffff\1\u0307"+
            "\3\u0309\1\uffff\10\u0309\1\uffff\1\u0309\1\uffff\5\u0309\1"+
            "\uffff\2\u0309\1\uffff\5\u0309\2\uffff\14\u0309\1\u0308\20\u0309"+
            "\1\u0306\25\u0309\1\uffff\3\u0309\1\uffff\5\u0309\1\uffff\4"+
            "\u0309\1\uffff\3\u0309\1\uffff\14\u0309\1\uffff\1\u0309\2\uffff"+
            "\1\u0309\1\uffff\1\u0309\3\uffff\1\u0309\2\uffff\1\u0309\2\uffff"+
            "\2\u0309\10\uffff\4\u0309",
            "",
            "",
            "",
            "",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\15"+
            "\uffff\1\1\134\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\15"+
            "\uffff\1\1\134\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\15"+
            "\uffff\1\1\134\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\15"+
            "\uffff\1\1\134\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\15"+
            "\uffff\1\1\134\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\152"+
            "\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b\1\uffff\1"+
            "\1\1\u008b\7\uffff\1\u008b",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\14\uffff\1\1\2\uffff"+
            "\1\u008b\152\uffff\1\u008b\u0090\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\152"+
            "\uffff\1\u008b\u0087\uffff\1\1\10\uffff\2\u008b\1\uffff\2\u008b"+
            "\2\uffff\1\u008b\7\uffff\1\u008b",
            "\3\u008b\7\uffff\2\u008b\1\uffff\1\u008b\17\uffff\1\u008b\151"+
            "\uffff\1\1\1\u008b\51\uffff\1\1\146\uffff\2\u008b\1\uffff\2"+
            "\u008b\2\uffff\1\u008b\7\uffff\1\u008b",
            "",
            "\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\7\1\1\uffff\22\1\1\uffff"+
            "\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\20\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\10\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\23\1\1\uffff"+
            "\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
            "\5\1\1\uffff\2\1\1\uffff\5\1\2\uffff\14\1\1\uffff\20\1\1\uffff"+
            "\25\1\1\uffff\3\1\1\uffff\5\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
            "\14\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u03a5\2"+
            "\uffff\1\1\2\uffff\2\1\7\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 384:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN LPAREN KW_SELECT )=> ( KW_NOT KW_IN subQueryExpression ) -> ^( KW_NOT ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) ) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN LPAREN KW_SELECT )=> ( KW_IN subQueryExpression ) -> ^( TOK_SUBQUERY_EXPR ^( TOK_SUBQUERY_OP KW_IN ) subQueryExpression $precedenceEqualExpression) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_119 = input.LA(1);

                         
                        int index43_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA43_119==KW_SELECT) && (synpred7_IdentifiersParser())) {s = 774;}

                        else if ( (LA43_119==KW_MAP) ) {s = 775;}

                        else if ( (LA43_119==KW_REDUCE) && (synpred7_IdentifiersParser())) {s = 776;}

                        else if ( (LA43_119==BigintLiteral||LA43_119==CharSetName||LA43_119==DecimalLiteral||(LA43_119 >= Identifier && LA43_119 <= KW_ANALYZE)||(LA43_119 >= KW_ARCHIVE && LA43_119 <= KW_CHANGE)||(LA43_119 >= KW_CLUSTER && LA43_119 <= KW_COLLECTION)||(LA43_119 >= KW_COLUMNS && LA43_119 <= KW_CONCATENATE)||(LA43_119 >= KW_CONTINUE && LA43_119 <= KW_CREATE)||LA43_119==KW_CUBE||(LA43_119 >= KW_CURSOR && LA43_119 <= KW_DATA)||(LA43_119 >= KW_DATABASES && LA43_119 <= KW_DISABLE)||(LA43_119 >= KW_DISTRIBUTE && LA43_119 <= KW_ELEM_TYPE)||LA43_119==KW_ENABLE||LA43_119==KW_ESCAPED||(LA43_119 >= KW_EXCLUSIVE && LA43_119 <= KW_EXPORT)||(LA43_119 >= KW_EXTERNAL && LA43_119 <= KW_FLOAT)||(LA43_119 >= KW_FOR && LA43_119 <= KW_FORMATTED)||LA43_119==KW_FULL||(LA43_119 >= KW_FUNCTIONS && LA43_119 <= KW_GROUPING)||(LA43_119 >= KW_HOLD_DDLTIME && LA43_119 <= KW_JAR)||(LA43_119 >= KW_KEYS && LA43_119 <= KW_LEFT)||(LA43_119 >= KW_LIKE && LA43_119 <= KW_LONG)||(LA43_119 >= KW_MAPJOIN && LA43_119 <= KW_MINUS)||(LA43_119 >= KW_MSCK && LA43_119 <= KW_OFFLINE)||LA43_119==KW_OPTION||(LA43_119 >= KW_ORDER && LA43_119 <= KW_OUTPUTFORMAT)||(LA43_119 >= KW_OVERWRITE && LA43_119 <= KW_OWNER)||(LA43_119 >= KW_PARTITION && LA43_119 <= KW_PLUS)||(LA43_119 >= KW_PRETTY && LA43_119 <= KW_RECORDWRITER)||(LA43_119 >= KW_REGEXP && LA43_119 <= KW_SCHEMAS)||(LA43_119 >= KW_SEMI && LA43_119 <= KW_TABLES)||(LA43_119 >= KW_TBLPROPERTIES && LA43_119 <= KW_TERMINATED)||(LA43_119 >= KW_TIMESTAMP && LA43_119 <= KW_TRANSACTIONS)||(LA43_119 >= KW_TRIGGER && LA43_119 <= KW_UNARCHIVE)||(LA43_119 >= KW_UNDO && LA43_119 <= KW_UNIONTYPE)||(LA43_119 >= KW_UNLOCK && LA43_119 <= KW_VALUE_TYPE)||LA43_119==KW_VIEW||LA43_119==KW_WHILE||LA43_119==KW_WITH||LA43_119==LPAREN||LA43_119==MINUS||(LA43_119 >= Number && LA43_119 <= PLUS)||(LA43_119 >= SmallintLiteral && LA43_119 <= TinyintLiteral)) ) {s = 777;}

                         
                        input.seek(index43_119);

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_773 = input.LA(1);

                         
                        int index43_773 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred6_IdentifiersParser()) ) {s = 936;}

                        else if ( (true) ) {s = 937;}

                         
                        input.seek(index43_773);

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_775 = input.LA(1);

                         
                        int index43_775 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_IdentifiersParser()) ) {s = 776;}

                        else if ( (true) ) {s = 777;}

                         
                        input.seek(index43_775);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_KW_GROUP_in_groupByClause72 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_groupByClause74 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause80 = new BitSet(new long[]{0x0000000000000402L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause88 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupByExpression_in_groupByClause90 = new BitSet(new long[]{0x0000000000000402L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_ROLLUP_in_groupByClause105 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_WITH_in_groupByClause113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_CUBE_in_groupByClause115 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_KW_GROUPING_in_groupByClause128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_KW_SETS_in_groupByClause130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_groupByClause137 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause139 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupByClause143 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause145 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupByClause150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression265 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression271 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_groupingSetExpression274 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression276 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_groupByExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_HAVING_in_havingClause381 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_havingCondition_in_havingClause383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_havingCondition422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ORDER_in_orderByClause454 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_orderByClause456 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause458 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_orderByClause462 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_orderByClause464 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause506 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_clusterByClause514 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_clusterByClause516 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause519 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_clusterByClause521 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_clusterByClause525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause546 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_clusterByClause548 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_clusterByClause554 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_clusterByClause566 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_clusterByClause568 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause612 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionByClause620 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_partitionByClause622 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause625 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_partitionByClause627 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionByClause631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause652 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_partitionByClause654 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_partitionByClause660 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_partitionByClause668 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_partitionByClause670 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause712 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_distributeByClause720 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_distributeByClause722 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause725 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_distributeByClause727 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_distributeByClause731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause752 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_distributeByClause754 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_distributeByClause760 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_distributeByClause768 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_distributeByClause770 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause812 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_sortByClause820 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause822 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause830 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause832 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_sortByClause836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SORT_in_sortByClause857 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KW_BY_in_sortByClause859 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause865 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_sortByClause878 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_columnRefOrder_in_sortByClause880 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_functionName_in_function923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_function929 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABFFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001F1192297FFBBL});
    public static final BitSet FOLLOW_STAR_in_function950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_KW_DISTINCT_in_function966 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001F1192297FFBBL});
    public static final BitSet FOLLOW_selectExpression_in_function971 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_function974 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001F0192297FFBBL});
    public static final BitSet FOLLOW_selectExpression_in_function976 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_function994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_OVER_in_function997 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_window_specification_in_function1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_functionName1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ARRAY_in_functionName1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAP_in_functionName1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STRUCT_in_functionName1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIONTYPE_in_functionName1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionIdentifier_in_functionName1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CAST_in_castExpression1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression1190 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_castExpression1202 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AS_in_castExpression1214 = new BitSet(new long[]{0x00100E0000000000L,0x0000800008002C00L,0x0000000000000200L,0x0300810000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_caseExpression1273 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_caseExpression1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_WHEN_in_caseExpression1282 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_caseExpression1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_caseExpression1286 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_caseExpression1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_ELSE_in_caseExpression1297 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_caseExpression1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_END_in_caseExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_whenExpression1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_WHEN_in_whenExpression1358 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_whenExpression1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_THEN_in_whenExpression1362 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_whenExpression1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_ELSE_in_whenExpression1373 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_whenExpression1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_END_in_whenExpression1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_constant1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_constant1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestampLiteral_in_constant1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_constant1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralSequence_in_constant1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BigintLiteral_in_constant1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SmallintLiteral_in_constant1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TinyintLiteral_in_constant1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_constant1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_charSetStringLiteral_in_constant1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValue_in_constant1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral1573 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DATE_in_dateLiteral1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dateLiteral1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TIMESTAMP_in_timestampLiteral1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_timestampLiteral1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceOrExpression_in_expression1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_atomExpression1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atomExpression1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_atomExpression1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpression_in_atomExpression1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_atomExpression1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_atomExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableOrColumn_in_atomExpression1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExpression1771 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_atomExpression1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExpression1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression1799 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression1803 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_precedenceFieldExpression1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression1808 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression1815 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_identifier_in_precedenceFieldExpression1818 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_nullCondition1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_NULL_in_nullCondition1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1915 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2013 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2016 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2019 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2076 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100200000000L});
    public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression2079 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2082 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100200000000L});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression2134 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2182 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2185 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2188 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2233 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2236 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2239 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_precedenceEqualOperator2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_NS_in_precedenceEqualOperator2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_precedenceEqualOperator2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_precedenceEqualOperator2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_precedenceEqualOperator2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQueryExpression2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L,0x0000000020001000L});
    public static final BitSet FOLLOW_selectStatement_in_subQueryExpression2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subQueryExpression2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2378 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000000000202000L});
    public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2402 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2406 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2439 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2443 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2488 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2531 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2577 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2614 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2645 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2647 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2652 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2655 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2660 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2700 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2705 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2708 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5EEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2713 = new BitSet(new long[]{0x0000010001B00002L,0x0000000000000000L,0x0000010000200002L,0x0000000000202000L,0x0000000418000000L});
    public static final BitSet FOLLOW_KW_EXISTS_in_precedenceEqualExpression2768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_subQueryExpression_in_precedenceEqualExpression2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expressions2806 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_expressions2808 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_expressions2811 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_expression_in_expressions2813 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_expressions2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression2865 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2913 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression2916 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2919 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression2967 = new BitSet(new long[]{0xFDEFFFFDFC042080L,0xF7AEFF7ABDFFFED6L,0x3EDF5FEF7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x0001E0192297FFBBL});
    public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2970 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_KW_TRUE_in_booleanValue2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_booleanValue2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableOrPartition3019 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_tableOrPartition3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec3053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionSpec3060 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3062 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionSpec3065 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_partitionVal_in_partitionSpec3068 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionSpec3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_partitionVal3104 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_partitionVal3107 = new BitSet(new long[]{0x0000000000042080L,0x0000020000000400L,0x0000000000000000L,0x8100000000000000L,0x0001600800000000L});
    public static final BitSet FOLLOW_constant_in_partitionVal3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_dropPartitionSpec3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_dropPartitionSpec3150 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3152 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_COMMA_in_dropPartitionSpec3155 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3158 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dropPartitionSpec3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_dropPartitionVal3194 = new BitSet(new long[]{0x0000000001900000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000418000000L});
    public static final BitSet FOLLOW_dropPartitionOperator_in_dropPartitionVal3196 = new BitSet(new long[]{0x0000000000042080L,0x0000020000000400L,0x0000000000000000L,0x8100000000000000L,0x0001600800000000L});
    public static final BitSet FOLLOW_constant_in_dropPartitionVal3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sysFuncNames_in_descFuncNames3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_descFuncNames3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionIdentifier_in_descFuncNames3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonReserved_in_identifier3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3696 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_functionIdentifier3698 = new BitSet(new long[]{0xFDE9FFFDFC000000L,0xB7AEFF7ABDFFFED6L,0x3EDF5EEE7FEF7FFFL,0xDF77FFFFDFFFEFFFL,0x000000000297FFBBL});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionIdentifier3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_principalIdentifier3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotedIdentifier_in_principalIdentifier3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred1_IdentifiersParser563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred2_IdentifiersParser664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred3_IdentifiersParser764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_IdentifiersParser874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_synpred5_IdentifiersParser1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred5_IdentifiersParser1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_synpred6_IdentifiersParser2472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_synpred6_IdentifiersParser2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred6_IdentifiersParser2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred6_IdentifiersParser2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IN_in_synpred7_IdentifiersParser2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred7_IdentifiersParser2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred7_IdentifiersParser2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXISTS_in_synpred8_IdentifiersParser2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred8_IdentifiersParser2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_SELECT_in_synpred8_IdentifiersParser2763 = new BitSet(new long[]{0x0000000000000002L});

}