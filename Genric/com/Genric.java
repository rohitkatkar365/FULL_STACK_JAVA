package Genric.com;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>
{
	private T myvariable;

	public Data(T myvariable) {
		super();
		this.myvariable = myvariable;
	}

	public T getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "Data [myvariable=" + myvariable + "]";
	}
	
}
public class Genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data<Object>> s = new LinkedList<>();
		/*
		 * For Specific type of data
		 * 	List<Data<DataType(String,Integer,Float,Boolean )>> s = new LinkedList<>();
		 */
		s.add(new Data<Object>("Some text"));
		s.add(new Data<Object>(1));
		s.add(new Data<Object>(2.0));
		s.add(new Data<Object>('R'));
		
		Genric g = new Genric();
		g.printlist(s);
	}
 void printlist(List<Data<Object>> l)
{
	ListIterator<Data<Object>> i = l.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next().getMyvariable());
	}
}
}
