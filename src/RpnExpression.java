import java.util.Stack;
public class RpnExpression {
	public static boolean checkrpn(Stack <Character>s)
	{
		System.out.println((int)')'+" "+(int)'(');
		Stack <Character>Nstack=new Stack<Character>();
		while(!s.isEmpty())
		{
			if((int)s.peek()==41)
			{
				Nstack.push(s.pop());
			System.out.println(s.peek()+" push "+Nstack.peek());
			}
			else if((int)s.peek()==40)
			{
				if(Nstack.isEmpty())
				{
					System.out.println("Executed");
					return false;
				}
				else 
				{
					System.out.println(s.peek()+" pop "+Nstack.peek());
					s.pop();
					Nstack.pop();
				}
				
			}
		}
		return Nstack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Character>s=new Stack<Character>();
		s.push('(');
		s.push('(');
		s.push('(');
		s.push(')');
		s.push(')');
		s.push(')');
		s.push('(');
		s.push(')');
		s.push(')');
		s.push(')');
		System.out.println(checkrpn(s));
	}

}
