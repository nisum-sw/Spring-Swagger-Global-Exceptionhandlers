package com.sw.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
public class HelloWorldController {

    @RequestMapping( produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public @ResponseBody String sayHelloWorld(){

        return "Hello World!";
    }
}
