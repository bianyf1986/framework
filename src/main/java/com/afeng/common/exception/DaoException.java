/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 
 * @Description : 数据库访问层异常,继承自BaseException.
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
@SuppressWarnings("serial")
public class DaoException extends BaseException {

	private Throwable rootCause;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super(cause);
		this.rootCause = cause;
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
		this.rootCause = cause;
	}

	public String getTraceInfo() {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		printStackTrace(pw);
		pw.flush();
		sw.flush();
		return sw.toString();
	}

	public Throwable getRootCause() {
		return rootCause;
	}

}
