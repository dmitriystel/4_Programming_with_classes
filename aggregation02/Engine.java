package by.introduction.fourth.aggregation02second.main;

import java.util.Objects;

public class Engine {

	private boolean isStarted;
	private int fuelLevel;

	public Engine() {
		this.isStarted = false;
		this.fuelLevel = 0;
	}

	public void startEngine() {
		if (this.fuelLevel > 0) {
			this.isStarted = true;
		} else {
			System.out.println("Can't start, the fuel tank is empty. Refuel");
		}
	}

	public int getFuelLevel() {
		return this.fuelLevel;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fuelLevel, isStarted);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return fuelLevel == other.fuelLevel && isStarted == other.isStarted;
	}

	@Override
	public String toString() {
		return "Engine [isStarted=" + isStarted + ", fuelLevel=" + fuelLevel + "]";
	}
	
	
}
