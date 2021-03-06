/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */
public class Number {
	
	public Number () {}
	
	/**
	 * Print the sum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 */
	public static void Sum (int number1, int number2) {
		int sum = number1 + number2;
		System.out.printf("The sum of %s and %s is: %s\n", number1, number2, sum);
	}
	
	/**
	 * Print the average of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 */
	public static void Average (int number1, int number2){
		int average = (number1 + number2) / 2;
		System.out.printf("The average of %s and %s is: %s\n", number1, number2, average);
	}
	
	/**
	 * Print the product of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 */
	public static void Product (int number1, int number2) {
		int product = number1 * number2;
		System.out.printf("The product of %s and %s is: %s\n", number1, number2, product);
	}
	
	/**
	 * Print the minimum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 */
	public static void Min (int number1, int number2) {
		int smallest = Math.min(number1, number2);
		System.out.printf("The smallest of %s and %s is: %s\n", number1, number2, smallest);
	}
	
	/**
	 * Print the maximum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 */
	public static void Max (int number1, int number2) {
		int largest = Math.max(number1, number2);
		System.out.printf("The largest of %s and %s is: %s\n", number1, number2, largest);
	}
	
}

	

