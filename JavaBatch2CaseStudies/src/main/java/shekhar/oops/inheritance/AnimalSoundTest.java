package shekhar.oops.inheritance;

import java.util.Scanner;

public class AnimalSoundTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to produce goat sound");
		System.out.println("Press 2 to produce cat sound");
		int input = scanner.nextInt();
		if (input == 1) {
			doSomeWork(new Goat()); // runtime polymorphism
		} else if (input == 2) {
			doSomeWork(new Cat());// runtime polymorphism
		} 
		scanner.close();
	}

	private static void doSomeWork(AnimalSound animalSound) { // loose coupling
		animalSound.produceSound();
	}

}
