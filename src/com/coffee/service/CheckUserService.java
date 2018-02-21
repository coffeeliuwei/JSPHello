package com.coffee.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.coffee.dao.UserDao;
import com.coffee.dao.impl.UserDaoImpl;
import com.coffee.entity.User;
import com.coffee.util.ConnectionFactory;

public class CheckUserService {
 private UserDao userDao=new UserDaoImpl();
 
 public boolean check(User user) {
	Connection conn=null;
	conn=ConnectionFactory.getInstance().makeConnection();
	try {
		conn.setAutoCommit(false);
		
		ResultSet resultSet=userDao.get(conn, user);
		
		while (resultSet.next()) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return false;
}
	
	
}
