package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[]=new int[4];
	
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value a");//2
		int s1=sc.nextInt();
		
		
		
	try {
		System.out.println("enter the value b");
	
		int s2=sc.nextInt();
	
		
	}
	catch (InputMismatchException g)
	{
		System.out.println("handled");
	
	
	}
	
	int arr[]=new int[4];
	for(int i=0;i<5;i++)
	{
	try
	{
		System.out.println(arr[i]);
	}
	catch(ArrayIndexOutOfBoundsException t)
	{
		System.out.println("handled");
	}
	
	/*finally//it executes compulsary
	{
		System.out.println("it executes compulsary");
	}*/
	
	}
	}
	}
}

