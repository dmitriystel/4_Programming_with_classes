package by.introduction.fourth.classes03.main;

public class View {
	
	  public void printAllListOfStudents(Student[] students) {
		  
		  System.out.println("List of all students: ");
		  
		  for(Student student : students) {			  
			  System.out.print("Student: " + student.getSurnameAndInit() + ". Group: " 
		      + Integer.toString(student.getGroupNumber()) + ". Grades: ");

			  for (int grade : student.getGrades())
				System.out.print(grade + " ");			  
			  	System.out.print("\n");			  
		  }	
		  System.out.println();
	  }
	  
	  public void selectGradesFrom9(Student[] students) {
		  
		  System.out.println("List of students with grades 9 and 10");
		  
		  for(Student student : students) {
			  int numberOfGradesFrom9 = 0;
			  
			  for (int grade : student.getGrades()) {
				  if (grade >= 9) {
					  numberOfGradesFrom9++;  
				  }
			  }
			  		if(numberOfGradesFrom9 == 5) {
			  			 System.out.print("Student: " + student.getSurnameAndInit() + ". Group: " 
			  				      + Integer.toString(student.getGroupNumber()) + ". Grades: ");

			  					  for (int grade : student.getGrades())
			  						System.out.print(grade + " ");			  
			  					  	System.out.print("\n");			
			  		}			  
		  }
		  System.out.println();		  
	  }
}

	
	  


