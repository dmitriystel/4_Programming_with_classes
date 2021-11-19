package by.introduction.fourth.classes08.main;
/*
 4. Programming with classes

    Простейшие классы и объекты.

8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
   set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа 
   Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и 
   вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер 
   кредитной карточки, номер банковского счета.
   Найти и вывести:
   a) список покупателей в алфавитном порядке;
   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
import by.introduction.fourth.classes08.entity.Customer;
import by.introduction.fourth.classes08.entity.Customers;
import by.introduction.fourth.classes08.logic.CustomerLogic;
import by.introduction.fourth.classes08.view.CustomerView;

public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(321, "D.Turner", "5 Hill St", 121124, 721654987);
		Customer customer2 = new Customer(821, "P.Gorman", "15 Hill St", 221125, 321654987);
		Customer customer3 = new Customer(521, "K.Ritchie", "10 Hill St", 221126, 421654987);
		Customer customer4 = new Customer(421, "R.Hoffarth", "25 Hill St", 121127, 621654987);
		Customer customer5 = new Customer(121, "F.Trimble", "40 Hill St", 221128, 521654987);
		
		Customers customers = new Customers();
		CustomerLogic logic = new CustomerLogic();
		CustomerView view = new CustomerView();
		
		customers.addCustomers(customer1, customer2, customer3, customer4, customer5);
		
		System.out.println("Список покупателей в алфавитном порядке: ");
		logic.customersInAlphabeticalOrder(customers.getCustomers());
		view.printCustomer(customers.getCustomers());

		
		System.out.println("список покупателей, у которых номер кредитной карточки находится в заданном интервале 200000 - 300000");
		logic.sortByCreditCardNumber(customers.getCustomers());	
		view.printCustomerbyCreditCard(customers.getCustomers());
	}	
}
