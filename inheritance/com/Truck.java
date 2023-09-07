package inheritance.com;

public class Truck extends Vehicle{
	private String sterring;
	private String musicsystem;
	private String seatbelt;
	private String airconditior;
	private int container;
	
	public Truck() {
		super();
		this.sterring = "long";
		this.musicsystem = "yes";
		this.seatbelt = "yes";
		this.airconditior = "no";
		this.container = 40;
	}

	public Truck(String sterring, String musicsystem, String seatbelt, String airconditior, int container) {
		this.sterring = sterring;
		this.musicsystem = musicsystem;
		this.seatbelt = seatbelt;
		this.airconditior = airconditior;
		this.container = container;
	}

	public String getSterring() {
		return sterring;
	}

	public String getMusicsystem() {
		return musicsystem;
	}

	public String getSeatbelt() {
		return seatbelt;
	}

	public String getAirconditior() {
		return airconditior;
	}

	public int getContainer() {
		return container;
	}

	@Override
	public String toString() {
		return "Truck [getSterring()=" + getSterring() + ", getMusicsystem()=" + getMusicsystem() + ", getSeatbelt()="
				+ getSeatbelt() + ", getAirconditior()=" + getAirconditior() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheel()=" + getWheel() + ", getSeats()=" + getSeats()
				+ ", getFueltank()=" + getFueltank() + ", getLight()=" + getLight() +"]";
	}

	
	
}
