package com.simplilearn.dao;

import java.util.List;

public interface Dao<T> {

	void save(T object);

	T load(long id);

	void delete(long id);

	void update(T object);

	List<T> loadAll();

}
