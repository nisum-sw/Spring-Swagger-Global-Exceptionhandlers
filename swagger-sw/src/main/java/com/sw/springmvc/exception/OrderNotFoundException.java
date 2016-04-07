package com.sw.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * For exceptions we write, consider adding @ResponseStatus 
 * @author NIS1598-mbpr
 *
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such order found with the order Numbr")
public class OrderNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -8790211652911971729L;

	public OrderNotFoundException(String orderId) {
		super(orderId + " not found");
	}
}

