package labOne;



public class Bird extends Animal implements AnimalBehaviour {

	private int numberofwings;
	
	
	public int getNumberofwings() {
		return numberofwings;
	}



	public Bird(String Name, int noOfLegs, double height, double weight, int NoOfWings)
	{
		super( Name,  noOfLegs,  height,  weight);
		
		this.setNoOfWings(NoOfWings);
	}
	
	private void setNoOfWings(int noOfWings) {
		// TODO Auto-generated method stub
		
	}



	public void setNoOfLegs(int noOfLegs) {
		this.numberofwings = noOfLegs;
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

