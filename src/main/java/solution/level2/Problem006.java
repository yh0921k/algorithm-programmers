package solution.level2;

/*
 * 숫자의 표현
 */
public class Problem006 {
  public int solution(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }

    int result = 1;
    int boundary = n / 2 + 1;
    for (int i = 1; i <= boundary; i++) {
      int temp = 0;
      for (int j = i; j <= boundary; j++) {
        temp += j;
        if (temp > n) {
          break;
        }
        if (temp == n) {
          result++;
          break;
        }
      }
    }

    return result;
  }
}
