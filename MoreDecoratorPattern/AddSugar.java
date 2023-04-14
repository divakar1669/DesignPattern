//$Id$
package MoreDecoratorPattern;

public class AddSugar extends CoffeeDecorator {

	public AddSugar(Coffee c) {
		super(c);
	}

	@Override
	public String getDescription() {
		return c.getDescription()+" added Sugar";
	}
	
	
	@Override
	public double cost() {
		return c.cost()+5;
	}
	

}
