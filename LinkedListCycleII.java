public class LinkedListCycleII {
  public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      ListNode temp = head;
      if (slow == fast) {
        while (slow != temp) {
          slow = slow.next;
          temp = temp.next;
        }
      }
      if (temp == slow) {
        return slow;
      }
    }
    return null;
  }
}
