import java.util.*;
public class StringSpreadSheetFindColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the word");
		String word = s.next();
		int colval=0,p=1;
		for (int i =word.length()-1;i>=0;--i)
		{
			colval=colval+(word.charAt(i)-64)*p;
			p=p*26;
		}
		System.out.println(colval);

	}

}
