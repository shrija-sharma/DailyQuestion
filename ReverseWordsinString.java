public class ReverseWordsinString {
  public String reverseWords(String s) {
    String[] words = s.split("\\s+");
    int n = words.length;
    String ans = "";
    for (int i = n - 1; i >= 0; i--) {
      ans += words[i] + " ";
    }
    return ans.trim();
  }
}
