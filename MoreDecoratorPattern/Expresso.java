//$Id$
package MoreDecoratorPattern;

public class Expresso implements Coffee {

	String description;
	public Expresso() {
		 description = "expresso";
	}

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
