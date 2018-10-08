package imparpar;

import java.util.Scanner;
public class ImparPar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Odd or Even?");
		System.out.print("Enter an integer number: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Even!!");
		}
		else {
			System.out.println("Odd!!");
		}
		
		input.close();
	}

}
