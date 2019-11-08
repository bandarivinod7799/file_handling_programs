package fhdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Demo {
	public static void main(String[] args) throws IOException 
	{
		FileReader fileReader=new  FileReader("Demo.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String line=bufferedReader.readLine();
		while (line !=null)
		{
			System.out.println(line);
			line=bufferedReader.readLine();
			
		}
		bufferedReader.close();
	}


}
