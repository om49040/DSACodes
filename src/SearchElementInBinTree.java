
public class SearchElementInBinTree {
	static boolean Search(TreeNode t,int ele) {
	if(t==null)
	{
		return false;
	}
	if(t.key==ele)
		return true;
	return Search(t.left,ele)||Search(t.right,ele);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplement b=new BinaryTreeImplement();
		TreeNode t=b.Create();
		System.out.println(Search(t,5));

	}

}
