package stringfunctions;

public class Palindrome_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String input="mom";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);//m,o,m
			
			reverse=reverse+c;
		}
		System.out.println(reverse);
		System.out.println(input.equals(reverse));
		
	}
}

		
	


