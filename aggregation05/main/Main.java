package by.introduction.fourth.aggregation05.main;

import java.io.IOException;
import java.util.List;

import by.introduction.fourth.aggregation05.entity.Tour;
import by.introduction.fourth.aggregation05.entity.TourList;
import by.introduction.fourth.aggregation05.logic.TourLogic;
import by.introduction.fourth.aggregation05.view.TourView;

/* 
4. Programming with classes

   Агрегация и композиция
   
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
   различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку 
   путевок.
*/
public class Main {

	public static void main(String[] args) throws IOException {
		
		TourList list = new TourList();
		TourLogic list1 = new TourLogic();
		
		TourView tourview = new TourView();
						
		list.addTour("rest", 2, "TR", "Bodrum", "plane", "AI", 11, 2000);	
		list.addTour("excursion", 2, "DE", "Munich", "bus", "BB", 7, 800);		
		list.addTour("treatment", 2, "CZ", "Karlovy Vary", "plane", "AI", 12, 2800);		
		list.addTour("shopping", 2, "ES", "Madrid", "plane", "BB", 7, 1300);
		list.addTour("shopping", 2, "ES", "Madrid", "plane", "BB", 7, 800);		
		list.addTour("cruise", 2, "USA", "Caribbean", "plane", "AI", 11, 5000);		
		list.addTour("rest", 2, "MEX", "Cancun", "plane", "AI", 11, 2500);		
		list.addTour("excursion", 2, "I", "Roma", "bus", "BB", 7, 600);
		list.addTour("excursion", 2, "CZ", "Prague", "bus", "BB", 7, 500);
		list.addTour("treatment", 2, "IL", "Dead Sea", "plane", "AI", 10, 3000);
		
		tourview.showTours(list.getTourList());
		
        list1.sort(list.getTourList());
        
        tourview.showOfferList(list1.getOfferList());
	}
}
