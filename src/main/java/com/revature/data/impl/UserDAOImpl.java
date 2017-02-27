package com.revature.data.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.data.access.DataRetriver;
import com.revature.data.access.exception.DataAccessException;
import com.revature.data.exception.DataServiceException;
import com.revature.data.utils.DataUtils;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

@Transactional
@Repository
public class UserDAOImpl{
	private static Logger logger = Logger.getLogger(UserDAOImpl.class);
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	@Autowired
	private DataRetriver dataRetriver;

	public DataRetriver getDataRetriver() {
		return dataRetriver;
	}

	public void setDataRetriver(DataRetriver dataRetriver) {
		this.dataRetriver = dataRetriver;
	}

	public List<User> getAllUsers() throws DataServiceException{
		List<User> users = null;
		try {
			StringBuilder sb = new StringBuilder("select * from users");
			users = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return users;
	}
	public List<User> listUser(User user) throws DataServiceException{
		List<User> categories = null;
		
		try {
			StringBuilder sb = new StringBuilder("select * from users where EMAIL_ID='"+user.getEmailId()+"'");
			categories = dataRetriver.retrieveBySQL(sb.toString());
			logger.info("Categories data retrieval success..");
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return categories;
	}
	public boolean validateLogin(User user) throws DataServiceException{
		try {
			String sb ="select id,password from users where EMAIL_ID=?";
			Object[] params={user.getEmailId()};
			
			dataRetriver.retrieveBySQL(sb.toString());
			User user1=jdbcTemplate.queryForObject(sb,params,(rs,rowNum)->
			{
				User u=new User();

				u.setId(rs.getInt("ID"));
				u.setPassword(rs.getString("PASSWORD"));
				return u;
			});
			if(user.getPassword().equals(user1.getPassword()))
			{
				return true;
			}
		} catch (DataAccessException e) {
			logger.error(e.getMessage(), e);
			System.out.println(e);
			throw new DataServiceException(DataUtils.getPropertyMessage("data_retrieval_fail"), e);
		}
		return false;
	}
	
	
	
}
