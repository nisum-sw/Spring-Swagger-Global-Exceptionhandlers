package com.sw.springmvc.dao;

import java.util.List;

import com.sw.springmvc.status.OperationResult;

public interface DAO<T, U> {

	public OperationResult create(T object);

	public OperationResult<T> update(U id, T object);

	public OperationResult delete(U id);

	public T findOne(U id);

	public List<T> findAll();

}
