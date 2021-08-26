
public class StackMaxCountApi {
	Stack s,dummy;
	int max,cnt;
	StackMaxCountApi()
	{
		max=Integer.MIN_VALUE;
		cnt=0;
		s=new Stack();
		dummy=new Stack();
	}
	void push(int n)
	{
		if (max<n)
		{
			max=n;
		}
		s.push(n);
		dummy.push(max);
	}
	void pop()
	{
		s.pop();
		dummy.pop();
		if(dummy.top!=null)
		{
		if(dummy.top.data!=max)
		{
			max=dummy.top.data;
		}}
	}
	int getmax()
	{
		return max;
	}
	void show()
	{
		s.show();
	}
	
	
	}

