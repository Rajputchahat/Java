package MyFileW;
import java.io.*;
public class MyFileReader {

	public static void main(String[] args) {
		try
		{
			FileReader fin = new FileReader("c:\\noida\\xyz.txt");
			int i=0;
			String data = "";
			while((i=fin.read())!=-1)
			{
				data = data +(char)i;
			}
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
