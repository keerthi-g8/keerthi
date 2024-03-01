package Assignments;



interface one_parent
{
	void add();
}
interface two_parent
{
	void sub();
}
interface three_parent
{
	void cal();
}
interface four_parent
{
	void perct();
}
interface five_parent
{
	void fact();
}
public class City_class implements one_parent,two_parent,three_parent,four_parent,five_parent
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
		 c.mul();
		 c.fact();
		 c.cal();
		 mul();
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
	@Override
	public void fact() {
		// TODO Auto-generated method stub
		System.out.println("6");
	}
	@Override
	public void perct() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}
	@Override
	public void cal() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

}
