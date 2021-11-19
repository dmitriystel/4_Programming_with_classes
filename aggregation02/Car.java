package by.introduction.fourth.aggregation02second.main;

import java.util.Arrays;
import java.util.Objects;

public class Car {
	private String carModel;
	private Wheel[] wheels;
	private Engine engine;

	public Car() {
	}
	
	public Car(String carModel) {
		this.carModel = carModel;
		this.wheels = Wheel.getFourWheel();
		this.engine = new Engine();
	}

	public int isWheelPumped() {
		boolean isBlowedUp = false;
		int index = 0;
		for (int i = 0; i < this.wheels.length; i++) {
			if (!wheels[i].isPumppedUp()) {
				isBlowedUp = true;
				index = i;
			}
		}
		if (isBlowedUp) {
			return index;
		} else
			return -1;
	}

	public void move() {
		if (engine.isStarted() && engine.getFuelLevel() > 0 && isWheelPumped() < 0) {
			System.out.println("The car started moving");
		}
		if (!engine.isStarted()) {
			engine.startEngine();
			System.out.println("The car started moving");
		}
		if (isWheelPumped() > 0) {
			System.out.println("Check the wheels, seems like one of them blowed up");
		}
	}

	public void showCarModel() {
		System.out.println(this.carModel);
	}

	public void refuel(int litres) {
		this.engine.setFuelLevel(litres);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(wheels);
		result = prime * result + Objects.hash(carModel, engine);
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
		Car other = (Car) obj;
		return Objects.equals(carModel, other.carModel) && Objects.equals(engine, other.engine)
				&& Arrays.equals(wheels, other.wheels);
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", wheels=" + Arrays.toString(wheels) + ", engine=" + engine + "]";
	}		
}
