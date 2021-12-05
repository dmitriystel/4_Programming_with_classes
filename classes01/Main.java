package by.introduction.fourth.classes01.main;
/*
4. Programming with classes

   Простейшие классы и объекты.
 
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения 
   этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
   который находит наибольшее значение из этих двух переменных.
 */
public class Main {

	public static void main(String[] args) {	
		
		Test1 test = new Test1(4, 5);		
		Logic log = new Logic();		
		View view = new View();
		
		log.calculateSum(test.getX(), test.getY());
		log.findMax(test.getX(), test.getY());
				
		view.printX(test.getX());
		view.printY(test.getY());
		view.printSum(log.calculateSum(test.getX(), test.getY()));
		view.printMax(log.findMax(test.getX(), test.getY()));		
	}
}
