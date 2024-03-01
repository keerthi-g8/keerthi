package stringfunctions;

import java.util.Arrays;

public class Anagram_string {
	public static void main(String[] args) {
String s1="listen";
String s2="silent";

if(s1.length()!=s2.length())
{
	System.out.println("they are not anagram");
}
	

else
{
	char s3[]=s1.toCharArray();
	
Arrays.sort(s3);
	char s4[]=s2.toCharArray();
	
	Arrays.sort(s4);
	
	System.out.println(Arrays.toString(s4));
	System.out.println(Arrays.toString(s3));
if(Arrays.equals(s3, s4)==true)
{
	System.out.println("anagram");
	
}
else
{
	System.out.println("not anagram");
}


		
}
	}
}


