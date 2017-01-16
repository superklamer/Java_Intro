import java.util.Scanner;

public class Shoe {
	int size = 0;
	String color;
	
	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}

	void showSize() {
		System.out.println("Size: " + this.size);
	}
	
	void showColor() {
		System.out.println("Color: " + this.color);
	}
	
	static public void main(String args[]) {
		Shoe shoe = new Shoe(7, "Black");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter shoe size:");
		shoe.size = scanner.nextInt();

		System.out.print("Enter shoe color:");
		shoe.color = scanner.next();
		
		shoe.showSize();
		shoe.showColor();
		
		scanner.close();
	}
}