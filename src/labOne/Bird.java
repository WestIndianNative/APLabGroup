package labOne;

import lab1.Animal;
import lab1.AnimalBehaviour;

public class Bird extends Animal implements AnimalBehaviour {

	private int numberofwings;
	
	public Bird(int numberofwings) {
		this.numberofwings=numberofwings;
	}
	public String move() {
		String movement="Fly";
		return movement;
	}
	
	public String makeNoise() {
		String sound ="Trumpet";
		return sound;
	}
	public void eat(String food) {
		
		if(food=="worm") {
			System.out.println("Edible");
		}
		else {
			System.out.println("Inedible");
		}
		 
	}
	
}

