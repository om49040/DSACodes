import java.util.Scanner;
public class ReverseSubList {
	public static LList RevSubList(LList l,int b,int en)
	{
		if (en-b+1>l.size())
		{
			System.out.println("Wrong Range");
			return null;
		}
		//when there are and only 2 nodes
		Node1 St,En,trav,temp;
		//System.out.println(" zsdasd"+l.Start.data);
		int cnt=0;
		if(b==1)
		{
			St=l.Start;
			En=St;
			temp=trav=St.next;
			while(cnt<en-1)
			{
				//System.out.println(temp.data);
				trav=trav.next;
				temp.next=St;
				St=temp;
				temp=trav;
				cnt++;
				
			}
			En.next=trav;
			l.Start=St;
		}
		else
		{
			St=l.Start;
			En=St;
			Node1 be;
			while(cnt<b-2)
			{
				St=St.next;
				cnt++;
			}
			//System.out.println(St.data);
			be=St;
			St=St.next;
			En=St;
			be.next=null;
			temp=trav=St.next;
			while(cnt<en-2)
			{
				//System.out.println(1);
				//System.out.println(temp.data);
				trav=trav.next;
				temp.next=St;
				St=temp;
				temp=trav;
				cnt++;
			}
			En.next=trav;
			be.next=St;
		}
		return l;
		
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
		l=RevSubList(l,3,6);
		l.show();
	}

}
