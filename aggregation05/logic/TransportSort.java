package by.introduction.fourth.aggregation05.logic;

import java.util.Comparator;

import by.introduction.fourth.aggregation05.entity.Tour;

public class TransportSort implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		
		return o1.getTransport().compareTo(o2.getTransport());
	}		
}
