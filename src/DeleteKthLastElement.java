
public class DeleteKthLastElement {
	public static LList DelKthLastElement(LList n,int k)
	{
		Node1 First=n.Start;
		while(k>=0)
		{
			First=First.next;--k;
		}
		Node1 sec=n.Start;
		while(First!=null)
		{
			sec=sec.next;
			First=First.next;
		}
		sec.next=sec.next.next;
		return n;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList  l=new LList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(5);
		l.addLast(7);
		l.addLast(10);
		l.show();
		l=DelKthLastElement(l,3);
		l.show();

	}

}
