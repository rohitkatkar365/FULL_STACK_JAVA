package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class data
{
	private String name;

	public String getName() {
		return name;
	}

	public data(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "data [name=" + name + "]";
	}
}
public class sort {

	public static void main(String[] args) {
		int x = 10;
		//x += 1;
	 new Thread(()->System.out.println(x)).start();;
		System.out.println(x);
		List<data> list = new ArrayList<data>();
		list.add(new data("rohit"));
		list.add(new data("Zebra"));
		list.add(new data("Elephant"));
		list.add(new data("Dog"));
		Collections.sort(list,(data d1,data d2)->{
		return d1.getName().compareTo(d2.getName());
		});
		for(data d : list)
		{
			System.out.println(d.getName());
		}
		
		list.forEach(i->
		{
			if(i.getName().length()>5)
			{
				System.out.println(i.getName());
			}
		});
	}

}
