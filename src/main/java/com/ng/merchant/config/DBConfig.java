package com.ng.merchant.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.ng.merchant.model.MerchantNotification;

/*import com.ng.user.db.IBaseDao;
import com.ng.user.db.impl.BaseDaoImpl;*/

@Configuration 
public class DBConfig {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	public SessionFactory getSessionFactory() {
		return new LocalSessionFactoryBuilder(dataSource)
		  
		 .addAnnotatedClasses(MerchantNotification.class)
		   
		
		   .buildSessionFactory();
	}
		   
	
	@Bean
	public HibernateTemplate hibernateTemplate() 
	{
		return new HibernateTemplate(getSessionFactory());
	}
	
//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) 
//	{
//	  
//	      HibernateTransactionManager txManager = new HibernateTransactionManager();
//	      txManager.setSessionFactory(sessionFactory);
//	 
//	      return txManager;
//	}
	
	/*
	 * @Bean public IBaseDao baseDao() { return new BaseDaoImpl(); }
	 */
	
}
