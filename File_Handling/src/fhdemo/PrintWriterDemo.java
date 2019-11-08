package fhdemo;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException
	{
	FileWriter file=new FileWriter("Demo.txt");
	PrintWriter printWriter=new PrintWriter(file);
	printWriter.write(100);
	int a=10;
	printWriter.println("i am");
	printWriter.println("abcd");
	printWriter.println(a);
	
	printWriter.close();
	System.out.println(" data inserted");
	}
  
}

