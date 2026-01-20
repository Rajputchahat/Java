package MyFileW;
import java.util.Scanner;
import java.io.FileOutputStream;
public class Write 
{
	public static void main(String[] args) {
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the content for your file");
		String str = sc.nextLine();
		FileOutputStream fout = new FileOutputStream("c:\\nodia\\abc.txt");
		byte value[] = str.getBytes();
		fout.write(value);
		fout.close();
		System.out.println("Data saved");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
