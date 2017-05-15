package offer;

import java.util.Stack;

/**
 * 题目:定义栈的数据结构,请在该类型中实现一个能够得到栈的最小元素的min 函数。
 * 在该栈中,调用min、push及pop时间复杂度都是O(1)
 * */
public class No21 {

	
	public static void main(String[] args)
	{
		Strack sk=new Strack();
		sk.push(3);
		sk.push(5);
		sk.push(2);
		sk.push(7);
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.min());
	}
	
	
	
	
	
	
}
class Strack 
{

	Integer num=null;
	Stack<Integer> datastack=new Stack<>();
	Stack<Integer> minstack=new Stack<>();
	
	public void push(int value)
	{
		if(num==null)
		{
			num=value;
			datastack.push(value);
			minstack.push(value);
		}else
		{
			 if(value<=num){
			num=value;
			minstack.push(value);
		}else
		{
			minstack.push(num);
		}
			 datastack.push(value);
			 }
		
	}
	public Integer pop()
	{
		minstack.pop();
		return datastack.pop();
	}
	
	public int min()
	{
		return minstack.pop();
	}
	
	
	
	
}