package com.psl.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		String s="09/07/2019";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date d=new java.util.Date();
		d=sdf.parse(s);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
		Calendar now=Calendar.getInstance();
		cal.add(Calendar.MONTH,6);
		System.out.println(cal.getTime());
		Employee ob=new Employee(cal.getTime());
		
		System.out.println(ob.d);
		}
	
	
}
