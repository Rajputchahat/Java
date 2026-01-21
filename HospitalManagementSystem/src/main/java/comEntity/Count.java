package comEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import comDB.MyDatabase;

public class Count {
	Connection con = MyDatabase.getConnection();
	
	public int countDoctor()
	{
		int i=0;
		try
		{
			String query = "select * from doctor_details";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i; 
	}
	
	public int countUser()
	{
		int i=0;
		try
		{
			String query = "select * from User_details";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i; 
	}
	
	public int countAppointment()
	{
		int i=0;
		try
		{
			String query = "select * from appointment";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i; 
	}
	
	public int countSpecialist()
	{
		int i=0;
		try
		{
			String query = "select * from specialist";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i; 
	}
	
	public int countAppointmentByDoctorId(String a)
	{
		int i=0;
		try
		{
			String query = "select * from appointment where doctorid = '"+a+"'";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i; 
	}
}
