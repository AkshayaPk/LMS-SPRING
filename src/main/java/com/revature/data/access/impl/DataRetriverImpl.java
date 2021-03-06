package com.revature.data.access.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.data.access.DataRetriver;
import com.revature.data.access.exception.DataAccessException;

@Repository
@SuppressWarnings("unchecked")
public class DataRetriverImpl implements DataRetriver {

	private static Logger logger = Logger.getLogger(DataRetriverImpl.class);

	

	public <E> List<E> retrieveBySQL(String queryString) throws DataAccessException {
		List<E> list = null;
		try {
			
			
			logger.info("data retrieval success..");
		} catch (Exception e) {
			System.out.println("Retreiver exception");
			logger.error(e.getMessage(), e);
			throw new DataAccessException(e.getMessage(), e);
		}
		return list;
	}
	/*public Object getDetail(String queryString) throws DataAccessException{
		Object obj=null;
		try {
			System.out.println("retreiver");
			obj =  sessionFactory.getCurrentSession().createSQLQuery(queryString).uniqueResult();
			logger.info("data retrieval success..");
		} catch (Exception e) {
			System.out.println(e);
			logger.error(e.getMessage(), e);
			throw new DataAccessException(e.getMessage(), e);
		}
		return obj;
		
	}*/
	

}