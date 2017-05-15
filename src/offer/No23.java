package offer;


import java.util.LinkedList;
import java.util.List;
/**
 * 题目:从上往下打印二叉树的每个结点,同一层的结点按照从左到右的顺序打印。
 * */
public class No23 {

	public static void floor(BinaryTree root)
	{
		if(root==null)
			return;
		
		LinkedList<BinaryTree> list=new LinkedList<>();
		
		list.offer(root);
		while(!list.isEmpty())
		{
			BinaryTree curr=null;
			curr=list.poll();
			System.out.println(curr.value);
			if(curr.LeftNode!=null)
			{
				list.offer(curr.LeftNode);
			}
			if(curr.RightNode!=null)
			{
				list.offer(curr.RightNode);
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
		root1.value=8;
		node1.value=8;
		node2.value=7;
		node3.value=9;
		node4.value=2;
		node5.value=4;
		node6.value=10;
		
		floor(root1);
		
	}
	
	
	
	
}
