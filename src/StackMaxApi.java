
public class StackMaxApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stmapi st=new Stmapi();
		st.push(1);
		st.push(2);
		st.push(4);
		st.push(10);
		st.push(5);st.push(6);
		st.show();
		System.out.println(st.getmax());
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.getmax());
	}
}

	


/*The space complexity of the program O(n)
 * The time complexity to get the max element in the stack is O(1)*/