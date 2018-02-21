package com.coffee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC1 {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","111111");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insert() {
		Connection conn=getConnection();
		String sql="insert into tbl_user(name,password,email)"+
		"values('Allin','111111','allin@qq.com')";
		Statement st;
		try {
			st = conn.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println("insert"+count);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void update() {
		Connection conn=getConnection();
		String sql="update tbl_user set email='allin11@qq.com' where name='Allin'";
		Statement st;
		try {
			st = conn.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println("update"+count);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void delete() {
		Connection conn=getConnection();
		String sql="delete from  tbl_user where name='Allin'";
		Statement st;
		try {
			st = conn.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println("delete"+count);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
//insert();
	//update();
	//delete();
}
}
/**main select
 * 	String sql="SELECT * FROM tbl_user";
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","111111");
		st=conn.createStatement();
		rs=st.executeQuery(sql);
		
		while (rs.next()) {
			System.out.print(rs.getInt("id")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("password")+" ");
			System.out.print(rs.getString("email")+" ");
System.out.println();
			
		}
	} catch (Exception e) {
 e.printStackTrace();
	
	}finally {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 * 
 * 
 * 
 * */
 