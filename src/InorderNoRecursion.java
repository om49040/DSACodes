import java.util.Stack;
public class InorderNoRecursion {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeImplement b=new BinaryTreeImplement();
		TreeNode rt=b.Create();
		if (rt == null)
            return;
 
 
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = rt;
 
        
        while (curr != null || s.size() > 0)
        {
            while (curr !=  null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
 
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
 

	}

}
