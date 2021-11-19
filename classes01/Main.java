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
		
		Test1 one = new Test1(4, 5);
		
		System.out.println("x: " +  one.getX());
		System.out.println("y: " +  one.getY());		
		System.out.println("sum: " + one.sum());		
		System.out.println("max: " + one.max());
	}
}
