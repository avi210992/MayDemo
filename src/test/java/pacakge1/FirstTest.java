package pacakge1;

import org.junit.jupiter.api.Test;

public class FirstTest {

	
	@Test
	public void func1()
	
	{
		System.out.println("In the First class func1");
		System.out.println("the test suite param from Jenkins is -->"+System.getProperty("suite"));
	}
}
