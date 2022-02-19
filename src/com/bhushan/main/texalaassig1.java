package com.bhushan.main;

import java.io.IOException;

import com.bhushan.logic.Service;

//Inherite texalaassig1 this class from Service class
public class texalaassig1 extends Service {

	public static void main(String[] args) throws IOException {
		//Create object of Child Class
		texalaassig1 s1=new texalaassig1();
		
		//Call parent class method using child class object
		s1.ReadHTML();
		s1.WriteHTMLToFile();
	}

}
