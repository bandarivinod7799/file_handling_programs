package fhdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Demo
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("Demo.txt"); 
		
		try
		{
			file.createNewFile();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		
		FileWriter fileWriter=new FileWriter("Demo.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(100);
		bufferedWriter.newLine();
		char[] ch1= {'a','b','c'};
		bufferedWriter.write(ch1);
		bufferedWriter.newLine();
		bufferedWriter.write("vinod");
		bufferedWriter.newLine();
		bufferedWriter.write("bandari vinod");
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}

}
