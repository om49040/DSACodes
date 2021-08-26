
public class CheckListPallindromicity {
	public static boolean Pallindromicity(LList l)
	{
		Node1 fast= l.Start;
		Node1 slow=l.Start;
		while( fast!=null && fast.next!=null && fast.next.next!=null )
		{
			//System.out.println("loop");
			fast=fast.next.next;
			slow=slow.next;
			//System.out.println(fast.data+" "+slow.data);
		}
		if(l.size()%2==0)
		{
		l=ReverseSubList.RevSubList(l,(l.size()/2)+1,l.size());
		l.show();}
		if(l.size()%2!=0)
		{
		l=ReverseSubList.RevSubList(l,(l.size()/2)+2,l.size());
		l.show();}
		slow=slow.next;
		//System.out.println(fast.data+" "+slow.data);
		fast=l.Start;
		while(slow!=null)
		{
			if(slow.data!=fast.data)
			{
				return false;
			}
			slow=slow.next;
			fast=fast.next;
		}
		return true;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LList  l=new LList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(2);
		l.addLast(2);
		l.addLast(2);
		l.addLast(2);
		l.addLast(1);
		l.show();
		System.out.println(Pallindromicity(l));
	}
}
