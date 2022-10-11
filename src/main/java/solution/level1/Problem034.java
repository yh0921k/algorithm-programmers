package solution.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 문자열 내 마음대로 정렬하기
 */
public class Problem034 {
  public String[] solution(String[] strings, int n) {
    Collections.sort(Arrays.asList(strings), new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.charAt(n) == o2.charAt(n)) {
          return o1.compareTo(o2);
        }
        if(o1.charAt(n) > o2.charAt(n)) {
          return 1;
        }
        return -1;
      }
    });

    return strings;
  }
}