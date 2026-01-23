package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {

	public static void main(String[] args)
	{
		try
		{
			Connection con = MyDatabase.getConnection();
			
			Statement stmt = con.createStatement();
			
			//Read whole record from database
			ResultSet rs = stmt.executeQuery("select * from patient_details");
			//Read any specific record from database 
			//ResultSet rs = stmt.executeQuery("select * from patient_details where id = 3");
			
			System.out.println("===========================================================");
			System.out.println("ID\tNAME\tAGE\tDESCRIPTION");
			System.out.println("===========================================================");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
			}
			con.close();
		}
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}

}
