package hw5;

public class Dog extends Animal implements Run{
	
	public void eat() {
		System.out.println("Eating bones"); 
	}
	
	public void cry() {
		 System.out.println("Woof Woof!"); 
		
		
	}
	
	public void run() {
		 System.out.println("Running with clawing sound"); 
		
	}

}
