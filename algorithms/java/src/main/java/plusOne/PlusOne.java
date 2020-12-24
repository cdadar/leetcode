package plusOne;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    int carry = 0;
    int cur = digits.length - 1;
    do {

      int sum = 0;
      if (cur == digits.length - 1) {
        sum = digits[cur] + 1 + carry;
      } else {
        sum = digits[cur] + carry;
      }
      digits[cur] = sum % 10;
      carry = sum / 10;
      if (carry != 0 && cur == 0) {
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = carry;
        for (int i = 0; i < digits.length; i++) {
          newDigits[i + 1] = digits[i];
        }
        return newDigits;
      }
      cur--;
    } while (carry != 0 && cur >= 0);
    return digits;
  }
}
