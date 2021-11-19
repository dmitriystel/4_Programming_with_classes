package by.introduction.fourth.classes09.main;

import by.introduction.fourth.classes09.entity.Book;
import by.introduction.fourth.classes09.entity.Library;
import by.introduction.fourth.classes09.logic.BookLogic;
import by.introduction.fourth.classes09.view.BookView;
/*
 4. Programming with classes

    Простейшие классы и объекты.

9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
   метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
   методами. Задать критерии выбора данных и вывести эти данные на консоль.
   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
   Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года.
 */
public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(152486, "Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly", 2015, 688, 45, "hardcover");
		Book book2 = new Book(459258, "Thinking In Java", "Bruce Eckel", "MindView", 2006, 1079, 43, "hardcover");
		Book book3 = new Book(284925, "An Interdisciplinary Approach", "Robert Sedgewick", "Princeton University", 2017, 1074, 69, "hardcover");
		Book book4 = new Book(359284, "Core Java Volume I--Fundamentals", "Cay Horstmann", "Pearson", 2018, 866, 39, "hardcover");
		Book book5 = new Book(753159, "Core Java, Volume II--Advanced Features", "Cay Horstmann", "Pearson", 2016, 978, 46, "hardcover" );
		
		Library librery = new Library();
		BookLogic logic = new BookLogic();
		BookView view = new BookView();
		
		librery.addBook(book1, book2, book3, book4, book5);
				
		System.out.println("список книг заданного автора - Cay Horstmann: ");		
		logic.sortListOfBooksByAuthor(librery.getLibrary());
		view.printAuthor(librery.getLibrary());
				
		System.out.println("список книг, выпущенных заданным издательством - MindView: ");		
		logic.sortListOfBooksByPublishing(librery.getLibrary());
		view.printPublishing(librery.getLibrary());
				
		System.out.println("список книг, выпущенных после заданного года - 2015: ");		
		logic.sortListOfBooksPublishingByYear(librery.getLibrary());
		view.printPublishing(librery.getLibrary());
	}
}
