import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="silent";
String s2="listen";
if(s.length()!=s2.length())
{
	System.out.println("not anagram");
}
	
	else
	{
char s3[]=s.toCharArray();
System.out.println(Arrays.toString(s3));
Arrays.sort(s3);
char s4[]=s2.toCharArray();
System.out.println(Arrays.toString(s4));
Arrays.sort(s4);
if(Arrays.equals(s3,s4)==true)
{
	System.out.println("'anagram");
}else
	
System.out.println("'not anagram");
	}

		
}
}
