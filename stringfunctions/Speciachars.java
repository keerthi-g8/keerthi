package stringfunctions;

import java.util.Arrays;

public class Speciachars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="auto batch 38@";
		int noofdigits=0;
		int noofalpha=0;
		int noofspace=0;
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
		boolean alpha    =Character.isAlphabetic(c1[i]);
		boolean digi   =Character.isDigit(c1[i]);
		boolean space    =Character.isWhitespace(c1[i]);
		
		if(alpha==true)
		{
			noofalpha++;
		}

			
			
				
				if(digi==true)
				{
					noofdigits++;
				}
				
					
					
					if(space==true)
					{
						noofspace++;
					}
				
			
	
		
	}
System.out.println("my given input string alpha "+input+"has"+noofalpha);
System.out.println("my given input string digits space"+input+"has"+noofdigits);
System.out.println("my given input string"+input+"has"+noofspace);
if(input.length()==(noofdigits+noofalpha+noofspace))
{
	System.out.println("no special character");
}
	else
	System.out.println("yes");
}
			
		
		}
	


			

