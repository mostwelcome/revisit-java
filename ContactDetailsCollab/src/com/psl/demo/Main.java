
package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contact> list = null;
		list = new ArrayList<Contact>();
		File f = new File("Contact.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",");
				for (int i = 0; i < arr.length; i++)
					System.out.println(arr[i]);
				List<String> li = new ArrayList<String>();
				for (int i = 3; i < arr.length; i++)
					li.add(arr[i]);
				Contact ob = new Contact(arr[0], arr[1], arr[2], li);
				list.add(ob);
				System.out.println(ob);
				System.out.println("Added");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		do {
			System.out.println("Inside do");
			System.out.println(
					"1 to add contact\n2 to remove contact\n3 to search by contact name\n4 to Show contact details\n5 to exit\n6 to sort by name");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				List<String> ob = new ArrayList<>();
				ob.add("456789");
				ob.add("3456789");
				Contact obj = new Contact("10", "Swagata", "tuadutta13@gmail.com", ob);
				obj.addContact(obj, list);
				ob = new ArrayList<>();
				ob.add("456789");
				ob.add("3567789");
				ob.add("455679");
				ob.add("345678");
				Contact obj1 = new Contact("11", "Tua", "tvdhgvsdhjva13@gmail.com", ob);
				obj.addContact(obj1, list);
				break;
			case 2:
				Contact ob1 = new Contact();
				System.out.println("Enter person name:-");
				String name = sc.next();
				ob1.removeContact(name, list);
				break;
			case 3:
				System.out.println("Enter person name:--");
				String name1 = sc.next();
				Contact ob2 = new Contact();
				ob2.searchByName(name1, list);
				break;
			case 4:
				Contact ob3 = new Contact();
				ob3.showDetails(list);
				break;
			case 5:
				System.exit(0);
			case 6:
				Collections.sort(list,new Contact());
			}

		} while (true);
	}
}
