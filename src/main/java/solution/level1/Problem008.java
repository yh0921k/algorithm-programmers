package solution.level1;

/*
 * 하샤드 수
 */
public class Problem008 {
  public boolean solution(int x) {
    int total = x;
    int sum = 0;

    while(x > 0) {
      sum += (x % 10);
      x /= 10;
    }

    return total % sum == 0;
  }
}