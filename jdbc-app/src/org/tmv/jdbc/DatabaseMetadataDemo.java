package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetadataDemo {

	public static void main(String[] args) throws Exception{
		//load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//Get the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");
		
		DatabaseMetaData dbmd=conn.getMetaData();
		
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getUserName());
		System.out.println(dbmd.getDriverName());
		
		
	}

}
