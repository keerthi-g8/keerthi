package Methodoverriding;

class parent
{
	 void add()
		{
			
			System.out.println("2");
		}

}




public class Child  extends parent
{
	 void add()
	{
		super.add();
		System.out.println("1");
		
	}


public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

Child c=new Child();

c.add();
	

}
}

