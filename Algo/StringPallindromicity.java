import java.util.Scanner;
public class StringPallindromicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		System.out.println("Enter a String");
		String line = s.nextLine();
		line.trim();
		line=line.toUpperCase();
		int flag=1,i=0,j=line.length()-1;
		while(i<=j && flag==1)
		{
			if(Character.isDigit(line.charAt(i))||Character.isLetter(line.charAt(i)))
			{
				if(Character.isDigit(line.charAt(j))||Character.isLetter(line.charAt(j)))
				{
					if(line.charAt(i)!=line.charAt(j))
					{
						flag=0;break;
					}
					else
					{
						--j;++i;
					}
				}
				else
				{
					--j; continue;
				}
			}
			else 
			{
				++i; continue;
			}
		}
		System.out.println(flag==1);
	}
}
