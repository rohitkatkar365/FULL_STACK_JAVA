package Interface.com;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone1 p = new OnePlus5();
		System.out.println(p.processor());
		System.out.println(p.os());
		System.out.println(p.space());
		System.out.println("---------");
		phone1 p1 = new Iphone();
		System.out.println(p1.processor());
		System.out.println(p1.os());
		System.out.println(p1.space());
	}

}
