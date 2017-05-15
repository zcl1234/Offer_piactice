package offer;

import java.util.Stack;

/**
 * 题目描述:用两个栈实现一个队列,
 * 实现对了的两个函数 appendTail 和 deleteHead,分别完成在队列尾插入结点和在队列头部删除结点的功能。
 * */
public class No7 {

	public static void main(String[] args)
	{
		StackToQueue<String> st=new StackToQueue<>();
		st.appendTail("s");
		st.appendTail("o");
		st.appendTail("r");
		st.appendTail("r");
		while(!st.isEmpty())
			System.out.println(st.deleteHead());
	}
	
	
}
class StackToQueue<T>
{
	private Stack<T> stack1=new Stack<T>();
	private Stack<T> stack2=new Stack<T>();
	
	public void appendTail(T t)
	{
		stack1.push(t);
	}
	public T deleteHead()
	{
		if(!stack1.isEmpty())
			System.out.println("error,can`t delete empty");
		while(!stack1.isEmpty())
		{
		      stack2.push(stack1.pop());
		}
		T t=stack2.pop();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return t;
	}
	public boolean isEmpty()
	{
		return stack1.isEmpty();
	}
	
}