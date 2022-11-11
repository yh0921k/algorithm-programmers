package solution.level2;

/*
 * 다음 큰 숫자
 */
public class Problem008 {
  public int solution(int n) {
    int count = countOne(n);
    while(true) {
      int nextCount = countOne(++n);
      if(count == nextCount) {
        break;
      }
    }
    return n;
  }

  public int countOne(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        count++;
      }
      n /= 2;
    }
    return count;
  }
}
