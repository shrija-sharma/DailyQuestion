public class CeilTheFloor {
  public static int floor(int[] arr, int n, int x) {
    int s = 0, e = n - 1;
    int ans = -1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == x) {
        return arr[mid];
      } else if (arr[mid] < x) {
        ans = arr[mid];
        s = mid + 1;
      } else if (arr[mid] > x) {
        e = mid - 1;
      }
    }
    return ans;
  }

  public static int ceil(int[] arr, int n, int x) {
    int s = 0, e = n - 1;
    int ans = -1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == x) {
        return arr[mid];
      } else if (arr[mid] < x) {
        s = mid + 1;
      } else if (arr[mid] > x) {
        ans = arr[mid];
        e = mid - 1;
      }
    }
    return ans;
  }

  public static int[] getFloorAndCeil(int[] a, int n, int x) {
    // Write your code here.
    int floorval = floor(a, n, x);
    int ceilval = ceil(a, n, x);
    return new int[] { floorval, ceilval };
  }
}
