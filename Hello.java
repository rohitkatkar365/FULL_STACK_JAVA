package com.java;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object creation
		Car c = new Car("closed","on","seated",1),c1 = new Car("closed","on","seated",0);
		// set values
//		c.setDoor("closed");
//		c.setDriver("seated");
//		c.setEngine("on");
//		c.setSpeed(10);
		System.out.println(c.run());
		System.out.println(c1.run());
	}

}
