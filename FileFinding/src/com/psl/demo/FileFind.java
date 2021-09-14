package com.psl.demo;

import java.io.File;
import java.util.Scanner;

public class FileFind {
	
	public static void main(String[] args) {
		FileFind ff=new FileFind();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file to be searched:---");
		String name=sc.nextLine();
		System.out.println("Enter the path :----");
		String direc=sc.nextLine();
		ff.findFile(name,new File(direc));
	}

	void findFile(String name, File direc) {
	
		File[] list=direc.listFiles();
		if(list!=null)
			for(File fil:list)
			{
				if(fil.isDirectory())
					findFile(name, fil);
				else if(name.equalsIgnoreCase(fil.getName()))
					System.out.println("FOUND IN PLACE:--- "+fil.getParent());
			}
	}
	
	

}
