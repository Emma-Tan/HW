package hw5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A dog is"); 
		Animal d = new Dog();
		d.eat();
		d.cry();
		d.run();
		System.out.println(""); 
		System.out.println("A cat is"); 
		Animal c = new Cat();
		c.eat();
		c.cry();
		c.run();
	}

}
