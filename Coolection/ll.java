package Coolection;

import java.util.LinkedList;

public class ll {
	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Rohit");
		name.add("Om");
		name.add("ram");
		name.add("tejas");
		name.add("shri");
		new ll().printlist(name);
		System.out.println("****************");
		name.set(1, "Rockey");
		new ll().printlist(name);
		System.out.println("****************");
		name.remove();//first element is goone
		new ll().printlist(name);
		System.out.println("****************");
		name.remove(1);
		new ll().printlist(name);
		System.out.println("****************");
	
		
	}
	public static void printlist(LinkedList<String> n)
	{
		for (String string : n) {
			System.out.println(string);
		}
	}
}
