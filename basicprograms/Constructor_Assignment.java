package basicprograms;

public class Constructor_Assignment {

	Constructor_Assignment()
	{
	System.out.println("non parameterized");	
	}
	
	Constructor_Assignment(int a)
	{
		int c = a+8;
		System.out.println(c);	
	}
	Constructor_Assignment(boolean a)
	{
		System.out.println(false);	
	}
	Constructor_Assignment(String a)
	{
		System.out.println("kkk");		
	}
	Constructor_Assignment(char a)
	{
		System.out.println('k');	
	}
	public static void main(String[] args) {
		new Constructor_Assignment();
		new Constructor_Assignment(8);
		new Constructor_Assignment(false);
		new Constructor_Assignment("hhhh");
		new Constructor_Assignment('c');
	}

}
