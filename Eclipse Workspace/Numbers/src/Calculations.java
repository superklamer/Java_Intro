/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */

import java.util.Scanner;

public class Calculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** Create new scanner object.*/
		Scanner scanner = new Scanner(System.in);
		
		/** Grab user input.*/
		System.out.println("Enter two digits and I will show you sum, "
				+ "average, product, smallest and lowest");
		
		System.out.printf("Enter first number: ");
		int number1 = scanner.nextInt();			
		System.out.printf("Enter second number: ");
		int number2 = scanner.nextInt();	
		System.out.printf("Enter third number: ");
		int number3 = scanner.nextInt();	

		/** Make calculations.*/
		Number.Sum(number1, number2, number3);
		Number.Average(number1, number2, number3);
		Number.Product(number1, number2, number3);
		Number.Min(number1, number2, number3);
		Number.Max(number1, number2, number3);
		
		/** Close scanner object.*/
		scanner.close();
	}
}
