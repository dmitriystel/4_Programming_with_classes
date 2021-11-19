package by.introduction.fourth.aggregation04.main;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountInfo {

	public static ArrayList<Account> selectByNumber(int accountNo, AccountList accountList) {
		
		ArrayList<Account> accList = new ArrayList<Account>();

		for (Account account : accountList.getAccountList()) {
			if (account.getAccNumber() == accountNo) {
				accList.add(account);
			}
		}
		return accList;

	}

	public static ArrayList<Account> sortByNumber(ArrayList<Account> accountList) {

		Account[] accs = new Account[accountList.size()];

		for (int i = 0; i < accountList.size(); i++) {
			accs[i] = accountList.get(i);
		}

		boolean sorted = false;
		Account temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < accs.length - 1; i++) {
				if (accs[i].getAccNumber() > accs[i + 1].getAccNumber()) {
					temp = accs[i];
					accs[i] = accs[i + 1];
					accs[i + 1] = temp;
					sorted = false;
				}
			}
		}

		ArrayList<Account> new_list = new ArrayList<Account>(Arrays.asList(accs));

		return new_list;
	}

	public static int sumOfAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			sum += a.getAmount();
		}

		return sum;
	}

	public static int sumOfPositiveAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			if (a.getAmount() > 0) {
				sum += a.getAmount();
			}
		}

		return sum;
	}

	public static int sumOfNegativeAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			if (a.getAmount() < 0) {
				sum += a.getAmount();
			}
		}

		return sum;
	}
}
