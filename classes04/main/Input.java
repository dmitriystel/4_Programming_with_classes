package by.introduction.fourth.classes04.main;

import java.util.Scanner;

import by.introduction.fourth.classes04.entity.Train;
import by.introduction.fourth.classes04.logic.TrainLogic;
import by.introduction.fourth.classes04.view.TrainView;

public class Input {
			
	private final Scanner scan;
	
	public Input() {
		scan = new Scanner(System.in);
	}
	
	public void inputMessage() {
		System.out.println("Введите номер поезда из перечисленных >>");
	}
	
	public void errorEnter() {
		System.out.println("Некорректный ввод. Повторите попытку >>");
	}	
	public int enterFromConsol(Train[] trains) {
		int userNumber;
		do {
			inputMessage();
			for (int i = 0; i < trains.length; i++) {
				TrainView.printTrainNumber(trains[i]);
			}
			
			while (!scan.hasNextInt()) {
				errorEnter();
				scan.next();				
			}
			userNumber = scan.nextInt();
		}
		
		while (!TrainLogic.findByNumber(trains, userNumber));
			return userNumber;
	}	
}
