package by.introduction.fourth.classes08.view;

import by.introduction.fourth.classes08.entity.Customer;

public class CustomerView {

	public void printCustomer(Customer[] customers) {
		for (Customer c : customers) {
			System.out.println(c);
		}
		
		System.out.println(
"____________________________________________________________________________________________________________________"
				);
	}
	
	public void printCustomerbyCreditCard(Customer[] customers) {
		for (Customer c : customers) {
			
			if (200000 < c.getCreditCardNumber() && c.getCreditCardNumber() < 300000) {
				System.out.println(c);
			}

		}
		
		System.out.println(
"____________________________________________________________________________________________________________________"
				);
	}
}
