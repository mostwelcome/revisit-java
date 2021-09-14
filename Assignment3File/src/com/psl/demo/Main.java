package com.psl.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<>();
		String filename = "Employee.txt";
		Employee ob = new Employee();
		e = ob.readEmployeeDetails(filename);

		for (Employee element : e) {
			System.out.println(element);
		}
	}

}
