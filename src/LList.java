import java.util.Scanner;
public class LList {

	Node1 Start,End;
	LList()
	{
		Start = End =  null; ;
		
	}
	void addLast(Node1 s)
	{
		s.next=null;
		if(Start==null)
		{
			Start=End=s;
			return;
		}
		End.next=s;
		End=s;
		System.out.println("Successfully added at end");
	}
	void addLast(int n)
	{
		
		Node1 s=new Node1();
		s.data=n;
		s.next=null;
		if(Start==null)//when empty
		{
			Start=End=s;
		}
		End.next=s;
		End=s;
		System.out.println("Successfully added at end");
	}
	void addFirst(Node1 s)
	{
		if (Start==null)//when empty
		{
			s.next=null;
			Start=End=s;return;
		}
		s.next=Start;
		Start=s;
		System.out.println("Successfully added at the beggining");
	}
	void addFirst(int n)
	{
		Node1 s=new Node1();
		s.data=n;
		if(Start==null)
		{
			Start=End=s;
		}
		s.next=Start;
		Start=s;
		System.out.println("Successfully added at the beggining");
	}
	void show()
	{
		Node1 temp=Start;
		while (temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	LList Merge(LList n1,LList n2)
	{
	 LList Head=new LList();
	 Node1 temp=n1.Start;
	 Node1 temp2=n2.Start;
	
	 if(temp.data < temp2.data)
	 {
		 Node1 n=temp;
		 temp=temp.next;
		 n.next=null;
		 Head.addLast(n);
		// System.out.println(1);
	 }
	 else 
	 {
		 Node1 n=temp2;
		 temp2=temp2.next;
		 n.next=null;
		 Head.addLast(n);
		 //System.out.println(2);
	 }
	 while(temp!=null || temp2!=null )
	 {
		 if( temp==null)
		 {
			 Node1 n=temp2;
			 temp2=temp2.next;
			 n.next=null;
			Head.addLast(n);
			//System.out.println(3);
		 }
		 else if( temp2==null)
		 {
			 Node1 n=temp;
			 temp=temp.next;
			 n.next=null;
			Head.addLast(n);
			//System.out.println(4);
		 }
		 else if(temp.data<temp2.data )
		 {
			 Node1 n=temp;
			 temp=temp.next;
			 n.next=null;
			Head.addLast(n);
			//System.out.println(5);
		 }
		 else if(temp2.data <= temp.data)
		 {
			 Node1 n=temp2;
			 temp2=temp2.next;
			 n.next=null;
			Head.addLast(n);
			//System.out.println(6);
	 	 }
		 //System.out.println (temp.data+" "+temp2.data);
		 Head.show();
	}
	return Head;
}
	void insertAtAnyPosition(int position , Node1 s)
	{
		if(size()==0)//when there is no element
		{
			addFirst(s);
			return;
		}
		if (position==1)
		{
			addFirst(s);
			return;
		}
		if(position>=size())
		{
			addLast(s);
			return;
		}
		Node1 temp=Start;
		int cnt=0;
		while(cnt<position-2)
		{
			temp=temp.next;
		}
		s.next=temp.next;
		temp.next=s;
		System.out.println("Added to "+position+" nnumber");
	}
	void insertAtAnyPosition(int position , int n)
	{
		Node1 s=new Node1();
		s.data=n;
		if(size()==0)
		{
			addFirst(s);
			return;
		}
		if (position==1)
		{
			addFirst(s);
			return;
		}
		if(position>=size())
		{
			addLast(s);
			return;
		}
		Node1 temp=Start;
		int cnt=0;
		while(cnt<position-2)
		{
			temp=temp.next;
		}
		s.next=temp.next;
		temp.next=s;
		System.out.println("Added to "+position+" nnumber");
	}
	void reverse()
	{
		if(Start==null)
		{
			System.out.println("The List is empty");
			return;
		}
		if(size()==1)
		{
			System.out.println("Reversed");
			return;
		}
		Node1 temp=Start;
		Node1 Cnode=temp.next;
		Node1 Fnode=Start;
		while(Cnode!=null)
		{
			temp.next=Cnode.next;
			Cnode.next=Fnode;
			Fnode=Cnode;
			Cnode=Cnode.next;
		}
		System.out.println("Reversed");
	}
	Node1 PopAtBeg()
	{
		if(Start==null)
		{
			System.out.println("Under Flow");
			return null;
		}
		//whem there is only last element
		if(Start==End)
		{
			End=null;
		}
		Node1 temp=Start;
		Start=Start.next;
		temp.next=null;
		return temp;
	}
	Node1 PopAtEnd()
	{
		if(Start==null)
		{
			System.out.println("Under Flow");
			return null;
		}
		Node1 e=End;
		if(Start==End)
		{
			
			Start=End=null;	return e;	
		}
		Node1 temp=Start;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		Node1 n=temp.next;
		temp.next=null;
		
		return e;
	}
	int size()
	{
		int sz=0;
		if(Start==null)
			return 0;
		Node1 temp=Start;
		while (temp!=null)
		{
			sz++;
			temp=temp.next;
		}
		return sz;
	}

}
