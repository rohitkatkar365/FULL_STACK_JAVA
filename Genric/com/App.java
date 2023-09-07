package Genric.com;

import java.util.ArrayList;
import java.util.List;

class Data3{
	public <E> void printListData(List<E> list){
		for(E element: list){
			System.out.println(element);
		}
		
	}
	public <E> void printArrayData(E[] arrayData){
		for(E element: arrayData){
			System.out.println(element);
		}
	}
}

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Data3 data = new Data3();
		System.out.println("Printing integer list");
		System.out.println("******************");
		data.printListData(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		System.out.println("Printing String list");
		System.out.println("******************");
		data.printListData(list2);
		
		String[] stringArray = {"One","two","Three"};
		Integer[] integerArray = {1,2,3,4};
		System.out.println("Printing String array");
		System.out.println("******************");
		data.printArrayData(stringArray);
		System.out.println("Printing integer array");
		System.out.println("******************");
		data.printArrayData(integerArray);
		Double[] doubleArray = {2.0,5.0,4.6,8.5};
		System.out.println("Printing double array");
		System.out.println("******************");
		data.printArrayData(doubleArray);
		}

}





