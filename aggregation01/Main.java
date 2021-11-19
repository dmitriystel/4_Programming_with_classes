package by.introduction.fourth.aggregation01.main;
/* 
4. Programming with classes

   Агрегация и композиция
 
1. Создать объект класса Текст, используя классы Предложение, Слово.  
   Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Main {

	public static void main(String[] args) {

		Text text = new Text("Programming with classes");
		
		text.printText();
	}
}
