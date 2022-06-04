package labOne;

public class Dog extends Animal implements AnimalBehaviour {

	
private String Breed;
	
	
	@Override
public String toString() {
	return "Dog [Breed: " + Breed + ", Name: " + Name + ", noOfLegs: " + noOfLegs + ", Height: " + height + ", Weight: "
			+ weight + "]";
}


	public Dog(String Name, int noOfLegs, double height, double weight, String Breed)
	{
		super( Name,  noOfLegs,  height,  weight);
		
		this.setBreed(Breed);
	}


	public String getBreed() {
		return Breed
 }
}