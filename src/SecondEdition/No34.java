package SecondEdition;

import java.util.LinkedList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
 * Created by zhangchenlin on 17/5/16.
 */
public class No34 {


    private static void PrintTreeForSum(BinaryTree tree, int sum, int curr, LinkedList<BinaryTree> list)
    {
        curr=curr+tree.value;
        list.add(tree);
        if(tree.RightNode==null&&tree.RightNode==null)
        {
            if(sum==curr) {
                for (BinaryTree node : list) {
                    System.out.print(node.value+" ");
                }
                System.out.println();
                list.pollLast();
                return;
            }else
            {
                list.pollLast();
                return;
            }
        }




        PrintTreeForSum(tree.LeftNode,sum,curr,list);
        PrintTreeForSum(tree.RightNode,sum,curr,list);
        list.pollLast();
    }

        public static void PrintTreeForSum(BinaryTree root,int sum)
        {
            if(root==null)
                return;
            LinkedList<BinaryTree> list=new LinkedList<>();
            int curr=0;
            PrintTreeForSum(root,sum,curr,list);
        }

        public static void main(String[] args)
        {
            BinaryTree node1=new BinaryTree();
            BinaryTree node2=new BinaryTree();
            BinaryTree node3=new BinaryTree();
            BinaryTree node4=new BinaryTree();
            BinaryTree node5=new BinaryTree();
            BinaryTree node6=new BinaryTree();
            node1.value=10;
            node1.LeftNode=node2;
            node1.RightNode=node3;
            node2.value=5;
            node3.value=12;
            node2.LeftNode=node4;
            node2.RightNode=node5;
            node4.value=4;
            node5.value=7;
            PrintTreeForSum(node1,22);
        }


}
