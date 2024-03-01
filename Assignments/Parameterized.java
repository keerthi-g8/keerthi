package Assignments;

public class Parameterized
{
	static
	{
		System.out.println("this is static");
	}
	Parameterized(int a)
	
	{
		System.out.println(a);
	}
	{
		
	
	System.out.println("iib");

	}
	public static void main(String[] args) {
		System.out.println("main method");
		new Parameterized(9);
		new Parameterized(7);



	}
}
