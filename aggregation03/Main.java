package by.introduction.fourth.aggregation03.main;

import java.util.ArrayList;
/* 
 4. Programming with classes
     
    Агрегация и композиция
  
3. Создать объект класса Государство, используя классы Область, Район, Город. 
   Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
 */
public class Main {

	public static void main(String[] args) {

		ArrayList<District> districtList = new ArrayList<District>();
		State state = new State();
		View view = new View();

		view.printCapital();

		view.printRegionNumber();

		view.printArea();
	}
}
