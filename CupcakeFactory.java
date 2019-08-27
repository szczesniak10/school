
public class CupcakeFactory {
	public static void main(String args[]) {
		System.out.println("Cupcake 1 :");
		cupCake cake = new Chocolate();
		System.out.println("Your Cupcake is " + cake.getDescription()
				+ " for a total of $ " + cake.cost());
		
		System.out.println("Cupcake 2 :");
		cupCake cake2 = new redVelvet();
		cake2 = new Sprinkles(cake2);
		cake2 = new Fruit(cake2);
		cake2 = new chocolateShavings(cake2);
		
		System.out.println("Your Cupcake is " + cake2.getDescription()
				+ " for a total of $ " + cake2.cost());
		
		System.out.println("Cupcake 3 :");
		cupCake cake3 = new Vanilla();
		cake3 = new Fruit(cake3);
		System.out.println("Your Cupcake is " + cake3.getDescription()
				+ " for a total of $ " + cake3.cost());
	}

}
