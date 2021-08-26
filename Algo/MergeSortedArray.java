
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,8,10,11,12,12,12};
		int b[]= {1,3,5,7,9,11,12,13,14,15,16};
		int i,j,k;j=0;k=0;
		int c[]=new int[a.length+b.length-1];
		for(i=0;i<c.length;++i)
		{
			if(j==a.length)
			{
				c[i]=b[k];++k;
			}
			else if(k==b.length)
			{
				c[i]=a[j];++j;
			}
			else if(a[j]<=b[k])
			{
				c[i]=a[j];++j;
			}
			else if(a[j]>b[k])
			{
				c[i]=b[k];++k;
			}
		}
		for(i=0;i<c.length;++i)
		{
			System.out.print(c[i]+" ");
		}

	}

}
