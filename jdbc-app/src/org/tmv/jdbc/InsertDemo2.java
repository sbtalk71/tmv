package org.tmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo2 {

	public static void main(String[] args) {

		int empid = 106;
		String name = "Ratan";
		String location = "Chennai";
		double salary = 60000;

		Connection conn = null;
		PreparedStatement pst = null;
		try {
			// load the driver
			Class.forName("org.mariadb.jdbc.Driver");

			// Get the connection

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tmvdb", "root", "root");

			pst = conn.prepareStatement("insert into employee(empno,name,location,salary)" + " values(?,?,?,?)");

			pst.setInt(1, empid);
			pst.setString(2, name);
			pst.setString(3, location);
			pst.setDouble(4, salary);

			int rowCount = pst.executeUpdate();
			System.out.println("Rows inserted : " + rowCount);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
