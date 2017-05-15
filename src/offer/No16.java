package offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 
题目:定义一个函数,输入一个链表的头结点,反转该链表并输出反转后链表的 头结点。
 * */
public class No16 {
   //非递归方法实现
	public static Node ResverseNode(Node head)
	{
		if(head==null)
			return null;
		if(head.next==null)
		{
			return head;
		}
		Node reversehead=null;
		Node node=head;
		Node Prev=null;
		
		while(node.next!=null)
		{
			Node nextnode=node.next;
			if(nextnode.next==null)
			    reversehead=nextnode;
			node.next=Prev;
			Prev=node;
			node=nextnode;
		}
		
		return reversehead;
	}
	
	//递归方法实现
	public static Node Resversee_Recursion(Node head)
	{
		if(head==null||head.next==null)
			return head;
		Node next=head.next;
		head.next=null;
		Node res=Resversee_Recursion(next);
		next.next=head;
		return res;
	}
	
	
	public static void main(String[] args) {
		Node node1=new Node();
		Node node2=new Node();
		Node node3=new Node();
		Node node4=new Node();
		node1.value=1;
		node1.next=node2;
		node2.value=2;
		node2.next=node3;
		node3.value=3;
		node3.next=node4;
		node4.value=4;
		node4.next=null;
		//System.out.println(ResverseNode(node1).value);
		//System.out.println(Resversee_Recursion(node1).value);
		Node node=Resversee_Recursion(node1);
		while(node!=null)
		{
			System.out.println(node.value);
			node=node.next;
		}
	}

}
