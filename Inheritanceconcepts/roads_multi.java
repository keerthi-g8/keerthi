package Inheritanceconcepts;
 class state_road
{

	static void test()
	{
		System.out.println("state road1");
	}
}
class city_road extends state_road
{
	 void sub()
	{
		System.out.println("cityroad");
	}
	
	static void test1()
		{
			System.out.println("cityroad1");
		}

	
	
		
	
}



public class roads_multi extends city_road
{
	static void multi()
	{
		System.out.println("multi road");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
roads_multi r1= new roads_multi ();
	r1.sub();
	test1();
	test();
	
	multi();
	}


}
