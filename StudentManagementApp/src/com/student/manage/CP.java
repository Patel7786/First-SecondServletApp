package com.student.manage;

import java.sql.DriverManager;
import java.sql.Connection;



public class CP {
static Connection con;
	public static Connection createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="Patel@7786";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con=DriverManager.getConnection(url,user,password);
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
