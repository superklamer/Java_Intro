
public class Introduction {
	public static void main (String[] args){
		int twoFiftySixInHex = 0x100;
		System.out.println(twoFiftySixInHex);
		
		String hello = "Hello";
		String world = "World!";
		Object obj = hello + " " + world;
		System.out.println(obj);
		
		String helloWorld = obj.toString();
		System.out.println(helloWorld);

		Employee employee = new Employee();
		employee.age = 20;
		employee.ID = 255;
		employee.firstname = "Radoslav";
		employee.lastname = "Radoev";
		employee.gender = true;
		employee.employeeID = 21824432;
		System.out.printf("Your employee name is %s %s. He is %s years old. Is he male?: %s. His ID is: %s, and his employee ID is: %s", employee.firstname,employee.lastname,
				employee.age, employee.gender,employee.ID, employee.employeeID);
		
		int one = 5;
		int two = 10;
		
		int temp = one;
		one = two;
		two = temp;
		
		System.out.println(one);
		System.out.println();
		
	}
}
