import java.util.*;
public class ReplaceAndRemove {
	public static void main(String args[])
	{
		Scanner s= new Scanner (System.in);
		System.out.println("The size of the array");
		int size=s.nextInt();//replace a with 2ds delete b
		char arr[]=new char[size];
		for(int i=0;i<size;++i)
		{
			arr[i]=s.next().charAt(0);
		}
		//counting the length of the array
		int cnt=size;
		for(int i =0;i<size;++i)
		{
			if(arr[i]=='A')
			{
				cnt+=1;
			}
			else if(arr[i]=='B')
			{
				cnt=cnt-1;
			}
		}
		char []arr1=new char[cnt];
		for(int i=0,j=1;i<size;++i)
		{
			if(arr[i]=='A')
			{
				arr1[j-1]='D';
				arr1[j]='D';
				j=j+2;
			}
			else if(arr[i]=='B')
			{
				continue;
			}
			else 
			{
				arr1[j-1]=arr[i];++j;
			}
		}
		System.out.println();
		for(int i=0;i<cnt;++i)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	

}
