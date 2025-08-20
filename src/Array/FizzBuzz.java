package Array;

import java.util.Scanner;
public class FizzBuzz {

	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		
		int n = ob.nextInt();
		
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			if(i % 5 == 0 && i % 3 == 0)
				arr[i] = "FizzBuzz";
			else if(i % 3 == 0)
				arr[i] = "Fizz";
			else if(i % 5 == 0)
				arr[i] = "Buzz";
			else
				arr[i] = String.valueOf(i);
		}
	}
}	
