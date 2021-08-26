import java.util.Scanner;
public class BinaryTreeImplement {
	static TreeNode root;
	
	BinaryTreeImplement()
	{
		root=null;;
	}
	 static TreeNode Create()
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the key");
		 int n=s.nextInt();
		 TreeNode temp=root; 
		if(n==-1)
			return null;	
		temp=new TreeNode(n);
		System.out.println("Enter the value to be inserted as the left child");
		temp.left=Create();
		System.out.println("Enter the value to be inserted as the right child");
		temp.right=Create();	
		return temp;		
	}
	static void inorder(TreeNode root)
	{
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
					
	}
	  static void postorder(TreeNode root)
	{
		if(root==null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.key);
	}
	  static void preorder(TreeNode root)
	{
		if(root==null)
		{return;}
		System.out.println(root.key);
		preorder(root.left);
		preorder(root.right);
				
	}
	  
	  public static boolean isBST(TreeNode root, int min, int max) {
		  
	        /* base case: we reached null*/
	        if(root == null) 
	            return true;
	 
	        return (root.key > min &&
	        root.key > max &&
	        isBST(root.left, min, root.key) &&
	        isBST(root.right, root.key, max));
	    }
	  static int postorder(TreeNode root,int key)
		{
			if(root==null)
				return -1;
			if(root.key>=key)
				return root.key;
			else {
			postorder(root.left,key);
			postorder(root.right,key);
			return -1;}
		}
	public static void main(String args[])
	
	{
		root=Create();
		System.out.println("Root"+root.key);
		System.out.println(postorder(root,4));
		
	}
	

}
