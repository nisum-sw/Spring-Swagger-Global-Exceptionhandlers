//package com.sw.springmvc.exception;
//
//
//import java.sql.SQLException;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.log4j.Logger;
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.servlet.ModelAndView;
//
//@ControllerAdvice
//public class ExceptionControllerAdvice {
//
//
//	final static Logger log = Logger.getLogger(ExceptionControllerAdvice.class);
//	
//	
//	// Convert a predefined exception to an HTTP Status code
//	  @ResponseStatus(value=HttpStatus.CONFLICT, reason="Data integrity violation")  // 409
//	  @ExceptionHandler(DataIntegrityViolationException.class)
//	  public void conflict() {
//	    // Nothing to do
//	  }
//	  
//	  // Specify the name of a specific view that will be used to display the error:
//	  @ExceptionHandler({SQLException.class,DataAccessException.class})
//	  public String databaseError() {
//	    // Nothing to do.  Returns the logical view name of an error page, passed to
//	    // the view-resolver(s) in usual way.
//	    // Note that the exception is _not_ available to this view (it is not added to
//	    // the model) but see "Extending ExceptionHandlerExceptionResolver" below.
//	    return "databaseError";
//	  }
//
//	  // Total control - setup a model and return the view name yourself. Or consider
//	  // subclassing ExceptionHandlerExceptionResolver (see below).
//	  @ExceptionHandler(Exception.class)
//	  public ModelAndView handleError(HttpServletRequest req, Exception exception) {
//	    log.error("Request: " + req.getRequestURL() + " raised " + exception);
//
//	    ModelAndView mav = new ModelAndView();
//	    mav.addObject("exception", exception);
//	    mav.addObject("url", req.getRequestURL());
//	    mav.setViewName("error");
//	    return mav;
//	  }
//
////    @ExceptionHandler(value = DataAccessException.class)
////    public ResponseEntity<String> dataAccessException(DataAccessException e) {
////    	log.error("DataAccessException------------" +e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
////    }
////
////
////
////    @ExceptionHandler(value = ParseException.class)
////    public ResponseEntity<String> parseException(ParseException e) {
////     //   log.error(e.getMessage(), e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
////    }
////
////
////    @ExceptionHandler(value = SAXException.class)
////    public ResponseEntity<String> sAXException(SAXException e) {
////        log.error(e.getMessage(), e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
////    }
////
////   
////
////    @ExceptionHandler(value = IllegalArgumentException.class)
////    public ResponseEntity<String> illegalArgumentException(IllegalArgumentException e) {
////        log.error("IllegalArgumentException returning a HttpStatus.UNPROCESSABLE_ENTITY", e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
////    }
////
////    @ExceptionHandler(value = IOException.class)
////    public ResponseEntity<String> iOException(IOException e) {
////        log.error(e.getMessage(), e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
////    }
////
////    @Order(Ordered.LOWEST_PRECEDENCE)
////    @ExceptionHandler(value = Exception.class)
////    public ResponseEntity<String> genericException(Exception e) {
////        log.error("unhandled exception occured", e);
////        return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
////    }
//
//
//}
