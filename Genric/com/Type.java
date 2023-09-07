package Genric.com;
class Data1<K,V>
{
	private K key;
	private V value;
	public Data1(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public <E,N> void display(E e,N n)
	{
		System.out.println("Element:- "+e+"Number:- "+n);
	}
}
public class Type {
	//Data<Integer,String> d = new Data<Integer,String>(1, "Rohit");
	public static void main(String[] args) {
		Data1<Integer,String> d = new Data1<Integer,String>(1,"String");
		//System.out.println(d);
		//System.out.println("Key:- "+d.getKey()+"Value:- "+d.getValue());
		d.display(1,2);
	}

	
}
