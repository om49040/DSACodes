
public class RemoveDuplicateFromSortedList {

	public static LList RemoveDupes(LList l) {
		Node1 n=l.Start;
		while(n.next!=null)
		{
			if(n.data==n.next.data)
			{
				n.next=n.next.next;continue;
			}
			n=n.next;
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList  l=new LList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(2);
		l.addLast(2);
		l.addLast(3);
		l.addLast(3);
		l.addLast(3);
		l.addLast(3);
		l.addLast(3);
		l.addLast(5);
		l.addLast(7);
		l.addLast(10);
		l.show();
		l=RemoveDupes(l);
		l.show();

	}

}
