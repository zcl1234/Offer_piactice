package offer;
//
public class No18 {

	public static boolean DoesTree1hasTree2(BinaryTree tree1,BinaryTree tree2)
	{
		if(tree2==null)
			return true;
		if(tree1==null)
			return false;
		if(tree1.value!=tree2.value)
			return false;
		return DoesTree1hasTree2(tree1.LeftNode, tree2.LeftNode)&&
				DoesTree1hasTree2(tree1.RightNode, tree2.RightNode);
	}
	
	
	public static boolean HasSubtree(BinaryTree tree1,BinaryTree tree2)
	{
		boolean result=false;
		if(tree1!=null&&tree2!=null)
		{
			if(tree1.value==tree2.value)
			{
			result=DoesTree1hasTree2(tree1, tree2);
			}
			if(!result)
			{
			result=HasSubtree(tree1.LeftNode, tree2);
			}
			if(!result)
			{
				result=HasSubtree(tree1.RightNode, tree2);
			}
		
		}
		return result;
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
		node4.LeftNode=node5; node4.RightNode=node6;
		root1.value=8;
		node1.value=8;
		node2.value=7;
		node3.value=9;
		node4.value=2;
		node5.value=4;
		node6.value=7;
		BinaryTree root2=new BinaryTree(); BinaryTree a=new BinaryTree(); BinaryTree b=new BinaryTree(); root2.LeftNode=a;
		root2.RightNode=b;
		root2.value=8;
		a.value=9;
		b.value=3;
	 System.out.println(HasSubtree(root1, root2));
	}
	
	
}
