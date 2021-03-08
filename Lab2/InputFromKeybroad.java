package Lab2;
import java.util.Scanner;
public class InputFromKeybroad {
	public static void main(String[] arg) {
		Scanner keybroad = new Scanner(System.in);
		System.out.println("what is your name ?");
		String name = keybroad.nextLine();
		System.out.println("How old are you ?");
		int age = keybroad.nextInt();
		System.out.println("how tall are you (m)? ");
		double height = keybroad.nextDouble();
		
		System.out.println("Mrs/Ms " +  name + "," + age + "years old" + "," + "your height is " + height);
	}
}

	
	
	