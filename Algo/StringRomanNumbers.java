/*Convert Roman to Decimal.
 * We need to check certain restrictions.
 * A roman-number represents a posiive inteers that uses symbols I,X,L,C,M
 * I=1,C=100,L=50,V=5,M=1000,X=10
 * A valid roman numeral is always in an non-decreasing order. Exceptions LIX,IV.ETC
 * There are certain restrictions while writing an roman-numeral
 * I can immediately precede V and x
 * X can precede L and C
 * C can precede D and M*/
import java.util.*;
public class StringRomanNumbers {
static Map<Character,Integer> h = new HashMap<Character,Integer>();
	public static boolean checkValid(String s)
	{
		int i;
		for( i=1;i<s.length();++i)
		{
			if(h.get(s.charAt(i-1))>=h.get(s.charAt(i)))
			{
				
			}
			else {
				if(h.get(s.charAt(i))=='I' &&(h.get(s.charAt(i-1))=='V' || h.get(s.charAt(i-1))=='X'))
				{
					continue;
				}
				else if(h.get(s.charAt(i))=='X' &&(h.get(s.charAt(i-1))=='L' || h.get(s.charAt(i-1))=='C'))
				{
					continue;
				}
				else if(h.get(s.charAt(i))=='C' &&(h.get(s.charAt(i-1))=='D' || h.get(s.charAt(i-1))=='M'))
				{
					continue;
				}
				else return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h.put('V', 5);
		h.put('I', 1);
		h.put('X', 10);
		h.put('L', 50);
		h.put('C', 100);
		h.put('D', 500);
		h.put('M', 1000);
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a valid Roman Number");
		String Rnum=s.next();
		System.out.println(checkValid(Rnum));
		int res=h.get(Rnum.charAt(Rnum.length()-1));
		for(int i = Rnum.length()-2;i>=0;--i)
		{
			char c=Rnum.charAt(i);
			if(h.get(c)<res)
			res-=h.get(c);
			else if(h.get(c)>=res)
			{
				res+=h.get(c);
			}
		}
		System.out.println("num="+res);

	}

}
