package solution.level1;

/*
 * 가운데 글자 가져오기
 */
public class Problem021 {
  public String solution(String s) {
    int length = s.length();
    int halfLength = length / 2;
    boolean isOdd = (length & 1) == 1;

    int startIndex  = isOdd ? halfLength : halfLength - 1;
    int endIndex = halfLength + 1;

    return s.substring(startIndex, endIndex);
  }
}
