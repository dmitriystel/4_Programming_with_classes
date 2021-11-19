package by.introduction.fourth.aggregation03.main;

import java.util.Objects;

public class AdministrativeEntity {

	private int area;
	private String name;

	public AdministrativeEntity() {
		super();
	}

	public AdministrativeEntity(int area, String name) {
		super();
		this.area = area;
		this.name = name;
	}

	public AdministrativeEntity(String name) {
		super();
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdministrativeEntity other = (AdministrativeEntity) obj;
		return area == other.area && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "AdministrativeEntity [area=" + area + ", name=" + name + "]";
	}	
}
