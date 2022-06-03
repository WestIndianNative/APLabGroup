
public class Animal {

	private String name;
	private int numOfLegs;
	private double height;
	private double weight;
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", numOfLegs=" + numOfLegs + ", height=" + height + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @param name
	 * @param numOfLegs
	 * @param height
	 * @param weight
	 */
	public Animal(String name, int numOfLegs, double height, double weight) {
		super();
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
	
	
	
	
	
}
