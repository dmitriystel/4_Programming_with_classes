package by.introduction.fourth.aggregation04.main;

import java.util.ArrayList;

public class CustomerList {

	private ArrayList<Customer> customerList;

	public CustomerList() {
		super();

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer(234845353, "surName1", "firstName1", "patronymic1", "address1", new AccountList()));
		customerList.add(new Customer(794128148, "surName2", "firstName2", "patronymic2", "address2", new AccountList()));
		customerList.add(new Customer(343943738, "surName3", "firstName3", "patronymic3", "address3", new AccountList()));
		customerList.add(new Customer(543412148, "surName4", "firstName4", "patronymic4", "address4", new AccountList()));
		customerList.add(new Customer(116000000, "surName5", "firstName", "patronymic5", "address5", new AccountList()));

		this.customerList = customerList;
	}

	public CustomerList(ArrayList<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerList == null) ? 0 : customerList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		if (customerList == null) {
			if (other.customerList != null)
				return false;
		} else if (!customerList.equals(other.customerList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "customerList=" + customerList + "]";
	}
}
