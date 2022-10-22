package solution.level1;

/*
 * 콜라 문제
 */
public class Problem043 {
  public int solution(int a, int b, int n) {
    int result = 0;
    while(n >= a) {
      int quotient = n / a;
      int givenCount = quotient * a;
      int receivedCount = quotient * b;

      n -= givenCount;
      n += receivedCount;
      result += receivedCount;
    }

    return result;
  }
}
