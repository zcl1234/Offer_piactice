package SecondEdition;

/**
 * Created by zhangchenlin on 17/5/3.
 */
public class BinaryTree {
    public  int value;
    public BinaryTree LeftNode;
    public BinaryTree RightNode;
    public BinaryTree()
    {

    }
    public BinaryTree(int value, BinaryTree leftNode, BinaryTree rightNode) {
        this.value = value;
        LeftNode = leftNode;
        RightNode = rightNode;
    }
}
