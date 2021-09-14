package com.psl.demo;

public class Main {

	public static void main(String[] args) {
		Domestic dm=new Domestic();
		Commercial cm=new Commercial();
		double ammountd=dm.calculateBill(500);
		System.out.println("Calculated bill for domestic is:---"+ammountd);
		
		double ammountc=cm.calculateBill(580);
		System.out.println("Calculated bill for commertial is:----"+ammountc);

	}

}
