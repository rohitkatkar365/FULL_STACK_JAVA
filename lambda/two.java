package com.lambda;
public class two {

	public static void main(String[] args) {
	
	    new Thread(()->{			
			System.out.println("I am inside thread 1");
	           }).start();;
	}                     
}