package Thiscallingstmt;

public class Logintoamazon {
	Logintoamazon()
	{
	System.out.println("1");
	
	}
	Logintoamazon(int a)
	{
	this();
		System.out.println("2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logintoamazon l=new Logintoamazon();
	new Logintoamazon(3);
	}

}
