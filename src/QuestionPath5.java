
public class QuestionPath5 {
	static int treePathsSumUtil(TreeNode node, int val) 
    {
        if (node == null)
            return 0;
   
        
        val = (val * 10 + node.key);
   
        
        if (node.left == null && node.right == null)
            return val;
   
        return treePathsSumUtil(node.left, val)
                + treePathsSumUtil(node.right, val);
    }
    static int treePathsSum(TreeNode node) 
    {
        return treePathsSumUtil(node, 0);
    }
    static boolean PathSum(TreeNode node, int sum)
    {
      boolean a = false;
      int SSum = sum - node.key;
      if(SSum == 0 && node.left == null && node.right == null)
        return(a = true);
      if(node.left != null)
        a = a || PathSum(node.left, SSum);
      if(node.right != null)
        a = a || PathSum(node.right, SSum);
      return(a);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplement b=new BinaryTreeImplement();
		TreeNode rt=b.Create();
		System.out.println(" Pathsum="+PathSum(rt,3));
		

	}

}
