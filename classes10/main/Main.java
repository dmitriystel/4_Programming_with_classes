package by.introduction.fourth.classes10.main;

import by.introduction.fourth.classes10.entity.Airline;
import by.introduction.fourth.classes10.entity.Airlines;
import by.introduction.fourth.classes10.logic.AirlineLogic;
import by.introduction.fourth.classes10.view.AirlineView;

/*
4. Programming with classes

   Простейшие классы и объекты.

10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
    методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими 
    конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
	Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
	Найти и вывести:
	a) список рейсов для заданного пункта назначения;
	b) список рейсов для заданного дня недели;
	c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

	public static void main(String[] args) {
				
		Airline flight1 = new Airline("London", 1517, "Airbus", "06:00", "monday");
		Airline flight2 = new Airline("Paris", 1527, "Boeing", "07:00", "tuesday");
		Airline flight3 = new Airline("Munich", 1537, "Airbus", "08:00", "wednesday");
		Airline flight4 = new Airline("London", 1547, "Boeing", "09:00", "tuesday");
		Airline flight5 = new Airline("Prague", 1557, "Embraer", "10:00", "monday");
		
		Airlines airlines = new Airlines();
		AirlineLogic logic = new AirlineLogic();
		AirlineView view = new AirlineView();
		
		airlines.addAirline(flight1, flight2, flight3, flight4, flight5);
		
		System.out.println("список рейсов для заданного пункта назначения - London: ");		
		logic.sortListOfAirlinesByDestination(airlines.getAirline());
		view.printByDestination(airlines.getAirline());
				
		System.out.println("список рейсов для заданного дня недели - tuesday: ");		
		logic.sortListOfBooksByWeekday(airlines.getAirline());
		view.printByWeekday(airlines.getAirline());
						
		System.out.println("список рейсов для заданного дня недели, время вылета для которых больше 7:00 : ");		
		logic.sortListOfBooksByWeekdayAndTime(airlines.getAirline());
		view.printByTime(airlines.getAirline());		 
	}
}
