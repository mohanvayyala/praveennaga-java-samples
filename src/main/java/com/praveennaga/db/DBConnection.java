package com.praveennaga.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//create table employee(EMPLOYEE_ID INT, email  VARCHAR(50),employee_name VARCHAR(50),gender VARCHAR(50),salary DOUBLE);

/*CREATE PROCEDURE INSEREMP (IN EMPLOYEE_ID INT, IN  email  VARCHAR(50),IN  employee_name VARCHAR(50),IN  gender VARCHAR(50),IN  salary DOUBLE)  
MODIFIES SQL DATA
BEGIN ATOMIC
insert into employee values(employee_id,email,employee_name,gender,salary);  
END;  */

public class DBConnection {

	public static void main(String args[]) {
		try (Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from employee");
				PreparedStatement ps = con
						.prepareStatement("insert into employee(employee_id,email,employee_name,gender,salary) values(?,?,?,?,?)");
				CallableStatement cs = con.prepareCall("{call INSEREMP(?,?,?,?,?)}");) {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			int row = 0;
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4) + "  " + rs.getDouble(5));
				row++;
			}
			ps.setInt(1, row);
			ps.setString(2, "mnp3pk" + row + "@gmail.com");
			ps.setString(3, "Praveen "+row);
			ps.setString(4, "Male");
			ps.setDouble(5, 90000);
			ps.executeUpdate();
			row=row+1;
			cs.setInt(1, row);
			cs.setString(2, "mnp3pk" + row + "@gmail.com");
			cs.setString(3, "Praveen "+ row );
			cs.setString(4, "Male");
			cs.setDouble(5, 90000);
			cs.execute();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
