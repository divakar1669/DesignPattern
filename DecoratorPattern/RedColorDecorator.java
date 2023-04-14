//$Id$
/**
 * 
 */
package DecoratorPattern;

/**
 * @author divakar-15961
 *
 */
public class RedColorDecorator extends ShapeDecorator{

	public RedColorDecorator(Shape s) {
		super(s);
	}
	
	@Override
	public void draw() {
		s.draw();
		setColor();
	}
	
	private void setColor() {
		System.out.println("COLOR :: RED");
	}
	
	

	
	

}
