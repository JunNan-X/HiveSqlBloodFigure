package com.diven.common.hive.blood.factory;

import java.util.Arrays;
import java.util.List;

import com.diven.common.hive.blood.api.HiveBloodEngine;
import com.diven.common.hive.blood.api.HiveBloodEngineImpl;
import com.diven.common.hive.blood.model.FieldBlood;
import com.diven.common.hive.blood.model.HiveField;
import com.diven.common.hive.blood.model.HiveTable;
import com.diven.common.hive.blood.model.SQLResult;
import com.diven.common.hive.blood.model.TableBlood;

/**
 * 血缘工具
 * 方便于应用程序直接调用
 * @author diven
 *
 */
public class HiveSqlBloodFactory {
	
	/**血缘引擎**/
	private final static HiveBloodEngine bloodEngine = new HiveBloodEngineImpl();
	
	/**
	 * 解析字段血缘
	 * @param hsql	sqls
	 * @return	血缘关系
	 * @throws Exception
	 */
	public static List<SQLResult> parser(String[] hsql) throws Exception{
		return bloodEngine.parser(Arrays.asList(hsql));
	}
	
	/**
	 * 解析字段血缘
	 * @param hsql	sqls
	 * @return	血缘关系
	 * @throws Exception
	 */
	public static List<SQLResult> parser(List<String> hsql) throws Exception{
		return bloodEngine.parser(hsql);
	}
	
	/**
	 * 解析字段血缘
	 * @param hsql	sqls
	 * @return	血缘关系
	 * @throws Exception
	 */
	public static List<SQLResult> parser(String hsql) throws Exception{
		return bloodEngine.parser(Arrays.asList(hsql.split(";")));
	}
	
	/**
	 * 获取当前sql的表血缘
	 * @param hqls hive sql 语句
	 * @return	表血缘
	 */
	public static TableBlood getTableBlood(String[] hqls) throws Exception{
		return bloodEngine.getTableBlood(Arrays.asList(hqls));
	}
	
	/**
	 * 获取当前sql的表血缘
	 * @param hqls hive sql 语句
	 * @return	表血缘
	 */
	public static TableBlood getTableBlood(List<String> hqls) throws Exception{
		return bloodEngine.getTableBlood(hqls);
	}
	
	/**
	 * 获取当前sql的表血缘
	 * @param hqls hive sql 语句
	 * @return	表血缘
	 */
	public static TableBlood getTableBlood(String hqls) throws Exception{
		return bloodEngine.getTableBlood(Arrays.asList(hqls.split(";")));
	}
	
	/**
	 * 根据血缘图获取指定表的属性字段
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 * @return	属性字段列表
	 */
	public static List<HiveField> getTableFields(String[] hqls, HiveTable table) throws Exception{
		return bloodEngine.getTableFields(Arrays.asList(hqls), table);
	}
	
	/**
	 * 根据血缘图获取指定表的属性字段
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 * @return	属性字段列表
	 */
	public static List<HiveField> getTableFields(List<String> hqls, HiveTable table) throws Exception{
		return bloodEngine.getTableFields(hqls, table);
	}
	
	/**
	 * 根据血缘图获取指定表的属性字段
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 * @return	属性字段列表
	 */
	public static List<HiveField> getTableFields(String hqls, HiveTable table) throws Exception{
		return bloodEngine.getTableFields(Arrays.asList(hqls.split(";")), table);
	}
	
	/**
	 * 根据血缘图获取指定表的字段血缘
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 */
	public static FieldBlood getFieldBloodByTable(String hqls[], HiveTable table) throws Exception{
		return bloodEngine.getFieldBloodByTable(Arrays.asList(hqls), table);
	}
	
	/**
	 * 根据血缘图获取指定表的字段血缘
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 */
	public static FieldBlood getFieldBloodByTable(List<String> hqls, HiveTable table) throws Exception{
		return bloodEngine.getFieldBloodByTable(hqls, table);
	}
	
	/**
	 * 根据血缘图获取指定表的字段血缘
	 * @param hqls	hive sql 语句
	 * @param table	指定的表
	 */
	public static FieldBlood getFieldBloodByTable(String hqls, HiveTable table) throws Exception{
		return bloodEngine.getFieldBloodByTable(Arrays.asList(hqls.split(";")), table);
	}
	
}
