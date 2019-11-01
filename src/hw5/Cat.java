package hw5;

public class Cat extends Animal implements Run {
	public void eat() {
		System.out.println("Eating fish"); 
	}
	
	public void cry() {
		 System.out.println("Meow Meow!"); 
		
	}
	
	public void run() {
		 System.out.println("Running with NO sound!"); 
		
	}
}
