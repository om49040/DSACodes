
public class QueueMaxApi {
	Queue Fqueue;Queue Squeue;
	int max;
	QueueMaxApi()
	{
		Fqueue=new Queue();
		Squeue=new Queue();
		max=Integer.MIN_VALUE;
	}
	void push(int n)
	{
		Squeue.push(n);
		Fqueue.push(n);
		Node1 temp=Squeue.Start;
		while(temp!=Squeue.End)
		{
			if(temp.data<Squeue.End.data)
			{
				temp=temp.next;
				Squeue.pop();continue;
			}
			temp=temp.next;
		}
	}
	void pop()
	{
		Node1 E=Fqueue.pop();
		if(Squeue.Start.data==E.data)
		{
			Squeue.pop();
		}
	}
	void show()
	{
		Fqueue.show();
	}
	int GetMax()
	{return Squeue.Start.data;}
}
