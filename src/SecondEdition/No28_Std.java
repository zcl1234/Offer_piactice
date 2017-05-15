package SecondEdition;

/**
 * Created by zhangchenlin on 17/5/4.
 * 求是否是对称二叉树的较好的解法
 */
public class No28_Std {



    private static boolean isSymmetric(BinaryTree left,BinaryTree right)
    {
        if(left==null&&right==null)
            return true;
        if(left==null||right==null)
            return false;
        if(left.value!=right.value)
            return false;
        return isSymmetric(left.LeftNode,right.RightNode)
                &&isSymmetric(left.RightNode,right.LeftNode);
    }


    public static boolean isSymmetric(BinaryTree root)
    {
        return isSymmetric(root,root);
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
        node2.LeftNode=node5; //node2.RightNode=node6;
        root1.value=7;
        node1.value=7;
        node2.value=7;
        node3.value=7;
        node4.value=7;
        node5.value=7;
      //  node6.value=5;
        Boolean isSyt=isSymmetric(root1);
        System.out.println(isSyt);
    }


}

