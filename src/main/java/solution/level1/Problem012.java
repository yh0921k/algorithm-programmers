package solution.level1;

import java.util.Arrays;
import java.util.Collections;

/*
 * 정수 내림차순으로 배치하기
 */
public class Problem012 {
  public long solution(long n) {
    String[] digits = String.valueOf(n).split("");
    Arrays.sort(digits, Collections.reverseOrder());

    StringBuilder builder = new StringBuilder();
    for (String digit : digits) {
      builder.append(digit);
    }
    return Long.parseLong(builder.toString());
  }
}
