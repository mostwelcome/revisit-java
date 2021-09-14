package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WordCount {

	public static void main(String[] args) {
		File f = new File("abc.txt");
		FileReader fr;
		BufferedReader br;
		System.out.println("i am outside");
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line ;
			System.out.println("inside");
			int count = 0;
			while ((line=br.readLine())!= null) {
				String word[] = line.split(" ");
				count = count + word.length;
				System.out.println("inside while");

			}
			System.out.println("The total num of word in your file is:----" + count);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
