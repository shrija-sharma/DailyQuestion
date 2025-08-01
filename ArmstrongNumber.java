public class ArmstrongNumber {
  public static boolean isArmstrong(int num) {
    // wrtie your code here;
    int digit = 0;
    int temp = num;
    int ans = 0, r = 0;
    while (temp > 0) {
      digit++;
      temp = temp / 10;
    }
    temp = num;
    while (temp > 0) {
      r = temp % 10;
      ans += Math.pow(r, digit);
      temp = temp / 10;
    }
    return ans == num;
  }
}
