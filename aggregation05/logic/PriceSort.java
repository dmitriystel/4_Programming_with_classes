package by.introduction.fourth.aggregation05.logic;

import java.util.Comparator;

import by.introduction.fourth.aggregation05.entity.Tour;

public class PriceSort implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		return o1.getPrice() - o2.getPrice();
	}
}
