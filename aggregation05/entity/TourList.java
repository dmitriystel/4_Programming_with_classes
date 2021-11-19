package by.introduction.fourth.aggregation05.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourList {	
	
	private List<Tour> tourList;
	
	{
		tourList = new ArrayList<>();
	}

	public List<Tour> getTourList() {
		return tourList;
	}

	public void setTourList(List<Tour> tourList) {
		this.tourList = tourList;
	}
	
	public void addTour(String type, int numOfTourists, String country, String city, String transport,
			 String nutrition, int duration, int price) {

		tourList.add(new Tour(type, numOfTourists, country, city, transport, nutrition, 
				  duration, price));	
	}

	@Override
	public int hashCode() {
		return Objects.hash(tourList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourList other = (TourList) obj;
		return Objects.equals(tourList, other.tourList);
	}

	@Override
	public String toString() {
		return "TourList [tourList=" + tourList + "]";
	}	
}
