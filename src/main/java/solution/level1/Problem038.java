package solution.level1;

/*
 * 3진법 뒤집기
 */
public class Problem038 {
  public int solution(int n) {
    StringBuilder builder = new StringBuilder();
    while (n > 0) {
      builder.append(n % 3);
      n /= 3;
    }

    long reverseNumber = Long.parseLong(builder.toString());

    int result = 0;
    int iter = 0;
    while (reverseNumber > 0) {
      result += (reverseNumber % 10) * Math.pow(3, iter++);
      reverseNumber /= 10;
    }
    return result;
  }
}
