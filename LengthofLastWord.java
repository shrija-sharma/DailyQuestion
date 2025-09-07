public class LengthofLastWord {
  public int lengthOfLastWord(String s) {
    int count = 0;
    s = s.trim();
    int n = s.length();
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        break;
      }
      count++;
    }
    return count;
  }
}
