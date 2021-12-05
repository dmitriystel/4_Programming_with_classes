package by.introduction.fourth.classes03.main;

import java.util.Arrays;
import java.util.Objects;

public class Student {

	private String surnameAndInit; 
	private int groupNumber;	   
	private int grades[];		   
	
	public Student() {
	}
	
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
			 
	 public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public void addGrade(int grade1, int grade2, int grade3, int grade4, int grade5){
		 grades[0] = grade1;
		 grades[1] = grade2;
		 grades[2] = grade3;
		 grades[3] = grade4;
		 grades[4] = grade5; 
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + Objects.hash(groupNumber, surnameAndInit);
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
		return Arrays.equals(grades, other.grades) && groupNumber == other.groupNumber
				&& Objects.equals(surnameAndInit, other.surnameAndInit);
	}

	@Override
	public String toString() {
		return "Student [surnameAndInit=" + surnameAndInit + ", groupNumber=" + groupNumber + ", grades="
				+ Arrays.toString(grades) + "]";
	}	
}
