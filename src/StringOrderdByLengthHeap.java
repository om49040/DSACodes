import java.util.*;
public class StringOrderdByLengthHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> p = new PriorityQueue<>(10, new Comparator<String>() {

			@Override
			public int compare(String S1, String S2) {
				return S1.length() > S2.length() ? -1 : S1.length() < S2.length() ? 1 : 0;
			}
		});
		p.add("aaaaa");
		p.add("ab");
		p.add("abcdefd");
		p.add("aaaaaaaaaaaaaaaa");
		System.out.println(p.poll());
		System.out.println(p);


	}

}
