package hieraricalinheritance;

import java.util.Scanner;
 class Parentclass {

	static void add()
	{
		
Scanner s =new Scanner (System.in);
System.out.println("enter a");
int  a=s.nextInt();
System.out.println("enter b");
int b=s.nextInt();
// c = a+b;

int sum=a+b;

System.out.println("add two numbers:"+sum);
int sub=a-b;

System.out.println("sub two numbers:"+sub);

	}
 }