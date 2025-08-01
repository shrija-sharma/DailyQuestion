import java.util.ArrayList;
import java.util.List;

public class PascalsTrianlge {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>();
      row.add(1);
      if (i > 0) {
        List<Integer> prevrow = res.get(i - 1);
        for (int j = 1; j < i; j++) {
          row.add(prevrow.get(j - 1) + prevrow.get(j));
        }
        row.add(1);
      }
      res.add(row);
    }
    return res;
  }
}
