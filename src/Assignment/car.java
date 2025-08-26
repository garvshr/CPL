package Assignment;

public class car {
	String model;
	int year;
	static int numberOfCars = 0;
	
	public void car(String model, int year) {
		this.model = model;
		this.year = year;
		numberOfCars++;
	}
	
	public void displayDetails() {
		System.out.println("Model : " + model + "year : " + year);
	}
	
	public static void main(String args[]) {
		car ob1 = new car();
		car ob2 = new car();
		
		ob1.car("Toyota Camry", 2020);
		ob2.car("Honda Civic", 2022);
		
		
		ob1.displayDetails();
        ob2.displayDetails();
        
        System.out.print(numberOfCars);
	}
}