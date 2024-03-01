package ExceptionHandling;

public class Try_exception {

	public static void main(String[] args) {
	try
	{
int i=1/0;
	}
	catch(ArithmeticException a)
	{
System.out.println("since the infinity cannot be store in int datatype wehave habdled it incatch");
	}

	}
}
