package model.dao;

import java.util.List;

public interface MethodsDao<T> {
	void insert(T obj);
	void update (T obj);
	void delete (T obj);
	Object findById(Integer id);
	List<T> findAll();
}