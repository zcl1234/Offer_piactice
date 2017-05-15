package offer;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * 题目:输入一颗二叉树和一个整数,打印出二叉树中结点值的和为输入整数的所
 * 有路径。从树的根节点开始往下一直到叶结点所经过的结点形成一条路径。
 * */
public class No25{

	private static void PrintSumPath(BinaryTree root,int sum,LinkedList<BinaryTree> list,int Except)
	{
		sum+=root.value;
		list.push(root);
		if(root.LeftNode==null&&root.RightNode==null)
		{
			if(sum==Except)
			{
//				for(BinaryTree l:list)
//				{
//					System.out.print(l.value+" ");
//					
//				}
//				System.out.println();
				Iterator<BinaryTree> iterator=list.descendingIterator();
				while(iterator.hasNext())
				{
					System.out.print(iterator.next().value+ " ");
				
				}
				System.out.println();
			}
			
		}
	
		if(root.LeftNode!=null)
			PrintSumPath(root.LeftNode, sum, list, Except);
		if(root.RightNode!=null)
			PrintSumPath(root.RightNode, sum, list, Except);
		
		
		list.pop();
		sum-=root.value;
		
	}
	
	public static void FindPath(BinaryTree root,int Except)
	{
		if(root==null)
			return;
		int sum=0;
		LinkedList<BinaryTree> list=new LinkedList<>();
		
		PrintSumPath(root, sum, list, Except);
		
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
		FindPath(root1, 19);
		
		
	}
	
	
	
	
	
	
}
