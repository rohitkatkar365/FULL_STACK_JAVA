package abstraction.com;

abstract class person
{
	public void speak()
	{
		System.out.println("She his thought...");
	}
	public void eat();
}
class vegan extends person
{
	public void eat()
	{
		System.out.println("Vegan");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new vegan();
		p.speak();
		p.eat();
	}

}
