import java.util.*;
public class ConvertInttoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number");
		String num=s.next();
		int i=0;int dig=0,neg=0 ;
		if(num.charAt(0)=='-')
		{
			neg=1;++i;
		}
		for(;i<num.length();++i)
		{
			
			dig=dig*10+((int)num.charAt(i)-48);
		}
		if(neg==1)
			dig=dig*(-1);
		System.out.println(dig);
	}

}
