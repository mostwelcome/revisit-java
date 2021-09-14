package com.psl.vectorDemo;

import java.util.Scanner;
import java.util.Vector;

public class Name {
	String firstName;
	String surName;

	void getName(Vector<Name> v) {
		for(Name ob:v)
		{
			System.out.println("Full Name"+ob.firstName+" "+ob.surName);
		}
	}

	void insertName(String fn, String sn) {
		firstName = fn;
		surName = sn;
	}
}