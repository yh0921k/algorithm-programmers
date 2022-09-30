package solution.level1;

/*
 * 문자열 다루기 기본
 */
public class Problem025 {
  public boolean solution(String s) {
    int length = s.length();
    if ((length != 4) && (length != 6)) {
      return false;
    }

    for (int i = 0; i < length; i++) {
      if (!Character.isDigit(s.charAt(i))) {
        return false;
      }
    }

    return true;
  }
}
