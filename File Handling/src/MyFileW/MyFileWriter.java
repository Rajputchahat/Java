package MyFileW;
import java.io.*;
public class MyFileWriter {

	public static void main(String[] args) {
		try
		{
		 FileWriter fout = new FileWriter("c:\\noida\\xyz.txt");
		 String msg = "Hey, how are you...?";
		 fout.write(msg);
		 fout.close();
		 System.out.println("Data saved");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
