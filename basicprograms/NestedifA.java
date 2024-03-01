package basicprograms;

public class NestedifA {

	public static void main(String[] args) {
		int a=50;
		int b=30;
		int c=40;
		if(a>b)
			{
				if(b<a)
				{
				if(c<a)
				{
					if(c!=a)
					{
						System.out.println("logic4");
					}
				}
				else
				{
					System.out.println("logic1");
				}
				}
				else
				{
					System.out.println("logic2");
				}
				}
		
				else
				{
					System.out.println("logic3");
				}
				}
	}
