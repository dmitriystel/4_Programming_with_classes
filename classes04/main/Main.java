package by.introduction.fourth.classes04.main;
/*
 4. Programming with classes
 
    Простейшие классы и объекты.
    
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, 
   время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте 
   возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
   вывода информации о поезде, номер которого введен пользователем. Добавьте 
   возможность сортировки массив по пункту назначения, причем поезда с одинаковыми 
   пунктами назначения должны быть упорядочены по времени отправления.
 */

import by.introduction.fourth.classes04.entity.Depo;
import by.introduction.fourth.classes04.entity.Train;
import by.introduction.fourth.classes04.logic.TrainLogic;
import by.introduction.fourth.classes04.view.TrainView;

public class Main {

	public static void main(String[] args) {

		Train train1 = new Train("Warsaw", 1, "06:00");
		Train train2 = new Train("Minsk", 4, "07:00");
		Train train3 = new Train("Moscow", 3, "08:00");
		Train train4 = new Train("Warsaw", 2, "09:00");
		Train train5 = new Train("Minsk", 5, "10:00");

		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		Input input = new Input();

		depo.addTrains(train1, train2, train3, train4, train5);

		System.out.println("Вывод на консоль поездов");
		view.printTrain(depo.getTrains());

		System.out.println("Сортировка поездов по номеру");
		logic.sortByDestination(depo.getTrains());
		view.printTrain(depo.getTrains());

		int userNumber;
		userNumber = input.enterFromConsol(depo.getTrains());
		view.printByNumber(depo.getTrains(), userNumber);
	}
}
