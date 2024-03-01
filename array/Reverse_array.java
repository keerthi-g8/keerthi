package array;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age[]=new int [3];
age[0]=11;
age[1]=55;
age[2]=33;
int reverse[]=new int[age.length];
int k=0;
	for (int i=age.length-1;i>=0;i--)
	{
reverse[k]=age[i];
	k++;
	}
	System.out.println(Arrays.toString(age));
	System.out.println(Arrays.toString(reverse));
	}
}