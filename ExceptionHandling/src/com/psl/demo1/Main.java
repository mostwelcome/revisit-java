package com.psl.demo1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number using enter key:--");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Number ob=new Number(a, b);
		
		double res=ob.sum();
		System.out.println("Result of sum is:----"+res);
		res=ob.sub();
		System.out.println("Result of substraction is:----"+res);
		res=ob.mul();
		System.out.println("Result of Multiplication is:----"+res);
		res=ob.div();
		System.out.println("Result of Devision is:----"+res);
		
		
	}
}
