package countAndSay;

public class CountAndSay {

  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    return this.print(this.countAndSay(n - 1));
  }

  String print(String str) {
    StringBuilder result = new StringBuilder();
    char up = 0;
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (up == 0) {
        up = str.charAt(i);
      }
      if (up == str.charAt(i)) {
        count++;
      } else {
        result.append(count).append(String.valueOf(up));
        up = str.charAt(i);
        count = 1;
      }
      if (i == str.length() - 1) {
        result.append(count).append(String.valueOf(up));
      }
    }
    return result.toString();
  }
}
