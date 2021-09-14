package com.psl.vectorDemo;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Name> v = null;
		Scanner sc = new Scanner(System.in);
		v = new Vector<Name>();
		Name ob = new Name();
		int choice;
		System.out.println("Before");
		do {
			System.out.println(
					"Enter 1 to enter fistName and surname \n\n Enter 2 for displaying complete name \n\nEnter 3 for exit..");
					choice=sc.nextInt();
			switch (choice) {
			case 1:
				
				System.out.println("Enter name:---");
				String firstName = sc.next();
				System.out.println(firstName);
				String surName = sc.next();
				System.out.println(surName);
				ob.insertName(firstName, surName);
				System.out.println(ob.firstName + ob.surName);
				v.add(ob);
				break;
			case 2:
				ob.getName(v);
				break;
			case 3:
				System.exit(0);
			}
		} while (true);
	}
}
