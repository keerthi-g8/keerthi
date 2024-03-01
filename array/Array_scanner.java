package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rollno[]=new int[4];
		Scanner input=new Scanner(System.in);
		

	for(int i=0;i<=3;i++)
	{
		System.out.println("please enter value:");
		rollno[i]=input.nextInt();
	}
		System.out.println(Arrays.toString(rollno));
		
				;

	}

}
