package by.introduction.fourth.aggregation02second.main;
/*
4. Programming with classes
 
   Агрегация и композиция
 
 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
    Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {

	public static void main(String[] args) {
			
			Car car = new Car("Hyundai");
			
			car.move();
			
			car.showCarModel();
	}
}
