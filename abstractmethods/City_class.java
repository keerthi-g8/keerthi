package abstractmethods;

abstract class state
{
abstract	void add();
}

public class City_class extends state{
	
void mul()
{
	System.out.println("mul");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City_class c=new City_class();
		c.add();
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

}
