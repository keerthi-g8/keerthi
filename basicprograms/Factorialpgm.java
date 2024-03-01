package basicprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorialpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
int fact = 1;
	        int n = scanner.nextInt();
	      for(int i=n;i>=1;i--)
	    	  
	        fact=fact*i;
				System.out.println("fact="+fact);	
	    
}
}
