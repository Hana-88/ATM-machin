import java.io.File;  // Import the File class

import java.io.FileWriter;   // Import the FileWriter class


import java.util.List;

import javax.swing.text.html.Option;

import java.io.IOException;

public class main extends bank{
	
	 
	public static void main(String[] args) throws IOException{
	 bank b=new bank();
	 b.log();

	 try {
		File myObj = new File("filename.txt");
		if (myObj.createNewFile()) {
		  System.out.println("File created: " + myObj.getName());
		} else {
		  System.out.println("File already exists.");
		}
	  } catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	  }
	  try {
		FileWriter myWriter = new FileWriter("filename.txt");
		myWriter.write("Files in Java might be tricky, but it is fun enough!");
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	  } catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	  }
	}

}