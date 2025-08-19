package Assignment;

public class Q5 {
	static int count = 0;
	String name;
	
	public Q5(String name) {
		this.name = name;
	}
	
	public static void main() {
		Q5 ob1 = new Q5("Object 1");
		ob1.count = 5;
		
		Q5 ob2 = new Q5("Object 2");
		System.out.println(ob2.name + " count as: " + ob2.count);
	}
}
