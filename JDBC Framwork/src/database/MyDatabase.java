package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDatabase 
{
	public static final Connection getConnection()
	{
		Connection con = null;
		try 
		{
			//Step-1 Load and register the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step-2 Create the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static void main(String[] args) 
	{
		if(MyDatabase.getConnection()!=null)
		{
			System.out.println("Connection Successful!");
		}
		else
		{
			System.out.println("There is any Problem!");
		}

	}

}
