package Assignment;

public class staticDemo {
	
	    static int number;

	    static {
	        number = 50;
	        System.out.println("Static block executed. Number initialized to " + number);
	    }

	    public static void main(String[] args) {
	        System.out.println("Main method executed.");
	        System.out.println("Value of number: " + number);
	    }
}

