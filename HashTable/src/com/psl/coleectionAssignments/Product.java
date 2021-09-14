package com.psl.coleectionAssignments;

import java.util.Hashtable;
import java.util.Scanner;

public class Product {

	Hashtable<String, String> ProductNames = new Hashtable<String, String>();

	void createProductList(String pid, String value) {
		ProductNames.put(pid, value);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String productId;
		String productName;
		Product p = new Product();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter product id and value of " + (i + 1));
			productId = sc.nextLine();
			productName = sc.nextLine();
			p.createProductList(productId, productName);
		}
		System.out.println("Your Hashtable looks like");
		p.showProductList();

		System.out.println("Enter product id you want to delete...");
		String key = sc.nextLine();
		String search = p.scarchItem(key);
		System.out.println(search);
		if(search==null)
		{
			System.out.println("Product not found");
		}
		else
		{
			System.out.println("After removing the Hashtable becomes:");
	
			p.showProductList();
		}	
		sc.close();
	}

	private String scarchItem(String key) {
		String check = (String) ProductNames.remove(key);
		return check;
	}

	private void showProductList() {
		for (String item : ProductNames.keySet()) {
			System.out.println(item + " " + ProductNames.get(item));
		}

	}

}
