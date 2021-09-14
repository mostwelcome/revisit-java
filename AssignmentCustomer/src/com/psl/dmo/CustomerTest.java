package com.psl.dmo;

public class CustomerTest {
	public static void main(String[] args) {
		Customer ob1 = new Customer(1, "Tushar");

		ob1.setPhoneNumbers("9836284349", "09866574", "575328779");
		ob1.setPrintingAddress("abc", "xyz", "dfghj", "dfghj");
		String add = ob1.printShippingAddress();
		System.out.println("Address is:----" + add);
		String phone = ob1.printPhoneNumbers();
		System.out.println("phone number:---" + phone);
		ob1.printDetails();

		Customer ob2 = new Customer(2, "Babita");
		ob2.setPhoneNumbers("985678967", "045678574", "5756779");
		ob2.setPrintingAddress("adfc", "xfhyz", "dfghghj", "dfghgfhj");
		String add1 = ob2.printShippingAddress();
		System.out.println("Address is:----" + add1);
		String phone1 = ob1.printPhoneNumbers();
		System.out.println("phone number:---" + phone1);
		ob2.printDetails();

		Customer ob3 = new Customer(3, "Swagata");
		ob3.setPhoneNumbers("97656549", "0965574", "5765465479");
		ob3.setPrintingAddress("ahgfd", "xhgfd", "dhgfhj", "djhgfj");
		String add3 = ob1.printShippingAddress();
		System.out.println("Address is:----" + add3);
		String phone3 = ob1.printPhoneNumbers();
		System.out.println("phone number:---" + phone3);
		ob3.printDetails();

	}

}
