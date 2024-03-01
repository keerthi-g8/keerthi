package array;

import java.util.Arrays;

public class CharArra_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="50percent";
	char a1[]=name.toCharArray();//5,0,p,e,r,c,e,n,t
	System.out.println(Arrays.toString(a1));//[5,0,p,ercent]
     int a=name.length();
       System.out.println(a);//9
	char c=name.charAt(5);
	System.out.println(c);//position
	
	
	
}
}


