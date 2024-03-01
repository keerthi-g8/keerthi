package array;

import java.util.Arrays;

public class Copying_arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int array1[]=new int[3];

array1[0]=1;
array1[1]=2;
array1[2]=33;
int array2[]=new int[3];

array2[0]=1;
array2[1]=2;
array2[2]=44;


if(Arrays.toString(array1).equals(Arrays.toString(array2)))
{
	System.out.println("equal");
}
else
{
	System.out.println("noteaqual");
}
	}

}
