import java.util.Scanner;

public class WorkingBoot extends Shoe {

	public WorkingBoot(int size, String color) {
		super(size, color);
	}
	
	static public void main(String args[]) {
		WorkingBoot workignBoot = new WorkingBoot(7, "Amber");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter working boot size:");
		workignBoot.size = scanner.nextInt();
		workignBoot.showSize();
		workignBoot.showColor();
		
		scanner.close();
	}



}
