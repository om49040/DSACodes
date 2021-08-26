import java.util.*;
public class ArrayListTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList> Muldim = new ArrayList<ArrayList>();
		Muldim.add(new ArrayList<Integer>());
		Muldim.add(new ArrayList<Integer>());
		Muldim.add(new ArrayList<Integer>());
		int i,j;
		for (i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				Muldim.get(i).add(j,s.nextInt());
			}
		}
		
		for (i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				System.out.print(Muldim.get(i).get(j)+" ");
			}
		}
	}

}
