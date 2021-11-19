package by.introduction.fourth.classes04.logic;


import by.introduction.fourth.classes04.entity.Train;

public class TrainLogic {

	public void sortByNumber(Train[] trains) {
		boolean flag = true;
		Train temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
					temp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public static boolean findByNumber(Train[] trains, int number) {
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getTrainNumber() == number) {
				return true;
			}
		}
		System.out.println("Поезда с таким номером не существует");
		System.out.println();
		return false;
	}

	public void sortByDestination(Train[] trains) {
		boolean flag = true;
		Train temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < trains.length - 1; i++) {
				int comparator;
				comparator = trains[i].getDestination().compareTo(trains[i + 1].getDestination());
				if (comparator == 0) {
					if (trains[i].getDepartureTime().compareTo(trains[i + 1].getDepartureTime()) > 0) {
						temp = trains[i];
						trains[i] = trains[i + 1];
						trains[i + 1] = temp;
						flag = true;
					}
				} else if (comparator > 0) {
					temp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
