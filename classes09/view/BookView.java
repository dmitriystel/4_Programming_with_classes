package by.introduction.fourth.classes09.view;

import by.introduction.fourth.classes09.entity.Book;

public class BookView {
	
	public void printAuthor(Book[] librery) {
		for (Book b : librery) {
			
			if ( ((b.getAuthor().equals("Cay Horstmann")))) {
				System.out.println(b);
			}
		}
		
		System.out.println(
"_______________________________________________________________________________________________________________"
				);
	}
	
	public void printPublishing(Book[] librery) {
		for (Book b : librery) {
			
			if ( ((b.getYearOfPublishing() > 2015))) {
				System.out.println(b);
			}
		}
		
		System.out.println(
"_______________________________________________________________________________________________________________"
				);
	}		
}
