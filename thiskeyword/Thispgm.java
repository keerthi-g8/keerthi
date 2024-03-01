package thiskeyword;

public class Thispgm {
	
	int age;
	String name;
	double salary;
	void add(int age ,String name,double salary)
	{
		this.age=10;
this.name="keerthi";
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Thispgm P=new Thispgm();
		P.add(10,"keerthi",100.9);
		System.out.println(P.age);
		System.out.println(P.name);
	}

		
}


