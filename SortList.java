public class SortList {
  public ListNode mid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public ListNode mergesort(ListNode l1, ListNode l2) {
    ListNode temp1 = l1;
    ListNode temp2 = l2;
    ListNode dummy = new ListNode(100);
    ListNode temp = dummy;
    while (temp1 != null && temp2 != null) {
      if (temp1.val < temp2.val) {
        temp.next = temp1;
        temp = temp.next;
        temp1 = temp1.next;
      } else {
        temp.next = temp2;
        temp = temp.next;
        temp2 = temp2.next;
      }
    }
    if (temp1 == null) {
      temp.next = temp2;
    } else {
      temp.next = temp1;
    }
    return dummy.next;
  }

  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode lh = head;
    ListNode middle = mid(head);
    ListNode rh = middle.next;
    middle.next = null;

    lh = sortList(lh);
    rh = sortList(rh);
    return mergesort(lh, rh);
  }
}
