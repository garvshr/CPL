package Assignment;

package assignment;
class MyClass {
    static int count = 10;

    static void display() {
        System.out.println(count);
    }
}
//class Student {
//    String name;
//    int age;
//
//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
class Person {

    String name = "Instance Variable Name";

    void showName() {
        String name = "Local Variable Name";

        System.out.println("Local variable: " + name);

        System.out.println("Instance variable: " + this.name);
    }
}
class Pi{
	static double pi = 3.14;
	void showConstant() {
        System.out.println("Value of PI: " + pi);
    }

}
class Test {
    void show() {
        int x;  

        x = 10; 
        System.out.println("local variable: " + x);
    }
}
class Counter {
    int value = 0;

   
    void increment() {
        value++;
        System.out.println("After increment: " + value);
    }

    void decrement() {
        value--;
        System.out.println("After decrement: " + value);
    }

    void display() {
        System.out.println("Current value: " + value);
    }
}
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student name: " + name);
    }
}
class A {
    static int x = 10;
}

class B {
    void modifyAndPrint() {
        A.x = 50;
        System.out.println("Value of x in class B: " + A.x);
    }
}

class User{
	final int userId;
    User(int id) {
        userId = id;
    }

    void display() {
        System.out.println("User ID: " + userId);
    }
}
class Empty{
	static int num;
}
public class Assignment {
	public static void main(String[]args) {
//		System.out.println(MyClass.count);
//        MyClass.display();
		
//		Student s1 = new Student("Alice", 20);
//        Student s2 = new Student("Bob", 22);
//
//        s1.display();
//        s2.display();
		
		
//		Person p = new Person();
//        p.showName();
		
//		System.out.println("PI = " + Pi.pi);
//
//        Pi c = new Pi();
//        c.showConstant();
		
//		Test t = new Test();
//        t.show();
//        Compile Error	
		
//		Counter c = new Counter();
//
//        c.display();    
//        c.increment();  
//        c.increment();  
//        c.decrement();  
//        c.display();
		
//		Student s1 = new Student();
//        s1.setName("Alice");  
//        s1.display();
//
//        Student s2 = new Student();
//        s2.setName("Bob");
//        s2.display();
        
//        System.out.println("Initial value of x in class A: " + A.x);
//
//        B obj = new B();
//        obj.modifyAndPrint();
//
//        System.out.println("Value of x in class A after modification: " + A.x);
		
//		User u1 = new User(101);
//        User u2 = new User(202);
//
//        u1.display();
//        u2.display();
		
		System.out.println(Empty.num);
		Empty.num = 1;
		System.out.println(Empty.num);
	}
}