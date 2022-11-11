package solution.level2;

/*
 * 피보나치 수
 */
public class Problem007 {
  public int solution(int n) {
    int[] remainders = new int[n + 1];
    remainders[0] = 0;
    remainders[1] = 1;

    for (int i = 2; i <= n; i++) {
      remainders[i] = (remainders[i - 1] + remainders[i - 2]) % 1234567;
    }

    return remainders[n];
  }
}
