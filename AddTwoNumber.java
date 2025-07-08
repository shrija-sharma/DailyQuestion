public class AddTwoNumber {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummynode=new ListNode(0);
        ListNode curr=dummynode;
        int carry=0;
        while(temp1!=null || temp2!=null || carry==1){
            int sum=0;
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            sum+=carry;
            ListNode newnode=new ListNode(sum%10);
            curr.next=newnode;
            curr=curr.next;
            carry=sum/10;
        }
        return dummynode.next;
    }
}
