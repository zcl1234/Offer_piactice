package SecondEdition;

/**
 * 输入一颗二叉查找树，将该二叉查找树转换成一个排序的双向链表
 * Created by zhangchenlin on 17/5/18.
 */
public class No35 {

    public static BinaryTree Convert(BinaryTree root)
    {
        if(root==null)
        {
            return null;
        }
        BinaryTree lastnode=null;
        BinaryTree lastNode=Convert(root,lastnode);
        while(lastNode.LeftNode!=null)
        {
            lastNode=lastNode.LeftNode;
        }
        return lastNode;
    }



    private static BinaryTree Convert(BinaryTree root,BinaryTree lastNode)
    {
        if(root==null)
        {
            return null;
        }
        if(root.LeftNode!=null)
        {
            lastNode=Convert(root.LeftNode,lastNode);
        }
        root.LeftNode=lastNode;
        if(lastNode!=null)
        {
            lastNode.RightNode=root;
        }
        lastNode=root;
        if(root.RightNode!=null)
        {
            lastNode=Convert(root.RightNode,lastNode);
        }
        return lastNode;
    }
    public static void main(String[] args)
    {
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
        node3.LeftNode = node4;
        node4.LeftNode = node5;
        node5.LeftNode = node6;
        root1.value = 10;
        node1.value = 6;
        node2.value = 11;
        node3.value = 4;
        node4.value = 3;
        node5.value = 2;
        node6.value = 1;

        BinaryTree node=Convert(root1);
        while(node!=null)
        {
            System.out.print(node+" ");
            node=node.RightNode;
        }
    }
}
