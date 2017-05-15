package SecondEdition;

import java.util.Stack;
import java.util.StringJoiner;

/**
 * Created by zhangchenlin on 17/5/10.
 * 栈的压入，弹出序列
 */
public class No31 {

    public static boolean StackPush_Pop(int[] push,int[] pop)
    {
        if(push==null||pop==null)
            return false;
        if(push.length!=pop.length)
            return false;
        if(push.length==0&&pop.length==0)
            return true;
        int length=push.length;
        Stack<Integer> stack=new Stack<>();
        int i=0,j=0;
        while(i<length&&j<length)
        {
            stack.push(push[i]);
            while(stack.peek()==pop[j])
            {
                stack.pop();
                j++;
                if(j==length)
                    break;
            }

            i++;
        }
        if(stack.isEmpty())
            return true;
        return false;

    }

    public static void main(String[] args)
    {
        int[] push={1};
        int[] pop={1};
        System.out.println(StackPush_Pop(push,pop));
    }


}
