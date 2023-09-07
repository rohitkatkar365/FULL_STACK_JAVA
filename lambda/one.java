package com.lambda;

interface Lambda
{
	public void demo();
}
public class one {

	public static void main(String[] args) {
		// For Single Value
		Lambda lambda = ()->System.out.println("Statement 1");
		//For Multiple Value
		Lambda lambda1 = ()->
		{
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		};
		lambda.demo();
		System.out.println("----------------");
		lambda1.demo();
	}
}
