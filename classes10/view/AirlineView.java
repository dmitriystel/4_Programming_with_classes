package by.introduction.fourth.classes10.view;

import by.introduction.fourth.classes10.entity.Airline;

public class AirlineView {

	public void printByDestination(Airline[] airline) {
		for (Airline p : airline) {
			
			if ( ((p.getDestination().equals("London")))) {
				System.out.println(p);
			}
		}
		
		System.out.println(
"_____________________________________________________________________________________________________________________________________________________________________________________"
				);
	}
	
	public void printByWeekday(Airline[] airline) {
		for (Airline p : airline) {
			
			if ( ((p.getWeekDay().equals("tuesday")))) {
				System.out.println(p);
			}
		}
		
		System.out.println(
"__________________________________________________________________________________________________________"
				);
	}

	public void printByTime(Airline[] airline) {

		
		for (Airline p : airline) {
			
			 if (p.getDepartureTime().compareTo("07:00") > 0) {
				System.out.println(p);
			}
		}
		
		System.out.println(
"__________________________________________________________________________________________________________"
				);
	}
}
