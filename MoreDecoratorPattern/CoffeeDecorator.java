//$Id$
package MoreDecoratorPattern;

public abstract class CoffeeDecorator implements Coffee {

	Coffee c ;
	public CoffeeDecorator(Coffee c) {
		this.c=c;
	}

	@Override
	public double cost() {
		return c.cost()+2;
	}

}
