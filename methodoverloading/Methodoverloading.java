package methodoverloading;




public class Methodoverloading
{
	void add(int a, int b, double c)
	{
	System.out.println("non static menthod");	
	}
	void add(double a, int b, double c)
	{
		System.out.println("non static menthod 1");	
	}
	
	void add(int a, double b, int c) {
		System.out.println("non static menthod 2");	
	}
	static void test(String a, char b)
		
	{
		System.out.println("static method ");
	}
	static void test(char a, String b)
	{
		System.out.println("static method1");
	}
	
	
	public static void main(String[] args)
	{
Methodoverloading A1= new Methodoverloading();
	A1.add(2, 4, 2.2);
A1.add(2.7, 0, 0);
A1.add(0, 3.1, 0);
test("Keerthi",'a');
test('a',"Keerthi");


	}

}
