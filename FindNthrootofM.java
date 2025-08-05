public class FindNthrootofM {
  // if ans>m 2;
  // if ans==m 1
  // iff ans<m 0
  public static long func(int mid, int n, int m) {
    long ans = 1;
    for (int i = 0; i < n; i++) {
      ans *= mid;
      if (ans > m) {
        return 2;
      }
    }
    if (ans == m)
      return 1;
    return 0;
  }

  public static int NthRoot(int n, int m) {
    // Write your code here.
    int s = 1, e = m;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      long midN = func(mid, n, m);
      if (midN == 1) {
        return mid;
      } else if (midN == 0) {
        s = mid + 1;
      } else if (midN == 2) {
        e = mid - 1;
      }
    }
    return -1;
  }
}
