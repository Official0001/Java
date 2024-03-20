import java.util.*;

abstract class Animal{
	abstract void makeSound();
}

class Dog extends Animal{
	
	void makeSound()
	{
		System.out.println("Bark");
	}
}

class Cat extends Animal{
	
	void makeSound()
	{
		System.out.println("Meowwww");
	}
}


public class AnimalSoundApp {
	
	public static void main(String x[])
	{
		Dog d = new Dog();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
	}
	
}
