//$Id$
package MoreDecoratorPattern;

public class Main {

	public static void main(String[] args) {
		Coffee expresso = new Expresso();
		expresso = new AddSugar(expresso);
		// expresso = new AddMilk(expresso);
		printCoffee(expresso);
		
		
		
		Coffee cuppuccino = new Cappuccino();
		cuppuccino = new AddSugar(cuppuccino);
		cuppuccino = new AddMilk(cuppuccino);
		printCoffee(cuppuccino);
		
	}
	
	
	 private static void printCoffee(Coffee c) {
	        System.out.println("\nCost: " + c.cost() + " , Description: " + c.getDescription());
	    }
}
