package com.psl.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileAss {

	public static void main(String[] args) {
		String sourceFile = args[0] + ".txt";
		String destinationFile = args[1] + ".txt";

		Scanner sc = new Scanner(System.in);
		/*
		 * try { File fs=new File(sourceFile);
		 * 
		 * 
		 * //File fd=new File(destinationFile); } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 */

		try {
			File fd = new File(destinationFile);

			if (!fd.createNewFile()) {
				System.out.println("The destination file already exists..");
				System.out.println("Enter 1 to create a new file and enter 2 to override the exiting file..");
				int choice;
				choice=sc.nextInt();
				switch (choice) {
				case 1:System.out.println("Enter new destination file name");
						File file=new File(sc.nextLine()+".txt");
					break;
				case 2:
					break;
				default:System.out.println("enter valid input");
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
