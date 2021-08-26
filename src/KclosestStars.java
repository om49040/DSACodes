import java.util.*;
class Coordinates
{
	int x,y,z;
	Coordinates(int xx,int yy, int zz)
	{
		x=xx;
		y=yy;
		z=zz;
	}
	int distance(Coordinates c1, Coordinates c2)
	{
		return (c1.x-c2.x)*(c1.x-c2.x) + (c1.y-c2.y)*(c1.y-c2.y) +(c1.z-c2.z)*(c1.z-c2.z);
	}
	
}
public class KclosestStars {
	static Coordinates Earth=new Coordinates(0,0,0);
	public static ArrayList<Coordinates> KclosestStars(ArrayList<Coordinates> arr)
	{
		PriorityQueue<Coordinates> p = new PriorityQueue<>(10, new Comparator<Coordinates>() {

			@Override
			public int compare(Coordinates S1, Coordinates S2) {
				return S1.distance(S1, Earth) < S2.distance(S2, Earth) ? -1 : S1.distance(S1, Earth) > S2.distance(S2, Earth) ? 1 : 0;
			}
		});
		int i=0;
		while(i<arr.size())
		{
			p.add(arr.get(i));++i;
		}
		ArrayList <Coordinates>ar=new ArrayList();
		ar.add(p.poll());
		ar.add(p.poll());
		ar.add(p.poll());
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Coordinates>arr=new ArrayList();
		arr.add(new Coordinates(1,4,6));
		arr.add(new Coordinates(0,2,3));
		arr.add(new Coordinates(11,22,33));
		arr.add(new Coordinates(10,24,36));
		arr.add(new Coordinates(9,4,2));
		arr.add(new Coordinates(100,14,15));
		arr.add(new Coordinates(23,42,60));
		
		System.out.println(KclosestStars(arr));
		

	}

}
