package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo1 {

	public static void main(String[] args) throws Exception{
		
		int empid=105;
		String name="Shankar";
		String location="Chennai";
		double salary=50000;
		
		//load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//Get the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");
		
		//query the database
		Statement stmt=conn.createStatement();
		
		int rowCount= stmt.executeUpdate("insert into employee(empno,name,location,salary)"
				+ " values("+empid+",'"+name+"','"+location+"',"+salary+")");
		
		System.out.println("Rows inserted : "+rowCount);
		
		
	}

}
