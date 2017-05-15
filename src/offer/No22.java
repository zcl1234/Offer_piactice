package offer;

import java.util.Stack;

/**
 * 题目:输入两个整数序列,第一个序列表示栈的压入顺序,请判断第二个序列是 否为该栈的弹出序列。
 * 假设压入栈的所有数字均不相等。
 * 例如压栈序列为 1、2、 3、4、5.序列 4、5、3、2、1 是压栈序列对应的一个弹出序列,
 * 但 4、3、5、1、 2 却不是
 * */
public class No22{
	
	public static boolean isPop(int[] input,int[] output)
	{
		//辅助堆栈
		Stack<Integer> stack=new Stack<Integer>();
		if(input.length!=output.length||input==null||output==null)
		{
			return false;
		}
		int len=input.length;
		int i=0,j=0;
		while(i<len&&j<len)
		{
			stack.push(input[i]);
			while(stack.peek()==output[j])
			{
				stack.pop();
				j++;
				if(j==len)
				{
					break;
				}
			}
			i++;
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] input={1,2,3,4,5};
		int[] output={4,5,3,2,1};
		
		System.out.println(isPop(input,output));
		
	}
	
}
