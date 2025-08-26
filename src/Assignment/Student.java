package Assignment;

public class Student {
	String name;
	int marks;
	

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void print() {
		System.out.println("Name : " + name + "Marks" + marks);
	}
	
	public static void main() {
		Student st1 = new Student("Garv", 100);
		Student st2 = new Student("Kautuk", 99);
		
		st1.print();
		st2.print();
	}
}
