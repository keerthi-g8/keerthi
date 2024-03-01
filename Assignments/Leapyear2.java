package Assignments;

public class Leapyear2 {
	

	public static void main(String[] args) {
		
int i=380;
if(i>=1&&i<=31){System.out.println("Jan");}
if(i>=31&&i<=60){System.out.println("Feb");}
if(i>=61&&i<=90){System.out.println("March");}
if(i>=91&&i<=120){System.out.println("April");}
if(i>=121&&i<=150){System.out.println("May");}
if(i>=151&&i<=180){System.out.println("June");}
if(i>=181&&i<=210){System.out.println("July");}
if(i>=211&&i<=240){System.out.println("Aug");}
if(i>=241&&i<=270){System.out.println("Sept");}
if(i>=271&&i<=300){System.out.println("Oct");}
if(i>=301&&i<=330){System.out.println("Nov");}
if(i>=331&&i<=366){System.out.println("Dec");}
if(i<=0||i>366){System.out.println("Out of Range");}

}
}
