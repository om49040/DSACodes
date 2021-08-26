import java.util.*;
public class BaseConversionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		Scanner s1= new Scanner(System.in);
		int i,res=0;
		System.out.println("Enter the number");
		String num= s.next();
		int base1=s1.nextInt();
		int base2=s1.nextInt();
		//converting the string to number in decimal
		for(i=0;i<num.length();++i)
		{
			if(num.charAt(i)>='A')
			{
				res = res*base1 + (num.charAt(i)-'A'+10)*base1;//appends the characters
			}
			else
			{
				res= res*base1 + (num.charAt(i)-48);
			}
		}
		System.out.println(res);
		//converting the decimal number to base2
		String cn="";
		while(res!=0)
		{
			int rem = res%base2;
			if(rem<10)
			cn= rem+cn;
			else
				cn = (char)((65 + rem-10))+cn;
			res = res/base2;
		}
		System.out.println(cn);

	}

}
