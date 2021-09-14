package com.psl.demo;

import java.util.Comparator;
import java.util.List;

public class Contact implements Comparator<Contact> {

	int contactId;
	String contactName;
	String emailAddress;
	List<String> contactNumber;

	public Contact(String string, String string2, String string3, List<String> n) {
		contactId = Integer.parseInt(string);
		contactName = string2;
		emailAddress = string3;
		contactNumber = n;
		System.out.println("values" + contactId + " " + contactName + " " + emailAddress + " " + contactNumber);
	}

	public Contact() {
	}

	public void addContact(Contact obj, List contact) {
		contact.add(obj);

	}

	public void removeContact(String name, List<Contact> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contactName.equalsIgnoreCase(name)) {
				list.remove(list.get(i));
			}
		}
	}

	public void showDetails(List<Contact> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("values" + list.get(i).contactId + " " + list.get(i).contactName + " "
					+ list.get(i).emailAddress + " " + list.get(i).contactNumber);
		}

	}

	public void searchByName(String name, List<Contact> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contactName.equalsIgnoreCase(name)) {
				System.out.println("Searched ontact details:- "+ list.get(i).contactId + " " + list.get(i).contactName + " "
						+ list.get(i).emailAddress + " " + list.get(i).contactNumber);
			}
		}
		
	}

	@Override
	public int compare(Contact ob1, Contact ob2) {
		return (ob1.contactName.compareTo(ob2.contactName));
		
	}

}
