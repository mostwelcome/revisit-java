package com.psl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		String source = "args[0].txt";
		String destination = args[1];
		try {
			File f=new File(args[0]);
			FileInputStream fis = new FileInputStream(f);
			if(!f.exists());
			{
				System.out.println("Your source file doesnot exist:--");
				System.exit(0);
			}
			File f1=new File(args[1]);
			FileOutputStream fos = new FileOutputStream(f1);
			f1.exists();
			int b;
			while ((b = fis.read()) != -1)
				fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
