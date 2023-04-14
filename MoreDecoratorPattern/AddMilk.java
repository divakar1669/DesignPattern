//$Id$
/**
 * 
 */
package MoreDecoratorPattern;

/**
 * @author divakar-15961
 *
 */
public class AddMilk extends CoffeeDecorator {

	public AddMilk(Coffee c) {
		super(c);
	}

	@Override
	public String getDescription() {
		return c.getDescription()+" added milk ";
	}

	@Override
	public double cost() {
		return c.cost()+5;
	}
	
}
