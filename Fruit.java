
public class Fruit extends Flavor{
	cupCake cake;
	
	public Fruit(cupCake cake) {
		this.cake = cake;
		System.out.println("Adding Fruit for an extra $0.75");
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Fruit";
	}
	
	public double cost() {
		return cake.cost() + .75;
	}
}