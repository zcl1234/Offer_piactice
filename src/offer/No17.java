package offer;

public class No17 {

	public static Node MergeLists(Node head1,Node head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		Node pnext=null;
		if(head1.value<head2.value)
		{
			pnext=head1;
			pnext.next=MergeLists(head1.next, head2);
		}else
		{
			pnext=head2;
			pnext.next=MergeLists(head1, head2.next);
		}
		
		return pnext;
	}
	public static void main(String[] args) {
		Node node1=new Node();
		Node node2=new Node();
		Node node3=new Node();
		Node node4=new Node();
		node1.value=2;
		node1.next=node2;
		node2.value=3;
		node2.next=node3;
		node3.value=5;
		node3.next=node4;
		node4.value=8;
		node4.next=null;
		
		Node node5=new Node();
		Node node6=new Node();
		Node node7=new Node();
		Node node8=new Node();
		node5.value=3;
		node5.next=node6;
		node6.value=4;
		node6.next=node7;
		node7.value=8;
		node7.next=node8;
		node8.value=9;
		node8.next=null;
		
		Node head=MergeLists(node1, node5);
		while(head!=null){
			System.out.println(head.value);
		  head=head.next;
		}
	}

}
