package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Incheon", "21362");
		Customer customer = new Customer("Park", homeAddress);

		System.out.println(customer);

		Address workAddress = new Address("line 1 for work", "Incheon", "213622");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
