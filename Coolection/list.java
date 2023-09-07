package Coolection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List<String> n = new LinkedList<String>();
		n.add("india");
		n.add("usa");
		n.add("ploand");
		n.add("russia");
		
			System.out.println(n);
			System.out.println("************");
			n.sort(null);
			System.out.println(n);
			System.out.println("************");
			Collections.reverse(n);
			System.out.println(n);
	}
}
