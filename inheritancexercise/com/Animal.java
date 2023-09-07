package inheritancexercise.com;

public class Animal {

	protected float heigth;
	protected float weight;
	protected String animaltype;
	protected String bloodtype;
	public Animal() {
		this.heigth = 0;
		this.weight = 0;
		this.animaltype = "unknown";
		this.bloodtype = "unknown";
	}
	public String showinfo() {
		return "Animal [heigth=" + heigth + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodtype="
				+ bloodtype + "]";
	}
	
	
	
}
