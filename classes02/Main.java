package by.introduction.fourth.classes02.main;
/*
4. Programming with classes

   Простейшие классы и объекты.

2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
   Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- 
   методы для полей экземпляра класса.

 */
public class Main {

	public static void main(String[] args) {
		
		Test2 one = new Test2();
		
		one.setX(4);
		one.setY(5);
		
		System.out.println("x: " + one.getX());
		System.out.println("y: " + one.getY());
	}
}
