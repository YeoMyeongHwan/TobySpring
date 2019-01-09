package com.toby.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test",  "root",  "9124");
		return c;
	}
}
