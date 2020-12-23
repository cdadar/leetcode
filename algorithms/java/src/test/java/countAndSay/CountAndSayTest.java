package countAndSay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountAndSayTest {

  @Test
  void countAndSay() {
    CountAndSay countAndSay = new CountAndSay();
    Assertions.assertEquals("1", countAndSay.countAndSay(1));
    Assertions.assertEquals("11", countAndSay.countAndSay(2));
    Assertions.assertEquals("21", countAndSay.countAndSay(3));
    Assertions.assertEquals("1211", countAndSay.countAndSay(4));
    Assertions.assertEquals("111221", countAndSay.countAndSay(5));
    Assertions.assertEquals("312211", countAndSay.countAndSay(6));
  }

  @Test
  void print() {
    CountAndSay countAndSay = new CountAndSay();
    Assertions.assertEquals("11", countAndSay.print("1"));
    Assertions.assertEquals("21", countAndSay.print("11"));
    Assertions.assertEquals("1211", countAndSay.print("21"));
    Assertions.assertEquals("111221", countAndSay.print("1211"));
  }
}
