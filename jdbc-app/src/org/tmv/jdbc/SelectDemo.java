package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) throws Exception{
		//load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//Get the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");
		
		//query the database
		Statement stmt=conn.createStatement();
		
		ResultSet rs= stmt.executeQuery("select empno,location,salary,name from employee");
		
		/*
		while(rs.next()) {
			int empno=rs.getInt(1);
			String name=rs.getString(2);
			String loc=rs.getString(3);
			double salary=rs.getDouble(4);
			
			System.out.println(empno+" "+name+" "+loc+" "+salary);
		}*/
		
		while(rs.next()) {
			int empno=rs.getInt("empno");
			String name=rs.getString("name");
			String loc=rs.getString("location");
			double salary=rs.getDouble("salary");
			
			System.out.println(empno+" "+name+" "+loc+" "+salary);
		}
	}

}
