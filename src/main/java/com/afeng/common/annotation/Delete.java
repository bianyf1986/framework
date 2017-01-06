/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.annotation;

import com.afeng.common.dao.orm.PropertyType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.afeng.common.dao.orm.PropertyType.I;

/**
 * 
 * @Description : Hibernate状态删除，如果在orm实体配置该注解，将不会物理删除数据，会根据该配置来进行对orm实体的update操作
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Delete {

	/**
	 * 属性名称
	 * 
	 * @return String
	 */
	public String propertyName();

	/**
	 * 要改变的值
	 * <br> 默认值:"1" {@link com.afeng.framework.common.orm.entity.StatusState}
	 * 
	 * @return String
	 */
	public String value() default "1";

	/**
	 * 改变值的类型
	 * <br>默认值:Integer
	 * @return {@link PropertyType}
	 */
	public PropertyType type() default I;
}