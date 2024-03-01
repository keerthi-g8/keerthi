package finding_date;
import java.util.Date;

public class Date_presenttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1=new Date();
		
		System.out.println(d1.getTime());//currenttime in epoch
		
		    Date d2=new Date(d1.getTime());
		    System.out.println(d2);
		    
		    Date d3=new Date(d1.getTime()+(1000*60*60*24*6));
		    System.out.println(d3);
	}

}
