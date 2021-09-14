package com.psl.demo1;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee e[] = new Employee[5];

		for (int i = 0; i < 5; i++) {
			e[i] = new Employee();
			e[i].empid = i + 2;
			e[i].empName = "Name" + (i + 1);
		}
		e[0].joinDate = new Date(2014, 01, 28);
		e[1].joinDate = new Date(2015, 02, 28);
		e[2].joinDate = new Date(2018, 03, 28);
		e[3].joinDate = new Date(2019, 04, 28);
		e[4].joinDate = new Date(2019, 05, 28);

		for (int i = 0; i < 5; i++) {
			ts.add(e[i]);
		}
		Employee ob = new Employee();
		System.out.println(ts);
		ob.displayEmployeeDetails(ts);
		Date searchBeforeDate = new Date(2018, 03, 28);

		ob.searchEmployee(searchBeforeDate, ts);
		
		System.out.println("Employees who have completed six months in the organization:");
		
		Calendar cal=new GregorianCalendar();
		cal.getTime();		
	//	Date d=cal.add(cal.DAY_OF_MONTH, 6);
		
		System.out.println("Sorting as per joining date:-");
		Collections.sort(ts);
	}
	

}