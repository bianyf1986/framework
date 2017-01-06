/**
 *  Copyright (c) 2015-2018
 *  @author afeng  416352221@qq.com
 */
package com.afeng.common.exception;

/**
 * 
 * @Description : 基本异常
 * @Date        : 2015-7-7
 * @author      : afeng  
 * @Email       : 41635221@qq.com
 */
@SuppressWarnings("serial")
public class BaseException extends RuntimeException {

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

}
