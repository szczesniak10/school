
public class chocolateShavings extends Flavor{
	cupCake cake;
	
	public chocolateShavings(cupCake cake) {
		this.cake = cake;
		
		System.out.println("Adding Chocolate Shavings for an Extra $0.45");
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Chocolate Shavings";
	}
	
	public double cost() {
		return cake.cost() + .45;
	
	}
}
