class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }

}
public class SortLinkedList {
  	public static Node sortLL(Node head) {
		 //Write your code here
	Node zerohead=new Node(-1);
	Node onehead=new Node(-1);
	Node twohead=new Node(-1);

	Node zero=zerohead;
	Node one=onehead;
	Node two=twohead;

	Node curr=head;
	while(curr!=null){
		if(curr.data==0){
			zero.next=curr;
			zero=zero.next;
		}	
		else if(curr.data==1){
			one.next=curr;
			one=one.next;
		}
		else if(curr.data==2){
			two.next=curr;
			two=two.next;
		}
		curr=curr.next;
	}
	zero.next=(onehead.next!=null)?onehead.next:twohead.next;
	one.next=twohead.next;
	two.next=null;
	return zerohead.next;
	}
}
