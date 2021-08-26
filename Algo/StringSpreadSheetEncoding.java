import java.util.*;
public class StringSpreadSheetEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		String word="";
		while(n!=0)
		{
			int r=n%26;
			word =(char)(64+r)+""+word;  
			n=n/26;
		}
		System.out.println(word);

	}

}
