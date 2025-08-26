package Assignment;

public class student {
	String name;
	int marks;
	

	public student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void print() {
		System.out.println("Name : " + name + "Marks" + marks);
	}
	
	public static void main() {
		student st1 = new student("Garv", 100);
		student st2 = new student("Kautuk", 99);
		
		st1.print();
		st2.print();
	}
}
