package supercallingstmt;
 public class Child  extends Parent
 {

	
	Child()
	{
	super(2);
			
		System.out.println("1");
	}
 
 public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//Parent p= new Parent();
	new Child();
}
 }
 
class Parent 
{
	Parent (int a)
	{
		
		System.out.println("2");
	}

}