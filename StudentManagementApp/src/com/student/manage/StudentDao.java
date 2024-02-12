package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean InsertIntoDB(Student st)
	{
		try
		{
			Connection con=CP.createConnection();
			String s="insert into student(Name,Standard,City) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setString(3, st.getCity());
			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getStandard());
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
		
	}

	public static boolean DeletionfromDB(int id) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=CP.createConnection();
			String s="delete from student where id=?";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	public static void getAlldata() {
		// TODO Auto-generated method stub
		try
		{
			Connection con=CP.createConnection();
			String q="select * from student;";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			while(set.next())
			{
				System.out.println("id: "+set.getInt(1)+" Name :"+set.getString(2)+" Statndard :"+set.getString(3)+" City :"+set.getString(4));
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static boolean UpdateName(String Name,int id) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=CP.createConnection();
			String q="Update student set Name=? where id=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,Name);
			pstmt.setInt(2,id );
			pstmt.executeUpdate();
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
		
		
	}
}
