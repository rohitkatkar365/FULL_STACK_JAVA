package Exception.com;
import java.util.*;
public class exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try {
			int res = x/y;
			System.out.println("Quiotent Is:- "+res);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Denominator Is 0:)");
		}
	}

}
