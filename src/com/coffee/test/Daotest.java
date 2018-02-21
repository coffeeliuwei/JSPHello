package com.coffee.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.coffee.dao.UserDao;
import com.coffee.dao.impl.UserDaoImpl;
import com.coffee.entity.User;
import com.coffee.util.ConnectionFactory;

public class Daotest {

	public static void main(String[] args) {
		Connection conn=null;
		conn=ConnectionFactory.getInstance().makeConnection();
		try {
			conn.setAutoCommit(false);
			UserDao userDao=new UserDaoImpl();
			User coffeeliu=new User();
			coffeeliu.setName("coffeeliu1");
			coffeeliu.setPassword("111111");
			coffeeliu.setEmail("coffee.liu@gmail.com");
			
			userDao.save(conn, coffeeliu);
			
			conn.commit();
			
			
			
		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
