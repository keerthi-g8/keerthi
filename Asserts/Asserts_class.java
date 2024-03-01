package Asserts;

import java.util.Scanner;

public class Asserts_class {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		System.out.println("enter input");
		int input=sc.nextInt();
		
		
assert input>10:"hey ur input is less than 10";
int a=100;
int b=200;
int sum=a+b;
System.out.println(sum);
	}

}
