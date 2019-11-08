package studentApp;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

public class Login {
	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = new FileReader("Login.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		String a = "vinod123";
		while (line!= null)
		{
            if (line==a) 
            {
            	System.out.println(line);
			}
			
			line = bufferedReader.readLine();

		}
		System.out.println("ASDFGHJ");
		bufferedReader.close();
	}

}
