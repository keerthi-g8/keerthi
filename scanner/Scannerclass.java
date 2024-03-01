package scanner;

import java.util.Scanner;

public class Scannerclass {
	int num1;
	int num2;
	 //int sum;
	

	public static void main(String[] args)
	{
	int sum,sub,mul,div;
		
Scanner s1 =new Scanner(System.in);

System.out.println("enter the first number");
int  num1 =s1.nextInt();
System.out.println("enter the second number");
		
int  num2 =s1.nextInt();
 sum=num1+num2;

System.out.println("add two numbers:"+sum);

sub=num1-num2;

System.out.println("sub two number:"+sub);
mul=num1*num2;
System.out.println("mul two number:"+mul);
div=num1/num2;
System.out.println("div two number:"+div);
}
}
