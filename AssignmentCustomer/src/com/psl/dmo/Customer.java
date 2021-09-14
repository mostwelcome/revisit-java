package com.psl.dmo;

public class Customer {
	int id;
	String name;
	String homePhone;
	String cellPhone;
	String workPhone;
	String street;
	String city;
	String state;
	String zip;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	String printPhoneNumbers() {

		return homePhone + workPhone + cellPhone;
	}

	public void setPrintingAddress(String street, String city, String state, String zip) {
		this.state = state;
		this.city = city;
		this.street = street;
		this.zip = zip;
	}

	public void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}

	String printShippingAddress() {

		return street + city + state + zip;
	}

	public void printDetails() {

		System.out.println(id);
		System.out.println(name);
		System.out.println(homePhone);
		System.out.println(workPhone);
		System.out.println(cellPhone);
		System.out.println(street);
		System.out.println(state);
		System.out.println(city);
		System.out.println(zip);
	}
}
