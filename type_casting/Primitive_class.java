package type_casting;

class parent
{
public void add()
{
	System.out.println("add");
}


}

public class Primitive_class extends parent
{
	
	public void mul()
	{
		System.out.println("mul");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	parent r	=new Primitive_class ();//upcastingimplicit
	Primitive_class       d1=      (Primitive_class) r;//downcasting explicit
	d1.mul();
	}
	

}
