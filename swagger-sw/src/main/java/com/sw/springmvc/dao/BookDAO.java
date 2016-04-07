package com.sw.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sw.springmvc.model.Book;
import com.sw.springmvc.status.OperationResult;
import com.sw.springmvc.status.OperationResult.Status;


@Repository
public class BookDAO implements DAO<Book, String> {

	@Override
	public OperationResult<Book> create(Book book) {
		OperationResult<Book> or =new OperationResult<Book>();
		book.setAuthor("kamal");
		book.setComment("Sample Swagger");
		book.setId("1000");
		book.setPublicationYear(2016);
		book.setTitle("kamal Swagger");
		or.setData(book);
		return or;
	}

	@Override
	public OperationResult<Book> update(String id, Book book) {
		OperationResult<Book> bookreult=new OperationResult<Book>();
		book.setAuthor("kamalmohan");
		book.setComment("Sample Swagger");
		book.setId("1001");
		book.setPublicationYear(2017);
		book.setTitle("kamal Swagger Updated");
		bookreult.setData(book);
		bookreult.setStatus(Status.SUCCESS);;
		return bookreult;
	}

	@Override
	public OperationResult delete(String id) {
		OperationResult bookreult=new OperationResult();
		bookreult.setStatus(Status.SUCCESS);
		return bookreult;
	}

	@Override
	public Book findOne(String id) {
		Book book =new Book();
		book.setAuthor("kamalmohan");
		book.setComment("Sample Swagger");
		book.setId("1001");
		book.setPublicationYear(2017);
		book.setTitle("kamal Swagger Updated");
		return book;
	}

	@Override
	public List<Book> findAll() {
		Book book =new Book();
		ArrayList<Book> books = new ArrayList<Book>();
		book.setAuthor("kamalmohan");
		book.setComment("Sample Swagger");
		book.setId("1001");
		book.setPublicationYear(2017);
		book.setTitle("kamal Swagger Updated");
		books.add(book);
		return books;
	}

}
