package com.sw.springmvc.controller;


import com.sw.springmvc.dao.DAO;
import com.sw.springmvc.model.Book;
import com.sw.springmvc.status.OperationResult;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiErrors;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    @Autowired
    private DAO<Book, String> bookDAO;

    @ApiOperation(value = "Creates a Book")
    @RequestMapping(method = RequestMethod.POST)
    public  @ResponseBody OperationResult create(@ApiParam(required = true, name = "book", value = "Create Book Now")@RequestBody Book book){

        return bookDAO.create(book);


    }


    @ApiOperation(value = "Method to update a book")
    @RequestMapping(method = RequestMethod.PUT, value = "/{bookId}")
    public  @ResponseBody OperationResult<Book> update(
            @ApiParam(required = true, value = "The id of the book that should be updated", name = "bookId")@PathVariable("bookId") String bookId,
                    @ApiParam(required = true, name = "book", value = "The book object that needs to be updated")@RequestBody Book book){

        return bookDAO.update(bookId, book);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Lists all the books in the database")
    public  @ResponseBody List<Book> list(){
        return bookDAO.findAll();
    }


    @ApiOperation(value = "Retrieves a book based on their id")
    @ApiErrors(value = {@ApiError(code=404, reason = "No book corresponding to the id was found")})
    @RequestMapping(method = RequestMethod.GET, value = "/{bookId}")
    public  @ResponseBody Book view(
            @ApiParam(name = "bookId" , required = true, value = "The id of the book that needs to be retrieved")@PathVariable("bookId") String bookId,
            HttpServletResponse response){

        Book book =  bookDAO.findOne(bookId);

        if(book == null){

            response.setStatus(404);
        }
        return book;
    }

 
    @ApiOperation(value = "Deletes a book based on their id")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{bookId}")
    public  @ResponseBody OperationResult delete(@ApiParam(name = "bookId", value = "The id of the book to be deleted", required = true)@PathVariable("bookId") String bookId){
      return bookDAO.delete(bookId);


    }

}
