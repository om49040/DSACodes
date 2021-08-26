import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class NextPermutaionArray {
	public static ArrayList<Integer> NextPermutation(ArrayList <Integer>arr)
	{
		int i,idx=0,flag=1;
		
		for(i=arr.size()-2;i>=0;--i)
		{
			if(arr.get(i)<arr.get(i+1))
			{
				idx=i;
				flag=0;
				break;
			}
		}
		System.out.println(idx);
			if(flag==1)//array is sorted and no next permutation
			{
				return null;
			}
			/*Our index i is the index where the non decreasing sequence finishes*/
			int swapIndex=arr.size()-1;
			for (i=idx+1;i<arr.size()-1;++i)
			{
				if(arr.get(idx)>arr.get(i))
				{
					swapIndex=i-1;
				}
			}
			System.out.println(swapIndex);
			Collections.swap(arr, idx, swapIndex);
			Collections.reverse(arr.subList(idx+1,arr.size()-1));
			System.out.println(arr);
			return arr;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int i;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (i=0;i<n;++i)
		{
			a.add(s.nextInt());
		}
		
		
			System.out.println("The next permutation is:"+NextPermutation(a));
		
			
	}
}
