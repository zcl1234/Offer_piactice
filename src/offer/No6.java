package offer;

import java.security.acl.Permission;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 输入二叉树的前序遍历和中序遍历的结果,重建出该二叉树。
 * 假设前 序遍历和中序遍历结果中都不包含重复的数字,
 * 例如输入的前序遍历序列 {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉 树。
  
 * */
public class No6 {

	
	public static BinaryTree ConstructBinaryTree(int[] PreOrder,int[] InOrder)
	{
		if(PreOrder==null||InOrder==null)
		{
			return null;
		}
		if(PreOrder.length!=InOrder.length)
			System.out.println("Input Error");
		BinaryTree root=new BinaryTree();
		if(PreOrder.length==1||InOrder.length==1)
		{
			root.value=PreOrder[0];
			System.out.println(root.value);
			return root;
		}
		for(int i=0;i<PreOrder.length;i++)
		{
			if(PreOrder[0]==InOrder[i])
			{
				root.value=PreOrder[0];
				System.out.println(root.value);
				if(i<(PreOrder.length-1)&&i!=0){
	        root.LeftNode=ConstructBinaryTree(Arrays.copyOfRange(PreOrder, 1, i+1),
	        		Arrays.copyOfRange(InOrder, 0,i ));	
	        root.RightNode=ConstructBinaryTree(Arrays.copyOfRange(PreOrder, i+1, PreOrder.length),
	        		Arrays.copyOfRange(InOrder, i+1, InOrder.length));
		}
				if(i==PreOrder.length-1&&i!=0)
					  root.LeftNode=ConstructBinaryTree(Arrays.copyOfRange(PreOrder, 1, i+1),
				        		Arrays.copyOfRange(InOrder, 0,i ));	
				if(i==0)
					 root.RightNode=ConstructBinaryTree(Arrays.copyOfRange(PreOrder, i+1, PreOrder.length),
				        		Arrays.copyOfRange(InOrder, i+1, InOrder.length));
					
			}
		}
		return root;
		
	}
	
	
	public static void main(String[] args)
	{
		int[] preSort={1,2,4,7,3,5,6,8};
		int[] inSort={4,7,2,1,5,3,8,6};
	    BinaryTree root=ConstructBinaryTree(preSort,inSort);
	    System.out.println("*****");
	//	BinaryTreeTest.FloorOrderTree(root);
		BinaryTreeTest.ReverseOrderTree(root);
		
	}
}
