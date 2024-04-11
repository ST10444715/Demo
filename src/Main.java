import java.awt.Point;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getName();
		getAge();
	}
	
	public static String getName() {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		return name;
//		return s.nextLine(); could also be used
	}
	
	public static double getAge() {
		Scanner s = new Scanner(System.in);
		double age;
		age = s.nextDouble();
		return age;
	}
}