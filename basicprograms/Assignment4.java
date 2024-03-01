package basicprograms;

public class Assignment4
{
Assignment4()
{
System.out.println("constructor");	
}
Assignment4(int b,double a)
{
	double c=b*a;
	
	System.out.println(c);
}
void add( int a,double b)

{
double 	c= a*b;
	System.out.println(c);
}
static void add(int a,int b)
{
	int c=a/b;
	System.out.println(c);
}
	public static void main(String[] args) 
	{
		Assignment4 A1 = new Assignment4 ();
		A1.add(1, 2.1);
add(1,1);

new Assignment4(2,2.1);
	}

}
