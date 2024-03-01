package array;

import java.util.Arrays;

public class Assignment_same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int array1[]= new int[4];



array1[0]=1;
array1[1]=2;
array1[2]=4;
array1[3]=5;
int array2[]=new int[4];

for(int i=0;i<array1.length;i++)
{

	array2[i]=array1[i];
System.out.println(Arrays.toString(array2));

}
}
}

