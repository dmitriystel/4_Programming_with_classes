package by.introduction.fourth.classes03.main;

import java.util.Arrays;
import java.util.Objects;

public class Student {

	private String surnameAndInit; 
	private int groupNumber;	  
	private int grades[];		   	
	private int nGrades;		   
	
	 public Student(String surnameAndInit, int groupNumber) { 
		 														
		 this.surnameAndInit = surnameAndInit;		
		 this.groupNumber = groupNumber;		
		 grades = new int[5];				
     }
	 	 
		public String getSurnameAndInit() {
			return surnameAndInit;
		}
		
		public void setSurnameAndInit(String surnameAndInit) {
			this.surnameAndInit = surnameAndInit;
		}
		
		public int getGroupNumber() {
			return groupNumber;
			
		}
		
		public void setGroupNumber(int groupNumber) {
			this.groupNumber = groupNumber;
		}	 
	 
	 boolean addGrade(int grade) { 
		  if (nGrades >= 5) {
			  return false;
		  }
		  grades[nGrades] = grade;	
		  nGrades++;
		  return true;
		 }
	 
	  boolean selectsGradesFrom9() { 
		  for (int i = 0; i < nGrades; ++i)
			  if (grades[i] < 9)
				  return false;
		  return true;
		 }
	  
	  void print() {
		  System.out.print(this.surnameAndInit + ". Group: " + Integer.toString(this.groupNumber) + ". Grades: " );

		  for (int i = 0; i < nGrades; ++i)
			System.out.print(Integer.toString(grades[i]) + " ");
		  	System.out.print("\n");
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + Objects.hash(groupNumber, nGrades, surnameAndInit);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Arrays.equals(grades, other.grades) && groupNumber == other.groupNumber && nGrades == other.nGrades
				&& Objects.equals(surnameAndInit, other.surnameAndInit);
	}		  
}
