package local.inner.com;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		door d = new door();
				if(d.islocked("qwerx"))
				{
					System.out.println("Visit Later");
				}
				else
				{
					System.out.println("Welcome To Shop");
				}
	}
}
