package com.psl.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAndScarch {

	public static void main(String[] args) {
		ArrayList<String> sn = new ArrayList<String>();

		// Initialize an ArrayList with add()
		sn.add("Swagata");
		sn.add("Babita");
		sn.add("Tushar");
		// print ArrayList
		// System.out.println("ArrayList : " + sn);

		System.out.println("Enter element u want ro search");
		Scanner sc = new Scanner(System.in);
		String searchItem = sc.nextLine();
		int pos = findItem(sn, searchItem);
		if (pos == -1)
			System.out.println("Element not found in the ArrayList");
		else
			System.out.println("Elelemt found at position:---" + pos + 1);
		sc.close();
	}

	private static int findItem(ArrayList<String> sn, String searchItem) {
		boolean isFound = sn.contains(searchItem);
		if (isFound) {
			return sn.indexOf(searchItem);
		} else
			return -1;
	}
}
