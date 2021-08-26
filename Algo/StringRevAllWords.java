import java.util.Scanner;
public class StringRevAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string ");
		StringBuilder line =new StringBuilder( s.nextLine().trim());
		line.append(" ");
		int i=0;
		while(line.indexOf(" ",i )!=-1)
		{
			
			line.replace(i,line.indexOf(" ",i),new StringBuilder(line.substring(i, line.indexOf(" ",i))).reverse().toString());
			i=line.indexOf(" ",i )+1;
		}
		System.out.println(line);
				

	}

}
