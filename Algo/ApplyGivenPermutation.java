import java.util.*;
public class ApplyGivenPermutation {
	public static ArrayList<Character> GenratePerm(ArrayList <Integer>arr,ArrayList <Character>Perm)
	{
		ArrayList <Character>ch=new ArrayList<Character>();
		for(int i=0;i<arr.size();++i)
		{
			if(i<=arr.get(i))
			{
				ch.add(Perm.get(i));
			}
			else if(i>arr.get(i))
			{
				ch.add(arr.get(i),Perm.get(i));
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the permutation");
		int n=s.nextInt();
		int i=0;
		ArrayList <Character>Perm=new ArrayList<Character>();
		for(i=0;i<n;++i)
		{
			Perm.add((char)('A'+i));
		}
		ArrayList <Integer>arr=new ArrayList<Integer>();
		for(i=0;i<Perm.size();++i)
		{
			System.out.println("Enter the event number");
			arr.add(s.nextInt());
		}
		System.out.println("Permutation:="+GenratePerm(arr,Perm));
	}

}
