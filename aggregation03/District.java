package by.introduction.fourth.aggregation03.main;

import java.util.Objects;

public class District extends AdministrativeEntity {

	private City centralCity;

	public District() {
		super();
	}

	public District(String name) {
		super(name);

	}

	public City getCentralCity() {
		return centralCity;
	}

	public void setCentralCity(City centralCity) {
		this.centralCity = centralCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(centralCity);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(centralCity, other.centralCity);
	}

	@Override
	public String toString() {
		return "District [centralCity=" + centralCity + "]";
	}
	
	
}
