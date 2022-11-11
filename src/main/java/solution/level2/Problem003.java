package solution.level2;

import java.util.Arrays;

/*
 * 최소값 만들기
 */
public class Problem003 {
  public int solution(int[] A, int[] B) {
    Arrays.sort(A);
    Arrays.sort(B);

    int result = 0;
    for (int i = 0; i < A.length; i++) {
      result += (A[i] * B[B.length - 1 - i]);
    }

    return result;
  }
}
