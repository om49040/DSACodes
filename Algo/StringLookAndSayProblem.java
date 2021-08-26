/*
 * its a pattern that starts with 1.
 * subsequent digits of the patter will depend on the frequency of the consecutive digits
 * two counter will be taken n and cnt. no= the number cnt = frequency of the number
 * and then we will print both the no and cnt togethger
 * Wap that takes integer n as input and return the nth integer in the look and say sequence
 * return the result as a string.*/
import java.util.Scanner;
public class StringLookAndSayProblem {
	static int tot=0;
	public static void lkandsay(String prevString,int n)
	{
		int i=0,cnt=0;String ns="";
		while(i<prevString.length())
		{
			cnt = count(prevString,i,cnt);
			ns = cnt +""+prevString.charAt(i);
			i=i+cnt-1;
		}
		System.out.println(ns);
		if (n==tot)
			return ;
		lkandsay(ns,n);
	}
	public static int count(String prevString,int index,int cnt)
	{
		cnt++;index++;System.out.println("cnt="+cnt);
		if(prevString.length()-1<=(index))
		{
			System.out.println("exceeded");
			return cnt;
		}
		 if(prevString.charAt(index-1)==prevString.charAt(index))
			{cnt= count(prevString,(index),cnt+1);}
		System.out.println("natural");
			return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		tot=s.nextInt();
		System.out.println("1");
		String prevString="1";
		lkandsay(prevString,1);
	}

}
