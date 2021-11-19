package by.introduction.fourth.aggregation04.main;
/* 
 4. Programming with classes
 
    Агрегация и композиция
    
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
   блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление 
   общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и 
   отрицательный балансы отдельно. 
 */
public class Main {

	public static void main(String[] args) {

		AccountList accountList = new AccountList();

		View.printSelectedByNumber(4329482, accountList);

		View.printSortedByNumber(accountList.getAccountList());

		View.printSumOfAllAccounts(accountList.getAccountList());

		View.printSumOfNegativeAccounts(accountList.getAccountList());

		View.printSumOfPositiveAccounts(accountList.getAccountList());
	}
}
