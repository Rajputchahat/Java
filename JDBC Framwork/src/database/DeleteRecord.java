package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) 
	{
		try {
			Connection con = MyDatabase.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter patient id");
			int id = sc.nextInt();	
	        String sql = "delete from patient_details "+"where id = "+id;
	        
	        //preparedStatement(sql) is a predefined method Connection in java's Connection class 
	        PreparedStatement p = con.prepareStatement(sql);
	        
	        p.execute();
	        System.out.println("Data Deleted");
		   }
			catch(Exception e)
			{
				System.out.println(e); 
			}
	}
}
