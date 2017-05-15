package offer;
/**
 * 题目:给定单向链表的头指针和一个结点指针,定义一个函数在 O(1)时间删除 该结点。
 * */
public class No13 {

	public static void DeleteNode(Node head,Node toBeDelete)
	{
		if(head==null||toBeDelete==null)
			return;
		if(toBeDelete==head){//删除头节点
			head=null;
		}else 
			if(toBeDelete.next==null)   //删除尾节点
			{
			   Node node=head;
			   while(node.next.next!=null)
				   node=node.next;
			   node.next=null;
			}
			else{
		Node next_next=toBeDelete.next;
		toBeDelete.value=next_next.value;
		toBeDelete.next=next_next.next;
			}
	}
	
	public static void main(String[] args)
	{
		Node node1=new Node();
		Node node2=new Node();
		Node node3=new Node();
		node1.value=1;
		node1.next=node2;
		node2.value=2;
		node2.next=node3;
		node3.value=3;
		node3.next=null;
		DeleteNode(node1, node3);
		System.out.println(node1.next.next);
	}
	
	
}
class Node
{
	int value;
	Node next;
}