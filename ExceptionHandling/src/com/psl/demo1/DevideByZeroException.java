package com.psl.demo1;

public class DevideByZeroException extends Exception {
	
	String str;
	public DevideByZeroException(String str) {
	
		super(str);
		this.str=str;
	}
	public String toString()
	{
		return ("Number Cannot be devided by zero "+str);
	}
}
