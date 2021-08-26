import java.util.Scanner;
import java.util.Random;
public class StringMnemonics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number");
		String num = s.next();
		String[] code= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int i=0;
		String mnemon="";
		Random r = new Random();
		for(i=0;i<num.length();++i)
		{
			mnemon = mnemon + code[Integer.parseInt(num.charAt(i)+"")].charAt(r.nextInt(code[i].length()));
		}
		System.out.println(mnemon);

	}

}
