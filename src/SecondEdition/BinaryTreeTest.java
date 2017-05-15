package SecondEdition;

import java.util.LinkedList;

public class BinaryTreeTest {

	//前序遍历
	public static void PreOrderTree(BinaryTree Tree)
	{
		if(Tree==null)
			return;
		System.out.println(Tree.value);
		PreOrderTree(Tree.LeftNode);
		PreOrderTree(Tree.RightNode);
		
	}
	//中序遍历
	public static void InOrderTree(BinaryTree Tree)
	{
		if(Tree==null)
			return;
		InOrderTree(Tree.LeftNode);
		System.out.println(Tree.value);
		InOrderTree(Tree.RightNode);
	}
	//后序遍历
	public static void ReverseOrderTree(BinaryTree Tree)
	{
		if(Tree==null)
			return ;
		ReverseOrderTree(Tree.LeftNode);
		ReverseOrderTree(Tree.RightNode);
		System.out.println(Tree.value);
	}
	
	
	//层序遍历
	
	public static void FloorOrderTree(BinaryTree Tree)
	{
		if(Tree==null)
			return ;
		BinaryTree curr=null;
		LinkedList<BinaryTree> list=new LinkedList<>();
		list.offer(Tree);
		while(!list.isEmpty())
		{
			curr=list.poll();
			System.out.print(curr.value+"  ");
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
	
	
	
	public static void main(String[] args) {
//		BinaryTree b4=new BinaryTree(4,null,null);
//		BinaryTree b5=new BinaryTree(5,null,null);
//		BinaryTree b6=new BinaryTree(6,null,null);
//		BinaryTree b7=new BinaryTree(7,null,null);
//		BinaryTree b2=new BinaryTree(2,b4,b5);
//		BinaryTree b3=new BinaryTree(3,b6,b7);
//		BinaryTree b1=new BinaryTree(1,b2,b3);
		//PreOrderTree(b1);
		//InOrderTree(b1);
		//ReverseOrderTree(b1);
		//FloorOrderTree(b1);

	}

	
}
