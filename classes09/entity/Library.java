package by.introduction.fourth.classes09.entity;

import java.util.Arrays;

public class Library {
	
	private Book[] librery;
	
	private final static int LENGTH_OF_ARRAY = 5; 
	
	public Library() {
		librery = new Book[LENGTH_OF_ARRAY];		
	}

	public Book[] getLibrary() {
		return librery;
	}

	public static int getLengthOfArray() {
		return LENGTH_OF_ARRAY;
	}
	
	public Book[] addBook(Book book1, Book book2, Book book3, Book book4,Book book5) {		
		librery[0] = book1;
		librery[1] = book2;
		librery[2] = book3;
		librery[3] = book4;
		librery[4] = book5;
		
		return librery;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(librery);
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
		Library other = (Library) obj;
		return Arrays.equals(librery, other.librery);
	}
	
	@Override
	public String toString() {
		return "Library [librery=" + Arrays.toString(librery) + "]";
	}	
}
