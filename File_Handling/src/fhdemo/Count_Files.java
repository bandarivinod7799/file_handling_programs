package fhdemo;

import java.io.File;

public class Count_Files 
{
public static void main(String[] args)
{
	int count=0;
	File file=new File("E:\\JavaWSP");
	String[] s=file.list();
	for (String s1 : s)
	{
		count++;
		System.out.println(s1);
		
	}
	System.out.println("Total files :"+count);
	
}
}
