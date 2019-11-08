package fhdemo;

import java.io.File;
import java.io.IOException;

public class Create_File 
{
	public static void main(String[] args) 
	{
	  File file=new File("vinod.txt");
	  try {
		file.createNewFile();
	    }
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(file.exists());
		
	}

}
