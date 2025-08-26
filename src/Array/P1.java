package Array;

import static java.lang.System.out;
import java.util.Scanner;
public class P1 {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		
		double arr[] = new double[10];
		double sum = 0.0;
		int k = 0;
		while(k < 10) {
			double num = ob.nextDouble();
			
			if(num <= 0)
				break;
			
			arr[k++] = num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			out.print(arr[i] + " ");
			sum += arr[i];
		}
		out.println(sum);
	}
}
