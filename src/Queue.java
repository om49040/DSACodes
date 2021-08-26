
public class Queue {
	Node1 Start,End;
	Queue()
	{
		Start=End=null;
	}
	void push(Node1 n)
	{
		n.next=null;
		if(Start==null)
		{		
			Start=n;
			End=n;
			return;
		}
		End.next=n;
		End=n;
		System.out.println("Added");
	}
	void push(int a)
	{
		Node1 n=new Node1();
		n.data=a;
		n.next=null;
		if(Start==null)
		{		
			Start=n;
			End=n;
			return;
		}
		End.next=n;
		End=n;
		System.out.println("Added");
	}
	Node1 pop()
	{
		if(Start==null)
		{
			System.out.println("UnderFlow");
			return null;
		}
		if(Start==End)
		{
			End=End.next;
		}
		Node1 temp=Start;
		Start=Start.next;
		temp.next=null;
		System.out.println("Deleted");
		return temp;
	}
	void show()
	{
		Node1 temp=Start;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}


}
