package Inheritanceconcepts;

public class ParentProgram extends Inheritoverloading 
{
void add()
{
	super.add();
	//int a=100;
	//int b=200;
	System.out.println("keer");
}


}
class Inheritoverloading 
{
	void add()
	{
		
	//	int a=100;
	//	int b=200;
		System.out.println("keer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentProgram 	i11 = new ParentProgram();
		i11.add();
		i11.add();
	}
}

