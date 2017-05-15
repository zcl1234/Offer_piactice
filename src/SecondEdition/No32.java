package SecondEdition;

import java.util.LinkedList;

/**
 * Created by zhangchenlin on 17/5/11.
 * 遍历二叉树
 */
public class No32 {

    public static void floorBinaryTree(BinaryTree root)
    {
        if(root==null)
            return;
        LinkedList<BinaryTree> linkedList=new LinkedList<>();

        linkedList.add(root);

        while(!linkedList.isEmpty())
        {
            BinaryTree curr=linkedList.poll();
            System.out.print(curr.value+" ");


            if(curr.LeftNode!=null)
            {
                linkedList.add(curr.LeftNode);
            }
            if(curr.RightNode!=null)
            {
                linkedList.add(curr.RightNode);
            }
        }
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
        root1.value=7;
        node1.value=3;
        node2.value=4;
        node3.value=5;
        node4.value=3;
        node5.value=2;
        node6.value=6;
        floorBinaryTree(root1);
    }




}
