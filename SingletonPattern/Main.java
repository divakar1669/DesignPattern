//$Id$
package SingletonPattern;

public class Main {
	
	public static void main(String[] args) {
		// RocketShip r = new RocketShip();  //  since private cannot make a object 
		
		RocketShip r1 = RocketShip.getInstance();
		
		System.out.println(r1.getLocation());
		System.out.println(r1);
		
		RocketShip r3 = RocketShip.getInstance();
		System.out.println(r3.getLocation());
		System.out.println(r3);
		
	}

}
