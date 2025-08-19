public class FindLengthofLinkedList {
  public int getCount(Node head) {
    // code here
    Node temp = head;
    int count = 1;
    while (temp.next != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }
}
