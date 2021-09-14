package com.psl.demoFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemoDelete {

	public static void main(String[] args) {

		FileDemoDelete file = new FileDemoDelete();
		file.writeContent();
		
		file.readContent();
	}

	private void readContent() {
		
		FileReader f=null;
		try {
			f=new FileReader("io.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch;
		try {
			while((ch=f.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("size of the file"+f.);
		
	}

	private void writeContent() {
		String str = "I am the content!!!!";
		FileWriter fr;
		try {
			fr = new FileWriter("io.txt");
			
			System.out.println();
			
			for (int i = 0; i < str.length(); i++) {
				fr.write(str.charAt(i));
			}
			
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
