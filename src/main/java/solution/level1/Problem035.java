package solution.level1;

import java.util.Arrays;

/*
 * 2016년
 */
public class Problem035 {
  private static final String[] dayOfWeek = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private static final int[] dayOfMonth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public String solution(int a, int b) {
    // Solution 01
    String startOfYear = "FRI";
    
    int afterDays = 0;
    for (int i = 0; i < a - 1; i++) {
      afterDays += dayOfMonth[i];
    }
    afterDays += b;

    int baseDay = Arrays.asList(dayOfWeek).indexOf(startOfYear) - 1;
    return dayOfWeek[(afterDays + baseDay) % 7];

    // Solution 02
//    return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }
}