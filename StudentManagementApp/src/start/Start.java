package start;
import java.util.*;

import com.student.manage.StudentDao;
import com.student.manage.Student;

import java.io.*;
public class Start {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Hello");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1. Enter the Data");
			System.out.println("2. Delete Data");
			System.out.println("3.Show data");
			System.out.println("4.Update name");
			System.out.println("5. Stop----");
			int n=Integer.parseInt(br.readLine());
			if(n==1)
			{
				System.out.print("Please Enter The City:");
				String City=br.readLine();
				System.out.print("Please Enter Name");
				String Name=br.readLine();
				System.out.print("Please Enter Standar");
				String standard=br.readLine();
				Student st=new Student(City,Name,standard);
				System.out.println(st);
				boolean f=StudentDao.InsertIntoDB(st);
				if(f)System.out.println("Data Inserted Succesfully!!!");
				else System.out.println("Some error Occure Please try again ");
				
			}
			else if(n==2)
			{
				System.out.println("for Deletion.....Please Enter id");
				int id=Integer.parseInt(br.readLine());
				if(StudentDao.DeletionfromDB(id))
				{
					System.out.println("Deletion Succesfully -----");
				}
				else
					System.out.println("Some problem Occure.....");
				
				
			}
			else if(n==3)
			{
				StudentDao.getAlldata();
			}
			else if(n==4)
			{
				System.out.println("for Update data.....Please Enter id");
				int id=Integer.parseInt(br.readLine());
				System.out.println("for Update data.....Please Enter Name");
				String Name=br.readLine();
				if(StudentDao.UpdateName(Name,id)) System.out.println("Successfully Update!!!!");
				else System.out.println("Some Problem Occure.....");
			}
			else
			{
				break;
			}
		}
		System.out.println("Thank you for Using my Application !!!!");
	}

}
