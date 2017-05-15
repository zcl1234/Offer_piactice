package SecondEdition;





/**
 * Created by zhangchenlin on 17/5/3.
 * 完成一个函数，输入一颗二叉树，该函数输出它的镜像
 */
public class No27 {
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
        node2.LeftNode=node5;// node2.RightNode=node6;
        root1.value=8;
        node1.value=8;
        node2.value=7;
        node3.value=9;
        node4.value=2;
        node5.value=4;
        //	node6.value=7;
        mirrorTree(root1);
        BinaryTreeTest.FloorOrderTree(root1);
        //System.out.println(root1.LeftNode.LeftNode);
    }

}
