package Assignment;

public class finalVariable {
	final int var = 100;
	
	public static void main() {
		finalVariable ob = new finalVariable();
		System.out.println("Initially : " + ob.value);
		
		ob.value = 200;
		System.out.println("Updated : " + ob.value);
	}
}
