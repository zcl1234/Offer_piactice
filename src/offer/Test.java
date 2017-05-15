package offer;

public class Test {

	public static void main(String[] args)
	{
		Node head=new Node();
		head.value=1;
		Node next=new Node();
		next.value=2;
		head.next=next;
		Node chead=head;
		chead.next.value=3;
		Node chead2=head;
		chead2.next.value=4;
		System.out.println(head.value);
	}
	
}
