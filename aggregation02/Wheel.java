package by.introduction.fourth.aggregation02second.main;

import java.util.Objects;

public class Wheel {

	private boolean isPumppedUp;

	public Wheel() {
	}
	
	public Wheel(boolean isPumppedUp) {
		this.isPumppedUp = isPumppedUp;
	}

	public boolean isPumppedUp() {
		return isPumppedUp;
	}

	public static Wheel[] getFourWheel() {
		Wheel[] wheels = new Wheel[4];
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(true);
		}
		return wheels;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isPumppedUp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return isPumppedUp == other.isPumppedUp;
	}

	@Override
	public String toString() {
		return "Wheel [isPumppedUp=" + isPumppedUp + "]";
	}		
}
