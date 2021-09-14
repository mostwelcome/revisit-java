package com.psl.demo;

public class Commercial {
	double calculateBill(int unit)
	{
		double bill;
		if(unit<=100)
		{
			bill=unit*4.25;
			if(bill>350)
				return bill;
			else
				return 350;
		}
		else if(unit>100 && unit<=300)
			return unit*4.75;
		else if(unit>300 && unit<=500)
			return unit*5;
		else
			return unit*5.25;
	}
}
