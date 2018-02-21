package com.coffee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.coffee.dao.UserDao;
import com.coffee.entity.User;
import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection conn, User user) throws SQLException {
    PreparedStatement ps=(PreparedStatement) conn
    		.prepareCall("insert into tbl_user(name,password,email)values(?,?,?)");
	ps.setString(1, user.getName());
	ps.setString(2, user.getPassword());
	ps.setString(3, user.getEmail());
	ps.execute();
	}

	@Override
	public void update(Connection conn, Long id, User user) throws SQLException {
String updatesql="update tbl_user set name=?,password=?,email=? where id=?";
PreparedStatement ps=(PreparedStatement) conn.prepareStatement(updatesql);
	ps.setString(1, user.getName());
	ps.setString(2, user.getPassword());
	ps.setString(3, user.getEmail());
	ps.setLong(4, id);
	ps.execute();
	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
PreparedStatement ps=(PreparedStatement) conn.prepareStatement("delete from tbl_user where id=?");
	ps.setLong(1, user.getId());
	ps.execute();
	}

	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select * from tbl_user where name=? and password=?");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		return ps.executeQuery();
	}

}
