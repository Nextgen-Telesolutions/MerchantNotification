package com.ng.merchant.dao.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.ng.merchant.dao.IBaseDao;

public class BaseDaoImpl implements IBaseDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private SessionFactory getSessionFactory()
	{
		return this.sessionFactory;
	}
	
	private HibernateTemplate getHibernateTemplate()
	{
		return this.hibernateTemplate;
	}
	
	
	public void saveObject(final Object entity) {
		getHibernateTemplate().save(entity);		
	}
	

	public void flush() {
		getHibernateTemplate().flush();
	}
	
	public <T extends Object> T findObjectByNamedQuery(String queryName,Map<String, Object> queryParams, Class<T> modelClass) 
	{
		List resultData = getQueryResult(queryName, queryParams);
		
		if(resultData != null && !resultData.isEmpty())
			return (T)resultData;
		else
		return null;
	}
	
	private List getQueryResult(String queryName,Map<String, Object> queryParams) 
	{
		String[] params = new String[queryParams.size()];
		Object[] values = new Object[queryParams.size()];

		int index = 0;
		Iterator<String> i = queryParams.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			params[index] = key;
			values[index++] = queryParams.get(key);
		}

		return getHibernateTemplate().findByNamedQueryAndNamedParam(queryName,params, values);
		
	}
	
	protected Map<String, Object> createMapForQueryParams(final String[] keys,
			final Object[] values) {
		final Map<String, Object> queryParams = new HashMap<>();
		int counter = 0;
		for (String str : keys) {
			queryParams.put(str, values[counter++]);
		}
		return queryParams;
	}

}
