import java.util.Scanner;
public class StringRunLengthEcodDecod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String w=s.next();String nw="";
		//logic for encoding
		int i=0,cnt=1;
		while(i<w.length()-1)
		{
			while((i<w.length()-1)&&(w.charAt(i)==w.charAt(i+1)))
			{
				cnt++;i=i+1;
			}
			nw=nw+cnt+""+w.charAt(i);++i;
			cnt=1;
		}
		System.out.println(nw);
		//decoding nw
		i=0;cnt=0;w="";String tw="";
		while(i<nw.length())
		{
			while( Character.isDigit(nw.charAt(i)))
					{
						cnt=cnt*10+(nw.charAt(i)-'0');++i;
					}
			
			for(int j=0;j<cnt;++j)
			{
				tw=tw+nw.charAt(i);
			}
			w=w+tw;
			cnt=0;++i;tw="";
		}
		System.out.println(w);
	}

}
