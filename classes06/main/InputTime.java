package by.introduction.fourth.classes06.main;

import java.util.Scanner;

import by.introduction.fourth.classes06.entity.Time;
import by.introduction.fourth.classes06.logic.TimeLogic;

public class InputTime {
	
	Scanner scan = new Scanner(System.in);
	
	public Time createTime() {
		
		System.out.println("please enter the hours >>");
		int hh = scan.nextInt();
		System.out.println("please enter the minutes >>");
		int mm = scan.nextInt();
		System.out.println("please enter the secons >>");
		int ss = scan.nextInt();

		Time t = new Time(hh, mm, ss);
		
		return t;		
	}
		
	public void changeTime(Time t) {
		
		TimeLogic logic = new TimeLogic();
		
		System.out.println("What would you like to change? " + "\n" + 
				"h - hours" + "\n" + "m - minutes" + "\n" +
				 "s - seconds" + "\n");

		String choice = scan.next();

		switch (choice) {
		
		case "h":
		System.out.println("please enter the hours >>");
			int h = scan.nextInt();
			logic.changeHours(t, h);
		break;
		
		case "m":
		System.out.println("please enter the minites >>");
			int m = scan.nextInt();
			logic.changeMinutes(t, m);
			break;
			
		case "s":
		System.out.println("please enter the seconds >>");
			int s = scan.nextInt();
			logic.changeSeconds(t, s);
		
		break;
		
		}
	}
}



