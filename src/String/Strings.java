package String;
import java.util.*;

public class Strings {
	static void checkEqual(String s1, String s2) {

		if(s1.equals(s2))	
			System.out.println("True");
		else
			System.out.println("False");	
	}
	
	static void convertUpperCase(String st) {
		String ans = "";
		for(int i = 0; i < st.length(); i++) {
			if((int)st.charAt(i) >= 65 && (int)st.charAt(i) <= 90)
				ans += st.charAt(i);
			else
				ans += (char) (st.charAt(i) - 32);
		}
		System.out.println(ans);
	}
	
	static void countVowels(String st) {
		HashSet<Character> vowels = new HashSet<>();
		int count = 0;
		for(char c: "aeiou".toCharArray()) {
			vowels.add(c);
		}
		
		for(int i = 0; i < st.length(); i++) {
			if(vowels.contains(st.charAt(i))) {
				count++;
			}
		}
		
		System.out.print(count);
	}

	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		String s = ob.nextLine();
		countVowels(s);
	}
}
