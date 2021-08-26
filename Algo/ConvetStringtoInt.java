import java.util.Scanner;

public class ConvetStringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int i=0,neg=0 ;
		String dig="";
		if(num<0)
		{
			neg=1;
		}
		int t=Math.abs(num);
		while(t!=0)
		{
			dig=(t%10)+dig;t=t/10;
		}
		if(neg==1)
		{
			dig="-"+dig;
		}
		System.out.println(dig);
	}

}
