package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception{
		
		int empid=106;
		
		
		//load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//Get the connection
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");
		
		PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
		
		pst.setInt(1, empid);
		
		
		int rowCount=pst.executeUpdate();
		
		
		
		System.out.println("Rows inserted : "+rowCount);
		
		
	}

}
