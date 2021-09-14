package com.psl.demo;
import java.util.Scanner;

public class AverageCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		try {
			if(n<=0)
			{
				throw new IllegalArgumentexception("Not a natural number");
			}
			else
			{
				int sum=0;
				for(int i=1;i<=n;i++)
				{
					sum=sum+i;
				}
				double avg=sum/n;
				System.out.println("Sum of natural number is:---"+avg);
			}
				
		}
		catch(IllegalArgumentexception e)
		{
			System.out.println("caught Exception "+e);
		}
			
	}
	
}
