package by.introduction.fourth.aggregation03.main;

import java.util.ArrayList;

public class State extends AdministrativeEntity {

	private ArrayList<Region> regionList;
	private ArrayList<District> districtList;
	private City capital;

	public State() {
		super();
		this.setName("Belarus");
		this.setCapital(new City());

		ArrayList<District> districtList = new ArrayList<District>();
		District d = new District("Minskiy");

		
		districtList.add(d);
		this.setDistrictList(districtList);
		this.setCapital(new City());
		this.setArea(207600);
	}

	public State(String name, City capital, int area) {
		super(area, name);
		this.capital = capital;
		this.setArea(area);
	}

	public State(ArrayList<Region> regionList, ArrayList<District> districtList, City capital) {
		super();
		this.regionList = regionList;
		this.districtList = districtList;
		this.capital = capital;
	}

	public ArrayList<Region> getRegionList() {
		return regionList;
	}

	public void setRegionList(ArrayList<Region> regionList) {
		this.regionList = regionList;
	}

	public ArrayList<District> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(ArrayList<District> districtList) {
		this.districtList = districtList;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}
}

