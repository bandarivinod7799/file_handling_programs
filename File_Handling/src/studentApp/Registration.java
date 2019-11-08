package studentApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Registration {
	public static void main(String[] args) throws IOException {
		File file = new File("Login.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println("file created");
		FileWriter file1 = new FileWriter("Login.txt");
		PrintWriter printWriter = new PrintWriter(file1);
		// sprintWriter.write(100);
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> info = new LinkedList<String>();
		
		System.out.println("Enter user Name");
		String name = scanner.next();
		
		
		System.out.println("Enter ur LastName");
		String lastName = scanner.next();
		
		System.out.println("Enter ur mailId");
		String mailID = scanner.next();
		
		System.out.println("Enter Password");
		String password = scanner.next();

		printWriter.println(name);
		printWriter.println(lastName);
		printWriter.println(mailID);
		printWriter.println(password);

		System.out.println(" data inserted");
		System.out.println("welcome  " + name);
		printWriter.close();
		scanner.close();

	}

}
