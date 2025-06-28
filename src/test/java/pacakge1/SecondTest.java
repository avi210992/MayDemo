package pacakge1;

import org.junit.jupiter.api.Test;

public class SecondTest {
	@Test
	public void func1()
	
	{
		System.out.println("In the Second class func1");
		System.out.println("In the Second class func1 - post commit");
		System.out.println("the Environment param from Jenkins is -->"+System.getProperty("ENVIRONMENT"));
		
	}
}
