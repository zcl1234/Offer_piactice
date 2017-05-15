package SecondEdition;

import java.util.Arrays;

/**
 * 判断一个数组序列是否是二叉树的后序遍历序列
 * Created by zhangchenlin on 17/5/15.
 */
public class No33 {

    public static boolean isSequenceOfBST(int[] root)
    {
        if(root==null||root.length<1)
            return true;
        int length=root.length;

        int i=0;
        for(;i<length-1;i++)
        {
            if(root[i]>root[length-1])
                break;
        }


        int j=i;
        for(;j<length-1;j++)
        {
            if(root[j]<root[length-1])
                return false;
        }

        boolean left=true;
        if(i>0)
        {
            left=isSequenceOfBST(Arrays.copyOfRange(root,0,i));
        }
        boolean right=true;
        if(j<length-1)
            right=isSequenceOfBST(Arrays.copyOfRange(root,i,j));
        return  left&right;
    }

    public static  void main(String[] args)
    {
        int[] a={1,2,3,4};
        System.out.println(isSequenceOfBST(a));
        Integer b=1;
        System.out.println(b.getClass().getName());
        System.out.println(Integer.TYPE);
    }




}
