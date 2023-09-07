package Coolection;

import java.util.Iterator;

public class Stack {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		java.util.Stack<Integer> s = new java.util.Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		for (Integer integer : s) {
//			System.out.println(integer);
//		}
		for (int integer : s) {
			System.out.println(integer);
		}
		System.out.println("**************");
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search(10));
		System.out.println(s.isEmpty());
				
	}
}
