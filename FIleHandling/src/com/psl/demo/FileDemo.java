package com.psl.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	public static void main(String args[]) throws Exception {

		File file = new File("demo.txt");

		FileOutputStream fo = new FileOutputStream(file);

		DataOutputStream dos = new DataOutputStream(fo);

		dos.writeUTF("my demo content");
		
		FileInputStream fi=new FileInputStream(file);
		DataInputStream di=new DataInputStream(fi);
		
		String str=di.readUTF();
		
		System.out.println(str);
		
		di.close();
		dos.close();
		}

}
