
public class SymmetricBinaryTree {
	static TreeNode rt;
	public static boolean Mirrorfy(TreeNode T1,TreeNode T2)
	{
		if(T1==null && T2==null)
		{
			return true;
		}
		if (T1!=null && T2!=null && T1.key==T2.key)
		{
			return Mirrorfy(T1.left,T2.right) && Mirrorfy(T1.right,T2.right);
		}
		return false;
	}
	static boolean CheckSymmetry()
	{
		return Mirrorfy(rt,rt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplement b=new BinaryTreeImplement();
		rt=b.Create();
		System.out.println(CheckSymmetry());

	}

}
