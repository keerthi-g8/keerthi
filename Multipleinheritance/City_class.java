package Multipleinheritance;
interface one_parent 
{
	void add();
}
interface two_parent
{
	void sub();
}
public class City_class implements one_parent,two_parent
{
void div()
{
	System.out.println("div");
}
static void mul()
{
	System.out.println("mul");
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 City_class c=new  City_class ();
		 c.add();
		 c.div();
		 c.sub();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

}
