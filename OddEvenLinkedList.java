public class OddEvenLinkedList {
  public ListNode oddEvenList(ListNode head) {
    ListNode temp = head;
    ListNode odd = new ListNode(0);
    ListNode even = new ListNode(0);
    ListNode tempo = odd;
    ListNode tempe = even;

    while (temp != null) {
      tempo.next = temp;
      tempo = tempo.next;
      temp = temp.next;

      tempe.next = temp;
      if (temp == null) {
        break;
      }
      tempe = tempe.next;
      temp = temp.next;
    }
    tempo.next = even.next;
    return odd.next;
  }
}
