package Assignments;
public class ParentProgram extends Inheritoverloading 
{
void add()
{
super.add();
	int a=100;
	int b=400;
	System.out.println(a+b);
}


}
class Inheritoverloading 
{
	void add()
	{
		
		int a=100;
		int b=200;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentProgram 	i1 = new ParentProgram();
		i1.add();
		i1.add();
	
}


	}


