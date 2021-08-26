import java.util.*;
public class MergeKlistHeap {
	static ArrayList <ArrayList<Integer>>Sortedarr=new ArrayList();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		PriorityQueue <Integer>p=new PriorityQueue();
		Sortedarr.add(new ArrayList());
		Sortedarr.add(new ArrayList());
		Sortedarr.add(new ArrayList());
		Sortedarr.get(0).add(3);
		Sortedarr.get(0).add(5);
		Sortedarr.get(0).add(7);
		Sortedarr.get(1).add(0);
		Sortedarr.get(1).add(6);
		Sortedarr.get(2).add(0);
		Sortedarr.get(2).add(6);
		Sortedarr.get(2).add(28);




		//adding the first element of all the k arrays to pq
		int i=0;
		while(i<k)
		{
			p.add(Sortedarr.get(i).get(0));++i;
			//Sortedarr.get(i).remove(0);
		}
		ArrayList <Integer>arr=new ArrayList();
		while(!p.isEmpty())
		{
			int m=p.poll();
			arr.add(m);
			i=0;
			if(Sortedarr!=null)
			while(i<k)
			{
				if(Sortedarr.get(i).size()!=0)
				{
				if(m==Sortedarr.get(i).get(0))
				{
					
					Sortedarr.get(i).remove(0);
					if(Sortedarr.get(i).size()!=0)
					{p.add(Sortedarr.get(i).get(0));}
					break;
				}
				}
				++i;
			}
		}
		System.out.println(arr);
		

	}

}
