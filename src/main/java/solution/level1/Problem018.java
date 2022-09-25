package solution.level1;

/*
 * 수박수박수박수박수박수?
 */
public class Problem018 {
  public String solution(int n) {
    int countOfWord = n / 2;
    boolean isOdd = n % 2 == 1;

    StringBuilder result = new StringBuilder("수박".repeat(countOfWord));

    result = isOdd ? result.append("수") : result;
    return result.toString();
  }
}
