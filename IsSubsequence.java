public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;
    while (j < s.length() && i < t.length()) {
      if (t.charAt(i) == s.charAt(j)) {
        i++;
        j++;
      } else {
        i++;
      }
    }
    return j == s.length();
  }
}
