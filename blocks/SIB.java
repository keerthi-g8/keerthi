package blocks;

public class SIB {
	SIB()
	{
		System.out.println("this is constructor");
	}
SIB(int a)
	{
		System.out.println("this is constructor1");
}
	
	{
		System.out.println("iib");
	}
	{
		System.out.println("iib1");
	}
	
	
	static
	{
		System.out.println("sib'");
	}
	static
	{
		System.out.println("sib1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
System.out.println("main method");

new SIB();
new SIB();
	}

}
