import java.util.*;
public class SpiralArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the dimension of the array");
		int r,c,i,j;
		r=s.nextInt();
		c=s.nextInt();
		System.out.println("Enter the values in the 2d array");
		ArrayList <ArrayList<Integer>>ar=new ArrayList<ArrayList<Integer>>();
		for(i=0;i<r;++i)
		{
			ar.add(new ArrayList<Integer>());
			for(j=0;j<c;++j)
			{
				ar.get(i).add(s.nextInt());
			}
		}
		int minRow=0,maxRow=r-1,minCol=0,maxCol=c-1,cnt=0;
		while(cnt<r*c) {
		for(i=minCol;i<=maxRow;++i)
		{
			System.out.print(ar.get(i).get(minCol)+" ");cnt++;
		}
		minCol++;
		for(i=minCol;i<=maxCol;++i)
		{
			System.out.print(ar.get(maxRow).get(i)+" ");cnt++;
		}
		maxRow--;
		for(i=maxRow;i>=minRow;--i)
		{
			System.out.print(ar.get(i).get(maxCol)+" ");cnt++;
		}
		maxCol--;
		for(i=maxCol;i>=minCol;--i)
		{
			System.out.print(ar.get(minRow).get(i)+" ");cnt++;
		}
		minRow++;
		}
		

	}

}
