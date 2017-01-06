/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.dao.orm;

import org.hibernate.criterion.MatchMode;

/**
 * 
 * @Description : QBC like查询表达式.
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
@SuppressWarnings("serial")
public class LikeExpression extends org.hibernate.criterion.LikeExpression {

	protected LikeExpression(String propertyName, String value,
			MatchMode matchMode, Character escapeChar, boolean ignoreCase) {
		super(propertyName, value, matchMode, escapeChar, ignoreCase);
	}

}