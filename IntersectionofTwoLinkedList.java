public class IntersectionofTwoLinkedList {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode tempA = headA;
    ListNode tempB = headB;

    while (tempA != tempB) {
      tempA = tempA.next;
      tempB = tempB.next;

      if (tempA == tempB) {
        return tempB;
      }
      if (tempA == null) {
        tempA = headB;
      }
      if (tempB == null) {
        tempB = headA;
      }
    }
    return tempA;
  }
}
