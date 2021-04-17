package com.diven.common.hive.blood.figure;

import java.util.Arrays;
import java.util.List;

import com.diven.common.hive.blood.api.HiveBloodEngine;
import com.diven.common.hive.blood.api.HiveBloodEngineImpl;
import com.diven.common.hive.blood.graph.GraphUI;
import com.diven.common.hive.blood.model.FieldBlood;
import com.diven.common.hive.blood.model.HiveField;
import com.diven.common.hive.blood.model.HiveTable;
import com.diven.common.hive.blood.model.TableBlood;

public class HiveBloodEngineTest extends BaseTest{
	
	private HiveBloodEngine bloodEngine = new HiveBloodEngineImpl();
	
	/**
	 * 获取当前sql的表血缘
	 */
	public void testGetTableBlood() throws Exception{
		TableBlood tableBlood = bloodEngine.getTableBlood(Arrays.asList(hqls));
		printJsonString(tableBlood);
		GraphUI.show(tableBlood);
		System.in.read();
	}
	
	/**
	 * 根据血缘图获取指定表的属性字段
	 */
	public void testGetTableFields() throws Exception{
		List<HiveField> fields = bloodEngine.getTableFields(Arrays.asList(hqls), new HiveTable("temp", "c2"));
		printJsonString(fields);
		GraphUI.show(fields);
		System.in.read();
	}
	
	/**
	 * 根据血缘图获取指定表的字段血缘
	 */
	public void testGetFieldBloodByTable() throws Exception{
		FieldBlood fieldBlood = bloodEngine.getFieldBloodByTable(Arrays.asList(hqls), new HiveTable("temp", "d1"));
		printJsonString(fieldBlood);
		GraphUI.show(fieldBlood);
		System.in.read();
	}
	
}
