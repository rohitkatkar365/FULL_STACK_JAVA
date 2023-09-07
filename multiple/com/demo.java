package multiple.com;

interface printable
{
	void print();
}
interface showable
{
	void show();
}

class demo implements printable,showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("World");
	}
	public static void main(String[] args) {
		demo d = new demo();
		d.print();
		d.show();
	}
}