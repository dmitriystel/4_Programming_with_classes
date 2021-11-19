package by.introduction.fourth.classes07.main;
/*
4. Programming with classes

   Простейшие классы и объекты.
   
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
   вычисления площади, периметра и точки пересечения медиан.
 */

import by.introduction.fourth.classes07.entity.Triangle;
import by.introduction.fourth.classes07.logic.TriangleLogic;

public class Main {

	public static void main(String[] args) {
		
		double x1 = 3;
		double y1 = 4;
		double x2 = 9;
		double y2 = 8;
		double x3 = 4;
		double y3 = 12;
		
		
		Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
		
		TriangleLogic logic = new TriangleLogic();
		
		System.out.println("area of ​​a triangle: ");
		System.out.println( logic.calculateTriangleArea(x1, y1, x2, y2, x3, y3) );
		
		System.out.println("perimeter of a triangle: ");
		System.out.println( logic.calculateTrianglePerimeter(x1, y1, x2, y2, x3, y3) );
		
		System.out.println("median intersection points: ");		
		System.out.println( logic.findIntersectionPointsMedians(x1, y1, x2, y2, x3, y3) );							
	}
}
