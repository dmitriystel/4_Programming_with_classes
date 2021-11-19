package by.introduction.fourth.aggregation03.main;

public class Region extends AdministrativeEntity {
	
	private City centralCity;
	
	public Region() {
		super();
	}

	public Region(String name) {
		super(name);
	}

	public City getCentralCity() {
		return centralCity;
	}

	public void setCentralCity(City centralCity) {
		this.centralCity = centralCity;
	}
}
