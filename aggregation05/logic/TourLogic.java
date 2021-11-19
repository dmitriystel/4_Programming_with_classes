package by.introduction.fourth.aggregation05.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import by.introduction.fourth.aggregation05.entity.Tour;

public class TourLogic {
	
	private List<Tour> offerList;	

	
	{
		offerList = new ArrayList<>();
	}
	
	public List<Tour> getOfferList() {
		return offerList;
	}

	public void setOfferList(List<Tour> offerList) {
		this.offerList = offerList;
	}
	
	 public void sort(List<Tour> list) throws IOException { 
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("We can offer you: rest, excursion, treatment, cruise, shopping.");
	        System.out.println("What do you prefer?");
	        String answer = reader.readLine();
	        boolean isExist = false;

	        for (Tour tour : list) { 
	            if (answer.equalsIgnoreCase(tour.getType())) {
	            	offerList.add(tour);	
	                isExist = true;
	            }
	        }
	        if (!isExist) {
	            System.out.println("You chose wrong answer.Try again.");
	            return;
	        }

	        while (true) {
	            System.out.println("Do you want to sort your tours again?(yes//no)");
	            String answers = reader.readLine();

	            if (answers.equalsIgnoreCase("yes")) {
	                System.out.println("Do you want to sort by transport, nutrition, days or price?");
	                String answer2 = reader.readLine();
	                if (answer2.equalsIgnoreCase("transport")) {
	                    this.offerList.sort((tour1, tour2) -> tour1.getTransport().compareTo(tour2.getTransport()));
	                } else if (answer2.equalsIgnoreCase("nutrition")) {
	                    this.offerList.sort((tour1, tour2) -> tour1.getNutrition().compareTo(tour2.getNutrition()));
	                } else if (answer2.equalsIgnoreCase("days")) {
	                    this.offerList.sort((tour1, tour2) -> tour1.getDuration() - (tour2.getDuration()));
	                } else if (answer2.equalsIgnoreCase("price")) {
	                    this.offerList.sort((tour1, tour2) -> tour1.getPrice() - tour2.getPrice());
	                } else {
	                    System.out.println("Wrong option.Try again.");
	                }

	            } else if (answers.equalsIgnoreCase("no")) {
	                System.out.println("Please, choose the number of tour.");
	                int tourNumber = Integer.parseInt(reader.readLine());
	                System.out.println("Your tour is " + offerList.get(tourNumber - 1));
	                System.out.println("Our congratulations! Good choice! Come again!");
	                return;
	            }	 
	        }
	    }
}
