
public class HeightBalanced {
	public static int height(TreeNode N)
	{
		if(N==null)
			return 0;
		
		return 1+Math.max(height(N.left),height(N.right));
	}
	public static boolean checkBalance(TreeNode T)
	{
		
		if(T==null)
		{
			return true;
		}
		int l,r;//will store the height of the left and right subtrees;
		l=height(T.left);
		r=height(T.right);
		
		if(Math.abs(l-r)<=1 && checkBalance(T.left) && checkBalance(T.right))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplement b=new BinaryTreeImplement();
		;
		TreeNode T=b.Create();
		System.out.println("The tree is height balanced is:"+checkBalance(T));

	}

}
