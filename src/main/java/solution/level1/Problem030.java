package solution.level1;

/*
 * 최대공약수와 최소공배수
 */
public class Problem030 {
  public int[] solution(int n, int m) {
    return new int[]{gcd(n, m), lcm(n, m)};
  }

  public int gcd(int a, int b) {
      if( a < b ) {
          int temp = a;
          a = b;
          b = temp;
      }
      while(b != 0) {
          int r = a % b;
          a = b;
          b = r;
      }
      return a;
  }

  public int lcm(int a, int b) {
      return a * b / gcd(a, b);
  }
}
