//$Id$
package MoreDecoratorPattern;

public class Cappuccino implements Coffee {
	
	String description;
	public Cappuccino() {
		this.description = "Cappuccino";
	}

	@Override
	public double cost() {
		return 25;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
