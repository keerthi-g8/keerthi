package array;

public class Array_checkingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[4];
arr[0]=44;
arr[1]=34;
arr[2]=33;
arr[3]=85;
int input=85;

for(int i=0;i<=arr.length-1;i++)

{
if(input==arr[i])
{
	System.out.println("present");
System.out.println("Index of number=" +i);

	}

}
	}
}
