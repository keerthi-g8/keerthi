
package stringfunctions;
import java.util.Arrays;
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="world123";
		int noofdigits=0;
		int noofchar=0;
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
			noofdigits++;
		}
		

}
		System.out.println(noofdigits);
		System.out.println(noofchar);
		if(noofchar>0)
		{
			System.out.println("String is not made of just numeric");
		}
		
		
	}
}
