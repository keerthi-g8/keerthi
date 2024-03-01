package array;

import java.util.Arrays;

public class Findingcharsint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="50percent";
int noofchar=0;
int noofint=0;
char a1[]=name.toCharArray();
System.out.println(Arrays.toString(a1));
for(int i=0;i<a1.length;i++)
{
boolean answer    =Character.isAlphabetic(a1[i]);
if(answer==true)
{
	noofchar++;
	
	}
else
{
	noofint++;
}
}
System.out.println(noofchar);
System.out.println(noofint);
	}}

