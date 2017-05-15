package offer;

import java.util.LinkedList;

/**
 * 题目:输入一个链表的头结点,从尾到头反过来打印出每个结点的值。
 * */
public class No5 {

	//递归方式
	public static void PrintReverse(ListNode head)
	{
		if(head!=null)
		{
			if(head.next!=null)
			{
				PrintReverse(head.next);
			}
		}
		System.out.println(head.item);
	}
	
	
	
	
	/*非递归方式
	public static void PrintReverse(ListNode head)
	{
		LinkedList<Integer> ll=new LinkedList<>();
		while(head!=null)
		{
			ll.offerFirst(head.item);
			head=head.next;
		}
		while(!ll.isEmpty())
		{
			System.out.println(ll.poll());
		}
	}
	*/
	public static void main(String[] args)
	{ 
		ListNode node3=new ListNode(3,null);
		ListNode node2=new ListNode(2,node3);
		ListNode node1=new ListNode(1,node2);
	    PrintReverse(node1);
	}
	
}
class ListNode
{
	int item;
	ListNode next;
	public ListNode(int item,ListNode node)
	{
		this.item=item;
		this.next=node;
	}
}