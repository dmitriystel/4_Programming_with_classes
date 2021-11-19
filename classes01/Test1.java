package by.introduction.fourth.classes01.main;

import java.util.Objects;

public class Test1 {

	private int x;
	private int y;

	public Test1 (int x, int y) {
		this.x = x; 
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int sum () {
		
		return x + y;
	}
	
	public int max () {
		int res = 0; 
		
		if (x > y ) {
			res = x ;
			
		} else if (y > x) {
			res = y; 
		}
		
		return res;				
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}		
}