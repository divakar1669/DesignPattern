//$Id$
package FactoryPattern;

public class Factory {
	
	public Communication getModeOfCommunication(String mode)
	{
		if(mode.equalsIgnoreCase("mobile"))
		{	return new EmailCommunication();	}
		else if(mode.equalsIgnoreCase("email"))
		{	return new MobileCommunication();	}
		else if(mode.equalsIgnoreCase("post"))
		{	return new PostalCommunication();	}
		return null ;
	}

}
