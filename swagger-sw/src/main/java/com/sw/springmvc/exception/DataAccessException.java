package com.sw.springmvc.exception;

public class DataAccessException extends RuntimeException {

	private static final long serialVersionUID = -8765615587539164024L;

	public DataAccessException(String message) {
		super(message);
	}
	
	public DataAccessException(String message, Exception ex) {
		super(message, ex);
	}

}
