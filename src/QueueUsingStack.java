
public class QueueUsingStack {
	Stack Fstack,Sstack;
	QueueUsingStack()
	{
		Fstack=new Stack();
		Sstack=new Stack();
	}
	void push(int n)
	{
		Fstack.push(n);
	}
	void pop()
	{
		while(Fstack.top.next!=null)
		{
			Sstack.push(Fstack.pop());
		}
		Fstack.pop();
		while(Sstack.top!=null)
		{
			Fstack.push(Sstack.pop());
		}
	}
	void show()
	{
		while(Fstack.top!=null)
		{
			Sstack.push(Fstack.pop());
		}
		Sstack.show();
		while(Sstack.top!=null)
		{
			Fstack.push(Sstack.pop());
		}
	}
	

}
