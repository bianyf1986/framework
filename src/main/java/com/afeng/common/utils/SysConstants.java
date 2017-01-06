/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.utils;

import com.afeng.common.utils.io.PropertiesLoader;

/**
 * 
 * @Description : 项目中用到的静态变量.
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
public class SysConstants {
	
	/**
     * 系统初始化时间
     */
    public static long SYS_INIT_TIME = System.currentTimeMillis();
    
    private static PropertiesLoader db = null;
    
    private static PropertiesLoader appConfig = null;
    
    private static PropertiesLoader sqlfilter = null;
    
    /**
     * 配置文件(db.properties)
     */
    public static PropertiesLoader getDbConfig() {
    	if(db == null){
    		db = new PropertiesLoader("db.properties");
    	}
        return db;
    }
    
    /**
     * 配置文件(appConfig.properties)
     */
    public static PropertiesLoader getAppConfig() {
    	if(appConfig == null){
    		appConfig = new PropertiesLoader("appConfig.properties");
    	}
        return appConfig;
    }
    
    /**
     * SQL参数过滤配置文件(sqlfilter.properties)
     */
    public static PropertiesLoader getSqlfilter() {
    	if(sqlfilter == null){
    		sqlfilter = new PropertiesLoader("sqlfilter.properties");
    	}
        return sqlfilter;
    }
    
    /**
     * jdbc url连接参数(默认:"").
     */
    public static String getJdbcUrl(){
    	return getDbConfig().getProperty("jdbc.url","");
    }

    /**
     * jdbc 驱动类
     * @return
     */
    public static String getJdbcDriverClassName(){
        return getDbConfig().getProperty("jdbc.driverClassName","");
    }

    /**
     * jdbc 用户名
     * @return
     */
    public static String getJdbcUserName(){
        return getDbConfig().getProperty("jdbc.username","");
    }

    /**
     * jdbc 密码
     * @return
     */
    public static String getJdbcPassword(){
        return getDbConfig().getProperty("jdbc.password","");
    }

    /**
     * 获取是否是开发模式(默认:false).
     */
    public static boolean isdevMode(){
    	return getAppConfig().getBoolean("devMode",false);
    }
    
    /**
     * 获取管理端根路径
     */
    public static String getAdminPath() {
        return getAppConfig().getProperty("adminPath","/a");
    }

    /**
     * 获取前端根路径
     */
    public static String getFrontPath() {
        return getAppConfig().getProperty("frontPath","/f");
    }

    /**
     * 获取URL后缀
     */
    public static String getUrlSuffix() {
        return getAppConfig().getProperty("urlSuffix",".html");
    }

}
