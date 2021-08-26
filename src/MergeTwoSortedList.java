
public class MergeTwoSortedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList n1=new LList();
		n1.addLast(5);
		n1.addLast(7);
		n1.addLast(11);
		LList n2=new LList();
		n2.addLast(6);
		n2.addLast(8);
		n2.addLast(12);
		n2.show();
		n1.show();
		LList ne=n1.Merge(n1, n2);
		ne.show();
		
	}
}

