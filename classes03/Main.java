package by.introduction.fourth.classes03.main;
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
		  int numberOfStudents = 10; 
		  
		  Student students[] = new Student[numberOfStudents]; 		  
		  View view = new View();
		  
		  students[0] = new Student("D.Lawson", 2);	
		  students[1] = new Student("D.Turner", 1);	
		  students[2] = new Student("P.Gorman", 1);	
		  students[3] = new Student("J.Suriol", 1);	
		  students[4] = new Student("J.Lapchinsky", 1);	
		  students[5] = new Student("K.Ritchie", 2); 
		  students[6] = new Student("D.Eng", 2);	
		  students[7] = new Student("R.Hoffarth", 2);
		  students[8] = new Student("F.Trimble", 2);
		  students[9] = new Student("R.Rau", 2);
	
		  students[0].addGrade(5, 8, 9, 6, 8);
		  students[1].addGrade(9, 7, 9, 6, 8);
		  students[2].addGrade(9, 7, 9, 6, 8);
		  students[3].addGrade(9, 10, 9, 9, 10);
		  students[4].addGrade(8, 7, 9, 7, 8);
		  students[5].addGrade(5, 7, 6, 6, 8);
		  students[6].addGrade(8, 9, 7, 8, 8);
		  students[7].addGrade(10, 10, 9, 9, 10);
		  students[8].addGrade(7, 6, 7, 6, 8);
		  students[9].addGrade(8, 7, 8, 7, 9);
		   	
		  view.printAllListOfStudents(students);
		  view.selectGradesFrom9(students);	  
  	}
}
