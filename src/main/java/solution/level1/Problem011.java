package solution.level1;

/*
 * 정수 제곱근 판별
 */
public class Problem011 {
  public long solution(long n) {
    long squareRoot = (long)Math.sqrt(n);
    return Math.pow(squareRoot, 2) == n ? (long)Math.pow(squareRoot + 1, 2) : -1;
  }
}
