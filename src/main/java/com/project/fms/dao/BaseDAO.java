package com.project.fms.dao;

import java.io.Serializable;

public interface BaseDAO<PK, T> {
	boolean delete(T entity);

	T saveOrUpdate(T entity);

	T findById(Serializable key);
}
