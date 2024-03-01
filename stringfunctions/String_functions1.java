package stringfunctions;

public class String_functions1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1..length
		String name="keerthi";
		int a=name.length();//finding the length of string
System.out.println(a);
//2..finding the index
String name11="sravan";
char a1=name11.charAt(2);
System.out.println(a1);//to find position of char
System.out.println(name11.charAt(4));
//3..concatination
String name22="nihira";
System.out.println(name22.concat("veeramalla"));
System.out.println(name11.concat(" ").concat("keerthi"));//space
//4..TRIM THIS WILL REMOVE EXTRA SPACESAT THE BEGINING OF THE STRING AND END OF THE STRING
String name44="         I love my family                      ";
System.out.println(name44.trim());
//touppercase
String g="veer";
System.out.println(g.toUpperCase());

//to lowercase
String g1="VEER";
System.out.println(g1.toLowerCase());
//equals

System.out.println(g1.equals(g));
System.out.println(g1.equalsIgnoreCase(g));
//substring
String z="palindrome";
System.out.println(z.substring(2));
System.out.println(z.substring(2, 6));//(2,6-1)
//ends with
System.out.println(z.endsWith("e"));

//replace
String n="keerthi";
String op=n.replace('e', 'h');
System.out.println(op);
//replaceAll
String n1="keerthi";
String op1=n1.replaceAll("thi","h");
System.out.println(op1);
//turns lower to uppercase
String n11="keeRTHI";
String op11=n11.replaceAll("RTHI" ,"rthi");
System.out.println(op11);



	}

}
