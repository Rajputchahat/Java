package database;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
public class InsertRecord {
	
	public static void main(String[] args) 
	{
		try 
		
	 	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Patient Name");
			String name = sc.nextLine();
			System.out.println("Enter Patient Description");
			String desc = sc.nextLine();
			System.out.println("Enter Patient Age");
			int age = sc.nextInt();
			
			//Get the Connection
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "insert into patient_details(name,age,description) values('"+name+"','"+age+"','"+desc+"')";
			long res = stmt.executeUpdate(query);
			
			if(res>0)
			{
				System.out.println("Data Saved!");
			}
			else
			{
				System.out.println("Query problem");
			}
		}
       
		catch(Exception e)
		{}
	}

}
