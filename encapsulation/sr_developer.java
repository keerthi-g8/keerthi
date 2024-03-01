package encapsulation;

public class  sr_developer {
	private int age=18;//most sensitive info
	public int get_age()//getter
	{
		return age;
	}
	public void set_age(int age)//setter
	{
		this.age=age;
	}
	public class jr_developer
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sr_developer s1=new sr_developer();
		s1.set_age(44);
		System.out.println(s1.get_age());
	}
	}


