package com.ng.merchant.dao;

import java.util.Map;

public interface IBaseDao {
	
	public void saveObject(final Object object);
	
	public void flush();
	public <T extends Object> T findObjectByNamedQuery(final String queryName, final Map<String, Object> queryParams, final Class<T> modelClass);

}
