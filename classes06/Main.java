package by.introduction.fourth.classes06.main;

import java.util.Scanner;
/*
4. Programming with classes

   Простейшие классы и объекты.

6. Составьте описание класса для представления времени. Предусмотрте возможности установки 
   времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости 
   вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
   Создать методы изменения времени на заданное количество часов, минут и секунд.
*/
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the hours >>");
		int hh = scan.nextInt();
		System.out.println("please enter the minutes >>");
		int mm = scan.nextInt();
		System.out.println("please enter the secons >>");
		int ss = scan.nextInt();

		Time t = new Time(hh, mm, ss);

		System.out.println("current time:" + t);

		System.out.println("What would you like to change? " + "\n" + 
							"h - hours" + "\n" + "m - minutes" + "\n" +
							 "s - seconds" + "\n");

		String choice = scan.next();

		switch (choice) {
			case "h":
				System.out.println("please enter the hours >>");
				int h = scan.nextInt();
				t.changeHours(h);
			break;
			case "m":
				System.out.println("please enter the minites >>");
				int m = scan.nextInt();
				t.changeMinutes(m);
				break;
			case "s":
				System.out.println("please enter the seconds >>");
				int s = scan.nextInt();
				t.changeMinutes(s);

			break;
		}

		System.out.println("modified time:" + t);
	}
}
