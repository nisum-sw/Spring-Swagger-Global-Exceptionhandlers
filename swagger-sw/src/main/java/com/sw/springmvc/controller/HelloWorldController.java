package com.sw.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller
public class HelloWorldController {

	@ApiOperation(value = "This is Hello World Service")
	@RequestMapping(value = "/hello/{input}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<?> get(
			@ApiParam(value = "input", required = true) @PathVariable(value = "input") String input) {
		return new ResponseEntity<String>(input, HttpStatus.OK);
	}

}
