package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

	int empid;
	String empName;
	String birthdate;
	List<String> skills;
	String Project;

	public List<Employee> readEmployeeDetails(String filename) {
		FileReader f;
		BufferedReader br;
		List<Employee> li = null;
		try {
			f = new FileReader(filename);
			br = new BufferedReader(f);
			li = new ArrayList<Employee>();
			try {
				String line = br.readLine();
				while (line != null) {
					Employee e = new Employee();
					String[] arr = line.split(",");
					String[] skillsarr = arr[4].split(";");
					/*
					 * for (int i = 0; i < skills.length; i++) System.out.println(skills[i]);
					 */
					line = br.readLine();
					e.empid = Integer.parseInt(arr[0]);
					e.empName = arr[1];
					e.birthdate = arr[2];
					for (int i = 0; i < skillsarr.length; i++)
						e.skills.add(skillsarr[i]);
					li.add(e);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return li;
	}

}
