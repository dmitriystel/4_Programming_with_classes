package by.introduction.fourth.classes04.entity;

public class Train { 
	
	private String destination;
	private int trainNumber;
	private String departureTime;
	
	public Train() { 
		destination = null;
		trainNumber = 0;
		departureTime = null;		
	}
	
	public Train (String place, int number, String time) { 
		destination = place;
		trainNumber = number;
		departureTime = time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1; 
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Train))
			return false;
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime.equals(other.departureTime))
				return false;		
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
	} else if (!destination.equals(other.destination))
		return false;
	if (trainNumber != other.trainNumber)
		return false;
	return true;		
	}
			
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[destination = " + getDestination() + ", trainNumber = " + getTrainNumber()
		+ ", departureTime = " + getDepartureTime() + "]";
	}
}
			


