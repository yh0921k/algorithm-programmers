package solution.level1;

/*
 * 두 정수 사이의 합
 */
public class Problem013 {
  public long solution(int a, int b) {
    int min = Math.min(a, b);
    int max = Math.max(a, b);
    int n = max - min + 1;

    return ((long)n * (min + max)) / 2;
  }
}
