package JavaCollection.com;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class S<K, V> {
	private K key;
	private V value;

	public S(K key, V value) {
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

}

public class App2 {

	public static void main(String[] args) {
		
		Comparator<S<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<S<Integer, String>>() {

			@Override
			public int compare(S<Integer, String> obj1, S<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else
					return 0;
			}
		};

		Set<S<Integer, String>> set = new TreeSet<>(COMPARE_NAME_LENGTH);

		set.add(new S<Integer, String>(1, "Chaand"));
		set.add(new S<Integer, String>(5, "Ed"));
		set.add(new S<Integer, String>(9, "John"));
		set.add(new S<Integer, String>(2, "Arnold J"));
		set.add(new S<Integer, String>(5, "Mia"));
		set.add(new S<Integer, String>(1, "Chaand"));

		for (S<Integer, String> element : set) {
			System.out.println(element);
		}
	}

}