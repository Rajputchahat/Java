package MyFileW;
import java.io.FileInputStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class MyFileR {

	public static void main(String[] args) {
		try
		{
			FileInputStream fin = new FileInputStream("c:\\noida\\abc.txt");
			int i=0;
			String data = "";
			while((i=fin.read())!=-1)
			{
				data = data + (char)i;
			}
			System.out.println(data);					
		}
		catch(Exception e)
		{
		
		}

	}

}
