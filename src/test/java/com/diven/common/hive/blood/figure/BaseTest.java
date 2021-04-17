package com.diven.common.hive.blood.figure;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BaseTest extends TestCase{
	
	static String hqls [] = {
			"create table temp.b1(id string, name string) row format delimited fields terminated by ',';",
			"create table temp.b2(id string, age int) row format delimited fields terminated by ',';",
			"create table temp.c1(id string, name string) row format delimited fields terminated by ',';",
			"create table temp.c2(id string, age int) row format delimited fields terminated by ',';" ,
			"create table temp.d1(id string, name string, age int) row format delimited fields terminated by ',';",
			"from temp.a1 insert into table temp.b1 select id, name insert into table temp.b2 select id, age;",
			"insert overwrite table temp.c1 select id, name from temp.b1;",
			"insert overwrite table temp.c2 select id, age from temp.b2;" ,
			"insert overwrite table temp.d1 select t1.id, t1.name, t2.age from temp.c1 t1 join temp.c2 t2 on t1.id = t2.id;"
	};
	

	/**
	 * 输出标准的json字符串
	 * @param obj
	 */
	public static void printJsonString(Object obj) {
		String str = JSON.toJSONString(obj, 
				SerializerFeature.WriteMapNullValue, 
				SerializerFeature.WriteNullListAsEmpty, 
				SerializerFeature.DisableCircularReferenceDetect, 
				SerializerFeature.PrettyFormat);
		System.out.println(str);
	}
	
}
