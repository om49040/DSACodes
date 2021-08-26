
public class BinarySearchTree {
	TreeNode root;
	void insert(int data)
	{
		TreeNode temp=new TreeNode(data);
		temp.left=null;
		temp.right=null;
		if(root==null)
		{
			root=temp;
		}
		
	}
	

}
