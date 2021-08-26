
public class CircularQueueWithArray {
 static int Cq[]=new int [10];
 static int st,en; 
CircularQueueWithArray()
{
	en=-1;st=-1;
}
public static void push(int n)
{
	if((st==0 && en==Cq.length-1) || (st-1)==en)
	{
		System.out.println(st+" "+en);
		System.out.println("Queue is full");
		return;
	}
	if(en==-1)
	{	st=0;}
	
	en++;
	en=((en==Cq.length)?0:en);
	Cq[en]=n;
	System.out.println("Added");
	
}
public static void pop( )
{
	if(en==-1)
	{
		System.out.println("Empty");
		return;
	}
	if(st==en)
		{st=-1;en=-1;return;}
	st++;
	if(st==Cq.length)
		st=0;
	System.out.println("Deleted");
}
public static void show()
{
	if(st==-1)
	{
		System.out.println("Empty");
		return ;
	}
	int s=st,e=en;
	while(s!=e)
	{
		System.out.print(Cq[s]+" ");
		s++;
		if(s==Cq.length)
		{
			s=0;
		}
	}
	System.out.println(Cq[s]+" ");
}
	public static int[] grow(int arr[])
	{
		int s=arr.length;
		int nsize=s*2;
		int []narr=new int[nsize];
		for(int i=0;i<s;++i)
		{
			narr[i]=arr[i];
		}
		return narr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		st=-1;en=-1;
		show();
		push(7);
		push(3);
		push(4);
		show();
		pop();
		show();
		
		

	}

}
