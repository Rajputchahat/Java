package database;
   
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args)  
	{
		try {
		Connection con = MyDatabase.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter patient id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter patient description");
		String desc = sc.nextLine();
		
        String sql = "update patient_details set description ="+"'"+desc+"'"+"where id = "+id;
        
        //PreparedStatement is a predefined class of sql package 
        PreparedStatement p = con.prepareStatement(sql);
        
        p.execute();
        System.out.println("Data Updated"); 
        
	   }
		catch(Exception e)
		{
			//System.out.println(e);
		}
	}
}
