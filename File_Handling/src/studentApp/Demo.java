package studentApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = new FileReader("Login.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		//String a = "1234";
		while (line!= null)
		{

			System.out.println(line);
			line = bufferedReader.readLine();

		}
		bufferedReader.close();
	}


}
