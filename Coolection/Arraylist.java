package Coolection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);// add
		a.add(20);
		a.add(30);
		System.out.println(a);//display list
		System.out.println(a.contains(10));//present or not
		a.remove(0);
		System.out.println(a);
		a.clear();//flush the list
		System.out.println(a);
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a.get(0));//access element by location
		System.out.println(a.isEmpty());
		a.set(1, 100);
		System.out.println(a);
		System.out.println(a.indexOf(10));
		
	}

}
