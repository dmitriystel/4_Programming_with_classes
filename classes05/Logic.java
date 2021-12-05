package by.introduction.fourth.classes05.main;

public class Logic {
        	
	public int increase(int minValue, int maxValue, int count) {	
	    count++;
	        
	    if (count > maxValue) {
	    	count = minValue;
	        }	        
			return count;	        
	}
		

    public int decrease(int minValue, int maxValue, int count) {	   	
	    count--;
	    if (count < minValue) {
	        count = maxValue;
	        }
			return count;
	}
}
