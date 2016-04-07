package com.sw.springmvc.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sw.springmvc.exception.DataAccessException;
import com.sw.springmvc.exception.OrderNotFoundException;
import com.sw.springmvc.exception.SupportInfoException;

@Controller
@RequestMapping("/global")
public class NoExceptionHandlersController {

	protected Logger logger;

	public NoExceptionHandlersController() {
		logger = LoggerFactory.getLogger(getClass());
	}

	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	/* . . . . . . . . . . . . . . REQUEST HANDLERS . . . . . . . . . . . . . . */
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

	/**
	 * Controller to demonstrate exception handling.
	 * 
	 * @return The view name (an HTML page with Thymeleaf markup).
	 */
	@RequestMapping(value="",method = RequestMethod.GET)
	String home1() {
		logger.info("Global home page 1");
		return "global";
	}

	/**
	 * Controller to demonstrate exception handling..
	 * 
	 * @return The view name (an HTML page with Thymeleaf markup).
	 */
	@RequestMapping(value="/",method = RequestMethod.GET)
	String home2() {
		logger.info("Global home page 2");
		return "global";
	}

	/**
	 * No handler is needed for this exception since it is annotated with
	 * <tt>@ResponseStatus</tt>.
	 * 
	 * @return Nothing - it always throws the exception.
	 * @throws OrderNotFoundException
	 *             Always thrown.
	 */
	@RequestMapping(value="/orderNotFound" ,method = RequestMethod.GET)
	 @ResponseBody
	public String throwOrderNotFoundException(String str) {
		logger.info("Throw OrderNotFoundException for unknown order " +str);
		throw new OrderNotFoundException(str);
	}

	/**
	 * Throws an unannotated <tt>DataIntegrityViolationException</tt>. Must be
	 * caught by an exception handler.
	 * 
	 * @return Nothing - it always throws the exception.
	 * @throws DataIntegrityViolationException
	 *             Always thrown.
	 */
	@RequestMapping(value="/dataIntegrityViolation" ,method = RequestMethod.GET)
	String throwDataIntegrityViolationException() throws SQLException {
		logger.info("Throw DataIntegrityViolationException");
		throw new DataIntegrityViolationException(" Duplicate id");
	}

	/**
	 * Simulates a database exception by always throwing <tt>SQLException</tt>.
	 * Must be caught by an exception handler.
	 * 
	 * @return Nothing - it always throws the exception.
	 * @throws SQLException
	 *             Always thrown.
	 */
	@RequestMapping(value="/databaseError1",method = RequestMethod.GET)
	String throwDatabaseException1() throws SQLException {
		logger.info("Throw SQLException");
		throw new SQLException();
	}

	/**
	 * Simulates a database exception by always throwing
	 * <tt>DataAccessException</tt>. Must be caught by an exception handler.
	 * 
	 * @return Nothing - it always throws the exception.
	 * @throws DataAccessException
	 *             Always thrown.
	 */
	@RequestMapping(value="/databaseError2",method = RequestMethod.GET)
	String throwDatabaseException2() throws DataAccessException {
		logger.info("Throw DataAccessException");
		throw new DataAccessException("Error accessing database");
	}

	/**
	 * Always throws a <tt>SupportInfoException</tt>. Must be caught by an
	 * exception handler.
	 * 
	 * @return Nothing - it always throws the exception.
	 * @throws SupportInfoException
	 *             Always thrown.
	 */
	@RequestMapping(value="/supportInfoException",method = RequestMethod.GET)
	String throwCustomException() throws Exception {
		logger.info("Throw SupportInfoException");
		throw new SupportInfoException("Custom exception occurred");
	}


}
