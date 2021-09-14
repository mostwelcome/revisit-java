package com.psl.demo;

public class IllegalArgumentexception extends Exception{
	
	String str;
	public IllegalArgumentexception(String str) {
		super(str);
		
		this.str=str;
		
	}
	
	public String toString()
	{
		return ("Illegal Number Exception Ocuured !!"+str);
	}
	

}
