
public class Sprinkles extends Flavor{
	cupCake cake;
	
	public Sprinkles(cupCake cake) {
		this.cake = cake;
		System.out.println("Adding Sprinkles for an extra $0.25");
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return cake.cost() + .25;
	}
}