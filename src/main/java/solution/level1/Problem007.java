package solution.level1;

import java.util.stream.Stream;

/*
 * x만큼 간격이 있는 n개의 숫자
 */
public class Problem007 {
  public long[] solution(int x, int n) {
    // Solution 01
    // long gap = x;
    // return Stream.iterate(gap, i -> i + gap).limit(n).mapToLong(Long::valueOf).toArray();

    // Solution 02
    long[] result = new long[n];
    result[0] = x;

    for(int i = 1; i < n; i++) {
      result[i] = result[i-1] + x;
    }

    return result;
  }
}