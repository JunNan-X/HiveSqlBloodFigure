package com.diven.common.hive.blood.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileUtil {
 
    private static Properties properties = null;
    
    public static synchronized boolean isLoaded(){
    	return properties != null;
    }
    
    /**
     * 初始化读取配置文件，读取的文件列表位于classpath下面的app.properties
     *
     * 多个配置文件会用最后面的覆盖相同属性值
     * @throws IOException  读取属性文件时
     */
    public static void init() {
    	//3读取jar外资源，运行使用
    	String runFile = "app.properties";
    	if (FileUtil.exist(runFile)) {
    		loadProperty(runFile);
    		return;
		}
    	
    	//2读取jar内资源，运行使用
    	InputStream is = PropertyFileUtil.class.getClass().getResourceAsStream("/app.properties");
    	if (null != is) {
    		loadProperty(is);
    		return;
		}
    	
    	//1调试使用
    	String debugFile = "src/main/resources/app.properties";
    	if (FileUtil.exist(debugFile)) {
    		loadProperty(debugFile);
    		return;
		}
    }
    
    
    /**
     * 内部处理
     * @param conf        String fileNames = "app.properties";

     * @throws IOException
     */
    private static void loadProperty(String file) {
    	properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
 
    /**
     * 内部处理
     * @param conf        String fileNames = "app.properties";

     * @throws IOException
     */
    private static void loadProperty(InputStream is) {
    	properties = new Properties();
		try {
			properties.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    public static String getProperty(String key){
    	return properties.getProperty(key);
    }
}    