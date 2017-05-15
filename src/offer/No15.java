package offer;
/**
 * 
题目:输入一个链表,输出该链表中倒数第 k 个结点。为了符合大多数人的习惯, 本题从 1 开始计数,即链表的尾结点是倒数第一个结点。
例如一个有 6 个结点的 链表,从头结点依次是 1,2,3,4,5,6。倒数第三个结点就是值为 4 的结点。
 * 本题使用两个指针来做，两个指针距离为k-1，当前面指针到达最后时，后面的指针即为倒数第k个节点
 * */
public class No15 {

	public static Node DeleteNoKNode(Node head,int k)
	{
		if(head==null||k==0)
			return null;
		Node node=head;
		Node node1=head;
		for(int i=0;i<k-1;i++)
		{
			if(node.next!=null)      // 处理k大于链表长度的情况
			node=node.next;
			else
				return null;
		}
		while(node.next!=null)
		{
			node=node.next;
			node1=node1.next;
		}
//		if(node1==node){
//			node1=null;
//		}else
//		{
//			node1.value=node1.next.value;
//			node1.next=node1.next.next;
//		}
		
        return node1;
		
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
		System.out.println(DeleteNoKNode(node1, 5));
	}

}
