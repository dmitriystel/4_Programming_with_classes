package by.introduction.fourth.classes04.view;


import by.introduction.fourth.classes04.entity.Train;

public class TrainView {

	public void printTrain(Train[] trains) {
		for (Train t : trains) {
			System.out.println(t);
		}
	}
	public void printByNumber(Train[] trains, int number) {
		for (Train t : trains) {
			if (t.getTrainNumber() == number) {
				System.out.println(t + " ");
				break;
			}
		}
	}

	public static void printTrainNumber(Train train) {
		System.out.println(train.getTrainNumber() + " ");
	}
}
