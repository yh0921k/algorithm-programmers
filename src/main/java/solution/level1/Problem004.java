package solution.level1;

/**
 * 나머지가 1이 되는 수 찾기
 */
public class Problem004 {
  private boolean isPrime(int n) {
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int solution(int n) {
    int answer = 0;

    if (n % 2 == 1) {
      return 2;
    }

    if (isPrime(n - 1)) {
      return n - 1;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 1) {
        answer = i;
        break;
      }
    }
    return answer;
  }
}