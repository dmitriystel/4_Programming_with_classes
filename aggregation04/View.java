package by.introduction.fourth.aggregation04.main;

import java.util.ArrayList;

public class View {

	public static void printSelectedByNumber(int accountNo, AccountList accountList) {

		System.out.println("Счет с указанным номером");

		ArrayList<Account> selected_accList = AccountInfo.selectByNumber(accountNo, accountList);
		System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки");
		System.out.println("");


		for (Account a : selected_accList) {
			System.out.printf("%-15s%-15s%-15s", a.getAccNumber(), a.getAmount(), a.isBlockedStatus());
		}
	}

	public static void printSortedByNumber(ArrayList<Account> accounts) {

		ArrayList<Account> selected_accList = AccountInfo.sortByNumber(accounts);

		System.out.println("\nСчета, отсортированные по номеру: ");

		System.out.printf("%-15s%-15s%-15s", "Номер счёта", "Сумма на счёте", "Статус блокировки\n");

		for (Account a : selected_accList) {
			System.out.printf("%-15s%-15s%-15s%n", a.getAccNumber(), a.getAmount(), a.isBlockedStatus());
		}

	}

	public static void printSumOfAllAccounts(ArrayList<Account> accounts) {

		System.out.println("\n Сумма по всем счетам: " + AccountInfo.sumOfAccounts(accounts) + " "
				+ accounts.get(0).getCurrency());

	}

	public static void printSumOfPositiveAccounts(ArrayList<Account> accounts) {

		System.out.println("\n Сумма положительного баланса: "
				+ AccountInfo.sumOfPositiveAccounts(accounts) + " " + accounts.get(0).getCurrency());

	}

	public static void printSumOfNegativeAccounts(ArrayList<Account> accounts) {

		System.out.println("\n Сумма отрицательного баланса: "
				+ AccountInfo.sumOfNegativeAccounts(accounts) + " " + accounts.get(0).getCurrency());
	}
}
