package com.sw.springmvc.exception;

public class SupportInfoException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SupportInfoException(String msg) {
		super(msg);
	}

	public SupportInfoException(String msg, Throwable t) {
		super(msg, t);
	}


}
