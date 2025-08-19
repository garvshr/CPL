package Assignment;

public class Demo {
	int count;
	
	public Demo(int count) {
		this.count = count;
	}
	
	public void showNumber() {
		int count = 50;
		System.out.println("Instance variable " + this.count);
		System.out.println("Local variable " + count);	
	}
	
	public static void main(String[] args) {
        Demo obj = new Demo(100);
        obj.showNumber(); 
	}
}
