/*To check if paranthesis is balanced or not using stack data structure. This is done by Shivendra Raj Singh*/
package interviewQuestions;
import java.io.*;
import java.util.*;

public class BalancedParanthesis {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			x = br.readLine();
			if(isBalanced(x))
				System.out.println("Paranthesis balanced.");
			else
				System.out.println("Paranthesis not balanced.");
		}
	}
	static boolean isBalanced(String x)
	{
		Stack<Character> st = new Stack<>();
		int i;
		int l = x.length();
		for(i = 0; i < l; i ++)
		{
			char ch = x.charAt(i);
			if(ch == '[' || ch == '{' || ch == '(')
				st.push(ch);
			else
			{
				if(st.empty())
					return false;
				else if((ch == ']' && st.peek() == '[') || (ch == '}' && st.peek() == '{') ||(ch == ')' && st.peek() == '('))
				{
					st.pop();
					continue;
				}
				else
					return false;					
			}
		}
		return st.empty();
	}
}
