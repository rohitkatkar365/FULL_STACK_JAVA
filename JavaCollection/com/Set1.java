package JavaCollection.com;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Set1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Chaand");
		set.add("John");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("chaand");
	
//		for(String name: set){
//			System.out.println(name);
//		}
		
       // System.out.println(set.contains(1));
        
        Set1 s = new Set1();
        //s.printset();
        //s.printlinkedhash();
        s.printtreeset();
	}
//	void printset()
//	{
//		Set<String> li = new HashSet<String>();
//		for(int i = 30; i>0; i--){
//			li.add("A"+i);
//		}
//		for(String i: li){
//			System.out.println(i);
//		}
//	}
//	void printlinkedhash()
//	{
//		Set<String> set = new LinkedHashSet<>();
//		for(int i = 30; i>0; i--){
//			set.add("A"+i);
//		}
//		for(String i: set){
//			System.out.println(i);
//		}
//	}
	void printtreeset()
	{
		Set<String> set = new TreeSet<>();
		for(int i = 30; i>0; i--){
			set.add("A"+i);
		}
		for(String i: set){
			System.out.println(i);
		}
	}
	}
