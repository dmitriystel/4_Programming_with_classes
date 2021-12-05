package by.introduction.fourth.classes01.main;

public class Logic {
		
	public int calculateSum(int x, int y) {		
		return x + y;
	}
	
	public int findMax(int x, int y) {
		int result = 0; 
		
		if (x > y ) {
			result = x ;
			
		} else 
			result = y;

		return result;				
	}
}
