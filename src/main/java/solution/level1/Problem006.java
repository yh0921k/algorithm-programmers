package solution.level1;

/*
 * 짝수와 홀수
 */
public class Problem006 {
  public String solution(int num) {
    String answer = (num & 1) > 0 ? "Odd" : "Even";
    return answer;
  }
}
