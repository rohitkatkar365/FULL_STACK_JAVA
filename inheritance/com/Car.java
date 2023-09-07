package inheritance.com;

public class Car extends Vehicle{
	private String sterring;
	private String musicsystem;
	private String seatbelt;
	private String airconditior;
	private String fridge;
	private String entertainmentsystem;

	public Car() {
		super();
		this.sterring = "ring";
		this.musicsystem = "yes";
		this.seatbelt = "yes";
		this.airconditior = "yes";
		this.fridge = "no";
		this.entertainmentsystem = "yes";
	}
	public Car(String sterring, String musicsystem, String seatbelt, String airconditior, String fridge,
			String entertainmentsystem) {
		super();
		this.sterring = sterring;
		this.musicsystem = musicsystem;
		this.seatbelt = seatbelt;
		this.airconditior = airconditior;
		this.fridge = fridge;
		this.entertainmentsystem = entertainmentsystem;
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
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentsystem() {
		return entertainmentsystem;
	}
	@Override
	public String toString() {
		return "Car [getSterring()=" + getSterring() + ", getMusicsystem()=" + getMusicsystem() + ", getSeatbelt()="
				+ getSeatbelt() + ", getAirconditior()=" + getAirconditior() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentsystem()=" + getEntertainmentsystem() + ", getEngine()=" + getEngine()
				+ ", getWheel()=" + getWheel() + ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank()
				+ ", getLight()=" + getLight() + "]";
	}

	
}
