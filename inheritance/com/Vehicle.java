package inheritance.com;

public class Vehicle {
	private String engine;
	private int wheel;
	private int seats;
	private int fueltank;
	private String light;
	
	public Vehicle() {
		this.engine = "petrol";
		this.wheel = 4;
		this.seats = 2;
		this.fueltank = 50;
		this.light = "LED";
	}

	public Vehicle(String engine, int wheel, int seats, int fueltank, String light) {
		this.engine = engine;
		this.wheel = wheel;
		this.seats = seats;
		this.fueltank = fueltank;
		this.light = light;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getSeats() {
		return seats;
	}

	public int getFueltank() {
		return fueltank;
	}

	public String getLight() {
		return light;
	}
	
	public void run()
	{
		System.out.println("Parent Class");
	}
	}
