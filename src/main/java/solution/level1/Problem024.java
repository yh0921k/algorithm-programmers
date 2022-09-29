package solution.level1;

import java.util.Arrays;

/*
 * 문자열 내림차순으로 배치하기
 */
public class Problem024 {
  public String solution(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    String sortedString = new String(arr);

    return new StringBuilder(sortedString).reverse().toString();
  }
}
