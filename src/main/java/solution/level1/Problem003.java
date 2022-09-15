package solution.level1;

import java.util.Arrays;

/**
 * 평균 구하기
 */
public class Problem003 {
  public double solution(int[] arr) {
    int sum = 0;
    for(int number : arr) {
      sum += number;
    }

    return sum / (double)arr.length;

    //return Arrays.stream(arr).sum() / (double)arr.length;
  }
}

