package com.coffee.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.coffee.util.ConnectionFactory;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
ConnectionFactory cf=ConnectionFactory.getInstance();
Connection conn=cf.makeConnection();
System.out.println(conn.getAutoCommit());
	}

}
