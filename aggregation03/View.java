package by.introduction.fourth.aggregation03.main;

public class View {

	State famousState = new State();

	public void printCapital() {
		System.out.println("столица:");
		System.out.println(famousState.getCapital().getName());
	}

	public void printRegionNumber() {
		System.out.println("количество областей: ");
		System.out.println(famousState.getDistrictList().size());
	}

	public void printArea() {
		System.out.println("площадь: ");
		System.out.println(famousState.getArea());
	}
}
