package solution.level1;

/*
 * 소수 찾기
 */
public class Problem036 {
  public int solution(int n) {
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= Math.sqrt(n); i++) {
      for(int j = i * i; j <= n; j += i) {
        isPrime[j] = true;
      }
    }

    int count = 0;
    for(int i = 2; i <= n; i++) {
      if(!isPrime[i]) {
        count++;
      }
    }
    return count;
  }
}
