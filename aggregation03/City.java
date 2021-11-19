package by.introduction.fourth.aggregation03.main;

import java.util.Objects;

public class City extends AdministrativeEntity {

	private String regionName;
	private String districtName;

	public City() {
		super();
		this.setName("Minsk");
	}

	public City(String name) {
		super(name);

	}

	public String getRegionName() {
		return regionName;
	}

	public String getDistrictName() {
		return districtName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(districtName, regionName);
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
		City other = (City) obj;
		return Objects.equals(districtName, other.districtName) && Objects.equals(regionName, other.regionName);
	}

	@Override
	public String toString() {
		return "City [regionName=" + regionName + ", districtName=" + districtName + "]";
	}	
}