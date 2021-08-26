
public class dotQuestionMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder word =new StringBuilder( ".?!");
		int len=3;
		for(int i = 0;i<word.length();++i)
		{
			switch(word.charAt(i))
			{
			case '.':word.replace(i,i+1,"DOT");len = len + "DOT".length();
			break;
			case '?':word.replace(i,i+1, "QUESTION MARK");len = len +"QUESTION MARK".length();
			break;
			case '!':word.replace(i,i+1, "EXCLAMATION MARK");len =len +"EXCLAMATION MARK".length();
			break;
			default:
			}
			
		}
		System.out.println(word);

	}

}
