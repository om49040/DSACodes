import java.util.Scanner;
public class StringSinosuidal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String w=s.next();
		StringBuilder nw=new StringBuilder("");
		for(int i=1;i<w.length();i+=4)
		{
			nw.append(w.charAt(i));System.out.print("\t"+w.charAt(i));
		}
		System.out.println();
		for(int i=0;i<w.length();i+=2)
		{
			nw.append(w.charAt(i));System.out.print(w.charAt(i)+"\t");
		}
		System.out.println();
		for(int i=3;i<w.length();i+=4)
		{
			nw.append(w.charAt(i));System.out.print("\t"+w.charAt(i));
		}
		System.out.println();
		System.out.println("The sinosuidal String="+nw);
	}

}
