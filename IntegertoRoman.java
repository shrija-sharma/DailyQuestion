public class IntegertoRoman {
  public String intToRoman(int num) {
    String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    String res = "";
    for (int i = 0; i < 13; i++) {
      if (num == 0)
        break;
      int times = num / numbers[i];
      while (times-- > 0) {
        res += symbols[i];
      }
      num = num % numbers[i];
    }
    return res;
  }
}
