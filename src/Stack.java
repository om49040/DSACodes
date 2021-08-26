
public class Stack {
Node1 top;
Stack()
{
	top=null;
}
void push(Node1 n)
{
	if(top==null)
	{
		n.next=null;
		top=n;
		return ;
	}
	n.next=top;
	top=n;
	System.out.println("Node Pushed");
}
void push(int d)
{
	Node1 n=new Node1();
	n.data=d;
	n.next=null;
	if(top==null)
	{
		n.next=null;
		top=n;
		return ;
	}
	n.next=top;
	top=n;
	System.out.println("Node Pushed");
}
Node1 pop()
{
	if(top==null)
	{
		System.out.println("Under Flow");
		return null;
	}
	Node1 temp=top;
	top=top.next;
	temp.next=null;
	return temp;
}
void show()
{
	if(top==null)
	{
		System.out.println("The stack is empty");
	}
	Node1 temp=top;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}

}