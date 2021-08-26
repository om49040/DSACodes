import java.util.*;
class Node{
	int data;
	Node next;
	Node insertAtBeg(Node start,int data)
	{
		if(start==null)
		{
			start = new Node();
			start.data=data;
			return start;
		}
		Node n=new Node();
		n.data=data;
		n.next=start;
		start=n;
		return start;
	}
	Node insertAtEnd(Node start,int data)
	{
		if(start==null)
		{
			start=new Node();
			start.data=data;
			return start;
		}
		Node n=new Node();
		n.next=null;
		n.data=data;
		//traversing to the end of the array
		Node Temp=start;
		while(Temp.next!=null)
		{
			Temp=Temp.next;
		}
		Temp.next=n;
		return start;
	}
	void display(Node Start)
	{
		Node temp=Start;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
		}
	}
}/*The above node class is to check all the values*/
public class CyclicityUsingTwoLoops {
	public static boolean Cyclicity(Node Start)
	{
		
		Node outer=Start;
		Node inner=Start;
		int flag=1;
		while(inner!=null && inner.next!=null )
		{
			outer=outer.next;
			inner=inner.next.next;
			if (inner == outer)
			{
				flag=0;
				break;
			}
		}
		return flag==1;
	}
	public static int CycleLength(Node StartingCycle)
	{
		Node Beg=StartingCycle;
		int cnt=1;
		Beg=Beg.next;
		while(Beg!=StartingCycle)
		{
			cnt++;
			Beg=Beg.next;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node Start=new Node();
		Start=Start.insertAtBeg(Start, 5);
		Start=Start.insertAtBeg(Start, 10);
		Start=Start.insertAtBeg(Start, 7);
		Start=Start.insertAtBeg(Start, 9);
		Start=Start.insertAtEnd(Start, 55);
		Start.next.next.next.next.next=Start;
		
		
		System.out.println(Cyclicity(Start));
		
		
	}
}
