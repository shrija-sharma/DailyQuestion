import java.util.HashMap;
import java.util.Stack;

public class NextSmallerElement {
  public static int[] nextSmall(int[] arr) {
    Stack<Integer> st = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() > arr[i]) {
        st.pop();
      }
      if (st.isEmpty()) {
        map.put(arr[i], -1);
      } else {
        map.put(arr[i], st.peek());
      }
      st.push(arr[i]);
    }
    int n = arr.length;
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      res[i] = map.get(arr[i]);
    }
    return res;
  }
}
