package offer;

import java.util.HashMap;
import java.util.Map;
/**
 * 题目:实现函数复制一个复杂链表。在复杂链表中,每个结点除了有一个 next 指针指向下一个结点外,
 * 还有一个指向链表中任意结点或 null。
 * */
public class No26 {

	public static CNode clone(CNode head)
	{
		if(head==null)
			return null;
		CNode copy1=head;
		CNode copy2=head;
		CNode Chead=head;
		CNode clone=Chead;
		CNode clone2=Chead;
		Map<CNode,CNode> map=new HashMap<>();
		while(copy1!=null)
		{
			clone.value=copy1.value;
			clone.next=copy1.next;
			clone=clone.next;
			copy1=copy1.next;
			map.put(clone, copy1);
		}
		
		while(copy2!=null)
		{
			clone2.Sibling=copy2.Sibling;
			clone2=clone2.next;
			copy2=copy2.next;
		}
		
		
		return Chead;
	}
	
	
	public static void main(String[] args)
	{
		CNode node1=new CNode();
		CNode node2=new CNode();
		CNode node3=new CNode();
		CNode node4=new CNode();
		
		node1.value=1;
		node2.value=2;
		node3.value=3;
		node4.value=4;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node3.Sibling=node2;
		node4.Sibling=node1;
		System.out.println(clone(node1).next.next.next.Sibling.value);
		
	}
	
}
//复杂链表
class CNode
 {
	int value;
	CNode next;
	CNode Sibling;
 }