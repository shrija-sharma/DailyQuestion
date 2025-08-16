import java.util.PriorityQueue;
public class KthLargestElementinanArray {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    for (int num : nums) {
      minheap.add(num);
      if (minheap.size() > k) {
        minheap.poll();
      }
    }
    return minheap.peek();
  }
}
