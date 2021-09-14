package com.psl.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileHandling {
	public static void main(String[] args) {
	//	System.out.println("I am a file handler");
		
		File file=new File("test.txt");
		/*
		try {
			
			// it is for writting the data into a file
			PrintWriter output=new PrintWriter(file);
			
			output.println("Swagata Dutta");
			
			output.println(20);
			
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Error :====="+e);
			//e.printStackTrace();
		}*/
		try {
			Scanner sc=new Scanner(file);
			
			String name=sc.nextLine();
			int age=sc.nextInt();
			System.out.println("Name is:--"+name+"  age is" +age);
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}
}
