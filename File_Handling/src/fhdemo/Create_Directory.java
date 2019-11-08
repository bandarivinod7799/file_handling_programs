package fhdemo;

import java.io.File;

public class Create_Directory
{
	public static void main(String[] args) {
		
		File file=new File( "E:\\JavaWSP\\File_Handling","text.txt");
		file.mkdir();
		System.out.println(file.exists());
	}

}
