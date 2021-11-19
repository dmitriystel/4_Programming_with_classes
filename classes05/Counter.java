package by.introduction.fourth.classes05.main;

import java.util.Objects;

public class Counter {
	
	private int min;
	private int max;
	private int current;
	
	public Counter(int min, int max, int current) {
	
		this.min = min;
		this.max = max;
		this.current = current;
		
	if (this.max < this.min) {
		int tmp = this.max;
		this.max = this.min;
		this.min = tmp;
		}
		  
	if (this.current < this.min)
		this.current = this.min;
	if (this.current > this.max)
		this.current = this.max;		  
	}
	
	public Counter(int min, int max) { 
		 
		this(min, max, min); 
		current = this.min;
		 }
	
	public Counter() {
		this(0, 16, 0);
		 }
	
	public void inc() {
		this.current++;
	if (this.current > this.max)
		this.current = this.min;
		 }
	public void dec() {
		this.current--;
	if (this.current < this.min)
		this.current = this.max;
		 }
	public int value() {
		return this.current;
		 }
		
	public int getX() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	@Override
	public int hashCode() {
		return Objects.hash(current, max, min);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return current == other.current && max == other.max && min == other.min;
	}

	@Override
	public String toString() {
		return "Counter [min=" + min + ", max=" + max + ", current=" + current + "]";
	}		
}
