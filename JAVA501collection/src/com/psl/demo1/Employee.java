package com.psl.demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	int empid;
	String empName;
	Date joinDate;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", joinDate=" + joinDate + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	void displayEmployeeDetails(TreeSet<Employee> ts) {
		/*
		 * Iterator it=ts.iterator(); while(it.hasNext()) { //System.out.println("id:\t"
		 * +it.next().empid + " Name:\t" + ts.empName // + " empJoiningDate:\t" +
		 * ts.joinDate); System.out.println(it.next()); }
		 */

	}

	public void searchEmployee(Date searchBeforeDate, TreeSet<Employee> ts) {
		System.out.println("Who joined your before given date");
		System.out.println(ts.size());
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//sdf.parse(searchBeforeDate);
		Calendar cal = new GregorianCalendar();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Date d1=sdf.parse(searchBeforeDate);
		cal.setTime(searchBeforeDate);
		
		// System.out.println(cal);
		//Iterator<Employee> it = ts.iterator();
		/*
		 * while(it.hasNext()) { boolean b=false; System.out.println(".....");
		 * b=cal.before(it.next().joinDate); System.out.println(b);
		 * 
		 * { // System.out.println(it.next()); System.out.println(b); } }
		 */
		/*for (Employee tse : ts) {
			if (cal.before(tse.joinDate)) {
				System.out.println("in");
			} else
				System.out.println("out");
		}*/
		for(Employee e:ts)
		{
			if(cal.before(e.joinDate))
				System.out.println("I am");
			else
				System.out.println("no");
		}
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i = 0;
		int b=o1.joinDate.compareTo(o2.joinDate);
		if (b>0)
			i = 1;
		else if (b<0)
			i = -1;
		else
			i = 0;
		return i;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub

		return this.empName.compareTo(o.empName);

	}

}
