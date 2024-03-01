package scanner;

import java.util.Scanner;

public class Area {


	public static void main(String[] args) 
	{
	
		double pi =3.14;
	
		Scanner s1  =new Scanner(System.in);

		System.out.println("enter the radius");
		int radius =s1.nextInt();
		double area =pi*radius*radius;
		System.out.println(area);
				
	}
}

