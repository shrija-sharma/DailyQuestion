public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int n = str.length();
    int i = 0, j = n - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
