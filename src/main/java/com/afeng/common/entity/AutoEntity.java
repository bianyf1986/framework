/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.entity;

import com.afeng.common.annotation.Excel;

import javax.persistence.*;

/**
 * 
 * @Description : 统一定义entity基类. <br>
 * 				     基类统一定义id的属性名称、数据类型、列名映射及生成策略. <br>
 *  			    子类可重载getId()函数重定义id的列名映射和生成策略. <br>
 * 			                新加并发控制(乐观锁,用于并发控制)、数据更新时间、操作用户ID.
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
@MappedSuperclass
public abstract class AutoEntity  extends AbstractEntity<Long>{

	/**
	 * 主键ID
	 */
	@Excel(exportName="编号", exportFieldWidth = 10)
	protected Long id;

	public AutoEntity() {
	}

	/**
	 * 主键ID 根据数据库主键自增长策略 依赖于数据库(SQL Serveer、MySQL数据库使用)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
	public Long getId() {
		return id;
	}

	/**
	 * 设置 主键ID
	 * 
	 * @param id
	 *            主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

}
