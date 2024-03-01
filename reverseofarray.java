import java.util.Arrays;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age[]=new int[3];
age[0]=11;
age[1]=22;
age[2]=88;
int rev[]=new int[age.length];
int k=0;
for(int i=age.length;i>=0;i--)
{
	rev[k]=age[i];
	k++;
}
System.out.println(Arrays.toString(age));
System.out.println(Arrays.toString(rev));

	}

}

