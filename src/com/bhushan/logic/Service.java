package com.bhushan.logic;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//This is parent class
public class Service {
	
		String content=null;
		//Read HTML from URL
		public void ReadHTML() throws IOException
		{
			 URLConnection connection=null;
			 try {
				 //Create connection
				 connection=new URL("http://www.google.com").openConnection();
				 Scanner scanner=new Scanner(connection.getInputStream());
				 scanner.useDelimiter("\\Z");
				 content=scanner.next();
				 scanner.close();
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 //Print HTML to console
			 System.out.println(content);
			 System.out.println("HTML Read Successfully");

		}
		//Write HTML Which read from URL to File
		public void WriteHTMLToFile() throws IOException
		{
			//Create File on machine
			PrintWriter out = new PrintWriter(new FileWriter("E:\\Texala Workspace\\TexalaAssignment_1\\web-content.txt", true), true);
			//Write HTML to file
		      out.write(content);
		      System.out.println("HTML Save to File Successfully");
		      out.close();
		}
}
