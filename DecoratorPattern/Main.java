//$Id$
package DecoratorPattern;

public class Main {
	
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		
		ShapeDecorator redCircle = new RedColorDecorator(new Circle());
		redCircle.draw();
		
		
		ShapeDecorator redRectangle = new RedColorDecorator(new Rectangle());	
		redRectangle.draw();
		
		
		
	}

}
