package Genric.com;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int VehicleId;

	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}
	void info(){
		System.out.println("vehicle ID is "+getVehicleId());
	}
	
}

class Car extends Vehicle{
	private String CarModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "Car [CarModel=" + CarModel + "]";
	}
	@Override
	void info(){
		System.out.println("Car Model is "+getCarModel());
	}
	
}

public class App1 {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		display(list);
		
	}
	public static void display(List<? extends Vehicle> list){
		for(Vehicle element: list){
			element.info();
		}
	}
}












