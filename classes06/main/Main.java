package by.introduction.fourth.classes06.main;

import by.introduction.fourth.classes06.entity.Time;
import by.introduction.fourth.classes06.view.TimeView;
/*
4. Programming with classes

   Простейшие классы и объекты.

6. Составьте описание класса для представления времени. Предусмотрите возможности установки 
   времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости 
   вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
   Создать методы изменения времени на заданное количество часов, минут и секунд.
*/
public class Main {

	public static void main(String[] args) {
		
		TimeView view = new TimeView();
		InputTime input = new InputTime();
		Time t;
		
		t = input.createTime();		
		view.printCurrentTime(t.toString());
		
		input.changeTime(t);
		view.printChangedTime(t.toString());		
	}
}
