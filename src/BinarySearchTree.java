
public class BinarySearchTree {
	TreeNode root;
	void insert(int data)
	{
		System.out.println("Simple BinarySearchTree");
		TreeNode temp=new TreeNode(data);
		temp.left=null;
		temp.right=null;
		if(root==null)
		{
			root=temp;
		}
		
	}
	

}
