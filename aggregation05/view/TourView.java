package by.introduction.fourth.aggregation05.view;

import java.util.List;

import by.introduction.fourth.aggregation05.entity.Tour;

public class TourView {
	
	public void showTours(List<Tour> tourList) {
		
		for (Tour tour : tourList) {
			System.out.println(tour);
		}
	}
	
	public void showOfferList(List<Tour> offerList) {
		System.out.println("You have chosen the best option from: ");
		
		for (Tour tour : offerList) {
			System.out.println(tour);		
	    }		
	}
}
