import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int n = s.length();
    int l = 0;
    int maxlen = Integer.MIN_VALUE;
    if (s.isEmpty()) {
      return 0;
    }
    for (int r = 0; r < n; r++) {
      while (l < r && set.contains(s.charAt(r))) {
        set.remove(s.charAt(l));
        l++;
      }
      set.add(s.charAt(r));
      maxlen = Math.max(maxlen, r - l + 1);
    }
    return maxlen;
  }
}
