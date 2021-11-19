package by.introduction.fourth.classes03.main;

import java.util.Random;
/*
4. Programming with classes

   Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
   успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
   Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные 
   только 9 или 10.
 */
public class Main {

	public static void main(String[] args) {
		
		  int n = 10; 
		  
		  Student students[] = new Student[10]; 
		  
		  students[0] = new Student("D.Lawson", 1);	
		  students[1] = new Student("D.Turner", 1);	
		  students[2] = new Student("P.Gorman", 1);	
		  students[3] = new Student("J.Suriol", 1);	
		  students[4] = new Student("J.Lapchinsky", 1);	
		  students[5] = new Student("K.Ritchie", 2); 
		  students[6] = new Student("D.Eng", 2);	
		  students[7] = new Student("R.Hoffarth", 2);
		  students[8] = new Student("F.Trimble", 2);
		  students[9] = new Student("R.Rau", 2);	
		  
		  Random rand = new Random();
		  
		  for (int i = 0; i < n; i++) {	
			  for (int j = 0; j < 5; j++)	
				  students[i].addGrade(8 + rand.nextInt(3));

		  }
		  
		  System.out.println("all the students: "); 
		  for (int i = 0; i < n; ++i) {
		   students[i].print();
		  }
		  
		  System.out.println();
		  
		  System.out.println("students with grades 9 and 10: ");
		  for (int i = 0; i < n; ++i) {
			  if (students[i].selectsGradesFrom9())
				  students[i].print();
		  }
  	}
}
