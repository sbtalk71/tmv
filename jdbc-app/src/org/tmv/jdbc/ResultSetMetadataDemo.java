package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetadataDemo {

	public static void main(String[] args) throws Exception{
		//load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//Get the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");
		
		//query the database
		Statement stmt=conn.createStatement();
		
		ResultSet rs= stmt.executeQuery("select empno,location,salary,name from employee");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println(rsmd.getSchemaName(2));
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getTableName(2));
	}

}
