package solution.level1;

/*
 * 문자열을 정수로 바꾸기
 */
public class Problem017 {
  public int solution(String s) {
    boolean negative = s.charAt(0) == '-';
    boolean positive = s.charAt(0) == '+';

    int startIndex = negative || positive ? 1 : 0;
    int result = 0;

    for(int i = startIndex; i < s.length(); i++) {
      result = result * 10 + (s.charAt(i) - '0');
    }

    return negative ? result * -1 : result;
  }
}
