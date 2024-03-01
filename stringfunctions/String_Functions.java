package stringfunctions;

public class String_Functions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="keerthi";
boolean ans= name.matches("k......");//STARTS WITH K
System.out.println(ans);
boolean c=name.matches("...r(.*)");
System.out.println(c);
boolean c1=name.matches("(.*)r(.*)");//multiple starts and ends(.*)
System.out.println(c1);
boolean ans1= name.matches("......i");//endsWITH K
System.out.println(ans1);
boolean ans11= name.contains("z");//contains
System.out.println(ans11);
	}

}
