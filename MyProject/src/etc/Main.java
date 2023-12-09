import java.util.*;
import java.io.*;

public class Main
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer>stack = new Stack<>();	

		int n = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=n ; i++)
		{
			String s = br.readLine();

			if(s.contains("push"))
			{
				String [] p = s.split(" ");
				stack.push(Integer.parseInt(p[1]));
			}
			else if(s.equals("pop"))
			{
				if (stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
			}
			else if(s.equals("size"))
			{
				if(stack.size()==0)
					System.out.println(0);
				else
					System.out.println(stack.size());
			}
			else if(s.equals("empty"))
			{
				if(stack.empty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(s.equals("top"))
			{
				if(stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}

		}	
	}
}
