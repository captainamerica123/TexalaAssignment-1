package com.bhushan.logic;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Service {
	
		String content=null;
		//Read HTML from URL
		public void ReadHTML() throws IOException
		{
			 URLConnection connection=null;
			 try {
				 connection=new URL("http://www.google.com").openConnection();
				 Scanner scanner=new Scanner(connection.getInputStream());
				 scanner.useDelimiter("\\Z");
				 content=scanner.next();
				 scanner.close();
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 System.out.println(content);
			 System.out.println("HTML Read Successfully");

		}
		//Write HTML Which read from URL to File
		public void WriteHTMLToFile() throws IOException
		{
			PrintWriter out = new PrintWriter(new FileWriter("E:\\Texala Workspace\\TexalaAssignment_1\\web-content.txt", true), true);
		      out.write(content);
		      out.close();
		}
}
