package encapsulation;

public class Exam_String {
	private String username = "keerthi";// most sensitive info

	public String get_username()// getter
	{
		return username;
	}

	public void set_username(String username)// setter
	{
		this.username = username;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam_String d = new Exam_String();

		d.set_username("jjklkll");
		System.out.println(d.get_username());
	}
}
