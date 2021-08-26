import java.util.*;
public class RandomSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the size of the array size ");
		int n= s.nextInt();
		int i;
		//generating random subset
		Random r=new Random();//will generate the random numbers
		System.out.println("Enter the size of the subset");
		int k=s.nextInt();
		Map <Integer,Integer>m=new HashMap<Integer,Integer>();
		ArrayList <Integer>subset=new ArrayList<Integer>();
		for(i=0;i<k;++i)
		{
			int rno=r.nextInt(n);
			if(!m.containsKey(rno))
			{m.put(i, rno);}
			m.put(rno,i);
		}
		for( i=0;i<k;++i)
		{
			subset.add(m.get(i));
		}
		System.out.println("Subset:"+subset);
		
		
	}

}
