import java.util.PriorityQueue;

public class KthSmallestElementinanArray {
  public static int kthSmallest(int n, int k, int[] arr) {
    // Write your code here.
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    for (int num : arr) {
      minheap.add(num);
    }
    for (int i = 1; i < k; i++) {
      minheap.poll();
    }
    return minheap.peek();
  }
}
