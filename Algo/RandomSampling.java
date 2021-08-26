import java.util.*;
import java.math.*;
public class RandomSampling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		Random r= new Random();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size fo the array");
		int n=s.nextInt();int i;
		for(i=0;i<n;++i)
		{
			a.add(s.nextInt());
		}
		int p=0;
		for(i=0;i<a.size();++i)
		{
			p=r.nextInt(a.size()-i)+i;
			System.out.println(p);
			Collections.swap(a, i, p);
		}
		a.remove(a.size()-1);
		System.out.println(a);

	}

}
