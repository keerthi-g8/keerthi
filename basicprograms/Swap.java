package basicprograms;

import java.util.Arrays;

// TODO Auto-generated method stub
/*int a=6,b=8;


//for(int i=0;i<=8;i++)
{
System.out.println("Values in a:" +b);

System.out.println("Values in b:" +a);

	}

	}
}*/
		//swap of twostrings
		
	/*	String s1="java";
	String s2="oops";
	String temp;

	temp=s1;
	  s1=s2;
	  s2=temp;
	  System.out.println("Values in s1:" +s1);
	  System.out.println("Values in s2:" +s2);
	}
}*/
//swap two arrays
public class Swap {

	public static void main(String[] args)
	{
String s1[]= {"oops"};
String s2[]= {"java"};
String temp;

for(int i=0;i<=2;i++)
{
	temp=s1[i];
	  s1[i]=s2[i];
	  s2[i]=temp;
	  System.out.println(Arrays.toString(s1));
	  System.out.println(Arrays.toString(s2));
}

	}
}



	
	





