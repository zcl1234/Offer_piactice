package SecondEdition;

import java.util.LinkedList;

/**
 * Created by zhangchenlin on 17/5/3.
 * 实现一个函数，用来判断一颗二叉树是否是对称的，即二叉树和它的镜像是不是一样。
 */
public class No28 {
    private static int a=1;
    private static int b=1;
    public static void mirrorTree(BinaryTree root)
    {
        if(root==null)
            return;
        if(root.LeftNode==null&&root.RightNode==null)
            return;
        BinaryTree tempNode=root.LeftNode;
        root.LeftNode=root.RightNode;
        root.RightNode=tempNode;

        mirrorTree(root.LeftNode);
        mirrorTree(root.RightNode);
    }
    private static String buildTreeString(BinaryTree root,int count)
    {

        if(root==null)
            return null;
        StringBuilder builder=new StringBuilder();
        BinaryTree curr=null;
        LinkedList<BinaryTree> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty())
        {
        curr=list.poll();
        builder.append(curr.value+" ");
        if(curr.LeftNode!=null)
        {
            list.offer(curr.LeftNode);
            if(count==0)
            a++;
        }
        if(curr.RightNode!=null) {
            list.offer(curr.RightNode);
            if(count==0)
            a++;
        }
        }
        return builder.toString();
    }

    public static boolean isBalanceTree(BinaryTree root)
    {

        String s1=buildTreeString(root,0);
        mirrorTree(root);
        String s2=buildTreeString(root,1);
        System.out.println(s1+" "+s2+"..."+a);
        System.out.println(s1.equals(s2));
        if(a%2==0)
            return false;
        if(s1.equals(s2))
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        BinaryTree root1=new BinaryTree();
        BinaryTree node1=new BinaryTree();
        BinaryTree node2=new BinaryTree();
        BinaryTree node3=new BinaryTree();
        BinaryTree node4=new BinaryTree();
        BinaryTree node5=new BinaryTree();
        BinaryTree node6=new BinaryTree();
        root1.LeftNode=node1; root1.RightNode=node2;
        node1.LeftNode=node3; node1.RightNode=node4;
        node2.LeftNode=node5; node2.RightNode=node6;
        root1.value=8;
        node1.value=6;
        node2.value=9;
        node3.value=5;
        node4.value=7;
        node5.value=7;
        node6.value=5;
        Boolean boolan=isBalanceTree(root1);
        System.out.println(boolan);
    }
}
