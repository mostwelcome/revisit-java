package com.psl.demo;

public class Domestic {
	double calculateBill(int unit)
	{
		double bill;
		if(unit<=100)
		{
			bill=unit*4;
			if(bill>250)
				return bill;
			else
				return 250;
		}
		else if(unit>100 && unit<=300)
			return unit*4.5;
		else if(unit>300 && unit<=500)
			return unit*4.75;
		else
			return unit*5;
	}
}
