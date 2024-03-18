package com.ServletsExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Jdbcform {

		static void method(StudentForm sf) throws SQLException {
			 String url="jdbc:mysql://127.0.0.1:3306/ Codebegun_test";
			String userName="root";
			 String password="root";

			String insertquery=" insert into student_form(Firstname,LastName,MobileNo,EmailId,gender)"
					+ "VALUES(?,?,?,?,?)";
			try {
				
				//Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection connection=DriverManager.getConnection(url, userName, password);
				PreparedStatement statement=connection.prepareStatement(insertquery);
				
				statement.setString(1, sf.getFirstname());
				statement.setString(2, sf.getLastname());
				statement.setLong(3, sf.getMobileno());
				statement.setString(4,sf.getEmail());
				statement.setString(5,sf.getGender());
				int no=statement.executeUpdate();
				System.out.println(no);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	}
	

}
