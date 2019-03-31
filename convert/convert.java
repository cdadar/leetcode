package convert;

import java.util.ArrayList;
import java.util.List;

class Solution {

  /**
   * 我们可以使用 \text{min}( \text{numRows}, \text{len}(s))min(numRows,len(s)) 个列表来表示 Z 字形图案中的非空行。
   *
   * 从左到右迭代 ss，将每个字符添加到合适的行。可以使用当前行和当前方向这两个变量对合适的行进行跟踪。
   *
   * 只有当我们向上移动到最上面的行或向下移动到最下面的行时，当前方向才会发生改变。我们可以使用 \text{min}( \text{numRows},
   * \text{len}(s))min(numRows,len(s)) 个列表来表示 Z 字形图案中的非空行。
   *
   * 从左到右迭代 ss，将每个字符添加到合适的行。可以使用当前行和当前方向这两个变量对合适的行进行跟踪。
   *
   * 只有当我们向上移动到最上面的行或向下移动到最下面的行时，当前方向才会发生改变。
   */
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
