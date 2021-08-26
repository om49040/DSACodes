/*Compute all the valid ip addresses.
 * We have to put dots(.) in between the numbers
 * s="19216811" now we have to generate a valid string ip addresses
 * 1., 19. 192. all are valid start. */
import java.util.Scanner;
public class StringValidIpAddress {
	public static void ComputeAllIpAddr(String ip)
	{
		for (int i = 1; i < 4 && i < ip.length(); ++i)
		{
			String first = ip.substring (0 , i) ;
			if (valid (first)) 
			{
				for (int j = 1; i + j < ip.length() && j <4; ++ j ) 
				{
					String second = ip. substring ( i , i + j);
					if ( valid( second) )
					{
						for (int k = 1; i + j + k< ip.length() && k < 4 ; ++k)
						{
							String third = ip. substring ( i + j, i + j + k) ;
							String fourth = ip. substring ( i + j + k) ;
							if ( valid(third) && valid( fourth) )
							{
								System.out.println(first +"." + second + "."+ third +"." + fourth);
							}
						}
					}
				}
			}
		}
	}	
	
	public static boolean valid(String s)
	{
		if(s.charAt(0)=='0')
		{
			return false;
		}
		if(s.length()>3)
			return false;
		if(Integer.parseInt(s)>255)
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string of numbers");
		ComputeAllIpAddr(s.next());

	}

}
