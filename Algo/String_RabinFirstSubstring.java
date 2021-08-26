import java.util.*;
public class String_RabinFirstSubstring {
	public static int HashVal(String s)
	{
		int sum=0,p=1;
		for(int i=0;i<s.length();++i)
		{
			sum=sum+(s.charAt(i)-64)*p;
			p=p*3;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String and the Substring");
		String word=s.next();
		word=word.toUpperCase();
		String sub=s.next();
		sub=sub.toUpperCase();
		int hval=HashVal(sub),flag=0,i=0,p=1;
		int nhval=HashVal(word.substring(i,i+sub.length()));
		for( i=1;i<word.length()-sub.length();++i)
		{
			//int nhval=HashVal(word.substring(i,i+sub.length()));
			if(nhval==hval)
			{
				flag = 1;break;
			}
			else
			{
				int x=nhval-(word.charAt(i)-64)/3;
				nhval=(int)(nhval+Math.pow(3, sub.length()-1)*(word.charAt(i+sub.length()-1)-64));
				p=p*3;
				if(p>9) {
					p=9;
				}
			}
		}
		if(flag==1)
		System.out.println("found at i="+i);
		else
			System.out.println("-1");

	}

}
