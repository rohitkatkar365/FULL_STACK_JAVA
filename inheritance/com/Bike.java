package inheritance.com;

public class Bike extends Vehicle{
	private String handle;
	public Bike() {
		super();
		this.handle = "short";
	}
	public Bike(String handle,String engine, int wheel, int seats, int fueltank, String light) {
		super(engine,wheel,seats,fueltank,light);
		this.handle = handle;
	}
	public String getHandle() {
		return handle;
	}
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheel()=" + getWheel()
				+ ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank() + ", getLight()=" + getLight()
				+ "]";
	}
	public void run(int x)
	{
		System.out.println("Chiled Running");
		System.out.println(toString());
	}
}
