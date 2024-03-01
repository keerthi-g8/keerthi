
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="dad";
String rev="";
{
	
for(int i=s.length()-1;i>=0;i--)
{
	

char c=s.charAt(i);
rev=rev+c;
	}
System.out.println(rev);
System.out.println(rev.equals(s));
}
	}
}
