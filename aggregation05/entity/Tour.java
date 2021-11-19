package by.introduction.fourth.aggregation05.entity;

import java.util.Objects;

public class Tour {

	private String type;
	private int numOfTourists;	
	private String country;
	private String city;
	private String transport; 
	private String nutrition;
	private int duration;
	private int price;
	
	public Tour() {
		
	}
	
	public Tour(String type, int numOfTourists, String country, String city, 
			String transport, String nutrition, int duration, int price) {
		
		super();
		this.type = type;
		this.numOfTourists = numOfTourists;
		this.country = country;
		this.city = city;
		this.transport = transport;
		this.nutrition = nutrition;
		this.duration = duration;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfTourists() {
		return numOfTourists;
	}

	public void setNumOfTourists(int numOfTourists) {
		this.numOfTourists = numOfTourists;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, duration, numOfTourists, nutrition, price, transport, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country) && duration == other.duration
				&& numOfTourists == other.numOfTourists && Objects.equals(nutrition, other.nutrition)
				&& price == other.price && Objects.equals(transport, other.transport)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Tour [type=" + type + ", numOfTourists=" + numOfTourists + ", country=" + country + ", city=" + city
				+ ", transport=" + transport + ", nutrition=" + nutrition + ", duration=" + duration + ", price="
				+ price + "]";
	}	
}
