package SecondEdition;

import java.util.Random;
import java.util.Stack;

/**
 * Created by zhangchenlin on 17/5/10.
 * 定义栈的数据结构，在类型中实现一个能够得到栈的最小元素的min函数，在该栈中，min push pop的时间复杂度都是O(1)
 */
public class No30 {
    public static void main(String[] args)
    {
        MyStack myStack=new MyStack();
        for(int i=10;i>0;i--)
        {
            int a=new Random().nextInt(10);
            //int a=i;
            System.out.print(a+" ");
            myStack.push(a);
        }
        System.out.println(myStack.pop());
        System.out.println("min:"+myStack.min());
    }

}

class MyStack
{
    Stack<Integer> stack_order=new Stack<>();
    Stack<Integer> stack_min=new Stack<>();

    int min;


    public void push(int a)
    {
        if(stack_order.size()==0)
        {
            min=a;
        }
        stack_order.push(a);
        if(a<=min)
        {
            stack_min.push(a);
            min=a;
        }else
            stack_min.push(min);
    }

    public int pop()
    {
        if(stack_order==null)
        {
            throw new RuntimeException("empty stack");
        }
     stack_min.pop();
     return stack_order.pop();
    }
    public int min()
    {
        if(stack_min==null)
        {
            throw new RuntimeException("empty stack");
        }

        return stack_min.pop();
    }

}