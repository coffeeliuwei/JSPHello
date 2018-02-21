package com.coffee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "111111");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void insertUserdata(Connection conn) throws SQLException {
		// Connection conn = getConnection();
		String sql = "insert into tbl_user(id,name,password,email)" + "values(10,'tom','111111','tom.qq.com')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("insert userdata" + count);
	//	conn.close();

	}

	public static void insertAddressdata(Connection conn) throws SQLException {
		// Connection conn = getConnection();
		String sql = "insert into tbl_address(id,city,country,user_id)" + "values(1,'shanhai','china','10')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("insert addressdata" + count);
	//	conn.close();

	}

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);// 关闭自动事物

			insertUserdata(conn);
			insertAddressdata(conn);

			conn.commit();
		} catch (SQLException e) {
			System.out.println("sql异常！！！！！");
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("事物回滚成功！");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}
