package Interface.com;
//import Interface.com.demo;


	public class demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone1 p = new OnePlus6();
		System.out.println(p.processor());
		System.out.println(p.os());
		System.out.println(p.space());
		System.out.println("---------");
		phone1 p1 = new Iphone1();
		System.out.println(p1.processor());
		System.out.println(p1.os());
		System.out.println(p1.space());
	}

}
	interface phone
	{
		String processor();
		String os();
		int space();
	}
class Iphone1 implements phone{

		@Override
		public String processor() {
			// TODO Auto-generated method stub
			return "Pent";
		}

		@Override
		public String os() {
			// TODO Auto-generated method stub
			return "pentinum";
		}

		@Override
		public int space() {
			// TODO Auto-generated method stub
			return 32;
		}
		
	}
	class OnePlus6 implements phone{
		public String processor()
		{
			return "A30";
		}
		public String os()
		{
			return "Octa";
		}
		public int space()
		{
			return 64;
		}
	}