package solution.level1;

/*
 * 콜라츠 추측
 */
public class Problem010 {
  public int solution(int num) {
    int count = 0;

    long number = num;
    while (number != 1) {
      number = (number & 1) == 1 ? odd(number) : even(number);

      if (++count > 500) {
        return -1;
      }
    }

    return count;
  }

  private long odd(long num) {
    return num * 3 + 1;
  }

  private long even(long num) {
    return num / 2;
  }
}
