package pacakge1;

public class Test1 {
	
	int  m2() {
		return 10/0;
	}
	void m1()
	{
		
		try {
		m2();
	}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		
		
		Test1 t1 = new Test1();
		t1.m1();
		
		
	}
}


class A 
{
	void m1 () throws Exception
	{
		

		
	}
}

class B extends A
{
	void m1() throws ArithmeticException
	{
		
	}
}