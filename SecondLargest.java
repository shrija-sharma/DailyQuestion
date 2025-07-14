public class SecondLargest {
  public int getSecondLargest(int[] arr) {
    // code here
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    int smax = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] != max && arr[i] > smax) {
        smax = arr[i];
      }
    }
    return smax;
  }
}
