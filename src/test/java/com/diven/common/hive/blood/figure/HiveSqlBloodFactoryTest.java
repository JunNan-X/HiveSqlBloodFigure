package com.diven.common.hive.blood.figure;

import java.util.Arrays;

import com.diven.common.hive.blood.factory.HiveSqlBloodFactory;
import com.diven.common.hive.blood.graph.GraphUI;
import com.diven.common.hive.blood.model.TableBlood;

public class HiveSqlBloodFactoryTest extends BaseTest{

	/**
	 * 获取当前sql的表血缘
	 */
	public void testGetTableBlood() throws Exception{
		TableBlood tableBlood = HiveSqlBloodFactory.getTableBlood(Arrays.asList(hqls));
		printJsonString(tableBlood);
		GraphUI.show(tableBlood);
		System.in.read();
	}
	
}
