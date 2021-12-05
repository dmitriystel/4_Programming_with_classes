package by.introduction.fourth.classes02.main;

import java.util.Objects;

public class Test2 {
	
	private int x;
	private int y;
	
	public Test2() {		
	}
	
	public Test2 (int x, int y) {
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
		Test2 other = (Test2) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Test2 [x=" + x + ", y=" + y + "]";
	}		
}
