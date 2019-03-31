package convert;

import java.util.ArrayList;
import java.util.List;

class Solution {

  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    List<StringBuffer> rows = new ArrayList<>();

    for (int i = 0; i < Math.min(numRows, s.length()); i++) {
      rows.add(new StringBuffer());
    }

    int curRow = 0;
    boolean goingRow = false;
    for (char c : s.toCharArray()) {
      rows.get(curRow).append(c);
      if (curRow == 0 || curRow == numRows - 1) {
        goingRow = !goingRow;
      }
      curRow += goingRow ? 1 : -1;
    }

    StringBuffer res = new StringBuffer();
    for (StringBuffer str : rows) {
      res.append(str);
    }
    return res.toString();

  }
}
