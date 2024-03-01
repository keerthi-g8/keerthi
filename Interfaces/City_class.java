package Interfaces;

interface world_class 
{
void add();

}

abstract class country_class implements world_class
{
	

abstract void  mul();


}


public class City_class extends country_class
{
	void div ()
	{
		System.out.println(11);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City_class c =new City_class();
		c.add();
		c.div();
		c.mul();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("ssss");
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

}
