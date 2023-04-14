//$Id$
package SingletonPattern;

public class RocketShip {
	public volatile static RocketShip rocket;
	
	private RocketShip()
	{	System.out.println("Instance created");	 }
	
	
	/*

		// primitive not a singleton as it creates a new object Every time 
		public static  RocketShip getInstance()
		{
			return new RocketShip();
		}
	*/
	
	
	/* 
	
		// this solves singleton pattern , but if two threads are there ,
		 	it results in two different objects 
		
		
		public static  RocketShip getInstance()
		{
			if(rocket == null)
					return new RocketShip();
			return rocket;
		}
		
	*/
	
	
	 /*
		// here again a problem 
		-> the only time synchronization is relevant is the first time through this method.		
	*/
	
	
	 
	// double-checked locking - to over come problem caused by synchronization

		public static  RocketShip getInstance()
		{
			if(rocket == null)
			{
				synchronized(RocketShip.class)
				{
					if(rocket == null) return new RocketShip();
				}
			}
					
			return rocket;
		}
		
		
		static String getLocation()
		{
			int min = -1;
		    int max = 1;
		    double xValue = min + Math.random() * (max - min)*(1e8);
		    double yValue = min + Math.random() * (max - min)*(1e8);
		    return  String.valueOf(xValue)+ ", "+ String.valueOf(yValue);
		}

}
