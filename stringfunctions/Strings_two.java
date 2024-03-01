package stringfunctions;

public class Strings_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="keerthi";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		{
			System.out.println(output);
		}
		
	}

}
