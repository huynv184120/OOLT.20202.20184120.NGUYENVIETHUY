package Lab2;
import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[] args) {
		System.out.print("Enter height triangle ");
		Scanner keybroad = new Scanner(System.in);
		int height = keybroad.nextInt();
		for(int i = 0 ; i< height ; i++) {
			for(int j = 0 ; j < height - i ;j++ )System.out.print(" ");
			for(int j =0 ; j < i*2 + 1 ; j++)System.out.print("*");
			System.out.println();
		}
		
	}
}
