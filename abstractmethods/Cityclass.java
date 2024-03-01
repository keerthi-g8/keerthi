package abstractmethods;



abstract class countryclass 

{
abstract 	void add();
}





abstract class stateclass extends countryclass
{
	abstract void mul();
}



public class Cityclass extends  stateclass
{
void div()
{
	System.out.println("div");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cityclass c=new Cityclass();
c.add();
c.div();
c.mul();
	}
	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println(1);
	}
	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}

}
