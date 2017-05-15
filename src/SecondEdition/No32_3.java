package SecondEdition;

import java.util.LinkedList;


/**
 * 之字形打印二叉树
 * 第一行从左往右打印，第二行从右往左打印。。。。
 * Created by zhangchenlin on 17/5/14.
 */
public class No32_3 {

    public static void PrintTree(BinaryTree root)
    {
        if(root==null)
            return;

        LinkedList<BinaryTree>[] list=new LinkedList[2];
        list[0]=new LinkedList<>();
        list[1]=new LinkedList<>();
        int floorth=0;


        list[0].add(root);
        while(!list[0].isEmpty()||!list[1].isEmpty())
        {
            BinaryTree curr=list[floorth].poll();
            System.out.print(curr.value+" ");

            if(floorth==0)
            {
                if(curr.LeftNode!=null)
                {
                    list[1].push(curr.LeftNode);
                }
                if(curr.RightNode!=null)
                {
                    list[1].push(curr.RightNode);
                }
            }else {
                if(curr.RightNode!=null)
                {
                    list[0].push(curr.RightNode);
                }
                if(curr.LeftNode!=null)
                {
                    list[0].push(curr.LeftNode);
                }
            }

            if(list[floorth].isEmpty())
            {
                floorth=1-floorth;
                System.out.println();

            }

        }




    }

    public static void main(String[] args) {
        BinaryTree root1 = new BinaryTree();
        BinaryTree node1 = new BinaryTree();
        BinaryTree node2 = new BinaryTree();
        BinaryTree node3 = new BinaryTree();
        BinaryTree node4 = new BinaryTree();
        BinaryTree node5 = new BinaryTree();
        BinaryTree node6 = new BinaryTree();
        root1.LeftNode = node1;
        root1.RightNode = node2;
        node1.LeftNode = node3;
        node1.RightNode = node4;
        node2.LeftNode = node5;
        node2.RightNode = node6;
        root1.value = 7;
        node1.value = 3;
        node2.value = 4;
        node3.value = 5;
        node4.value = 3;
        node5.value = 2;
        node6.value = 6;

        BinaryTree root2=new BinaryTree(1,null,null);

       PrintTree(root1);
    }
}
