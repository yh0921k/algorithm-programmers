package solution.level1;

import java.util.Arrays;

/*
 * 예산
 */
public class Problem039 {
  public int solution(int[] d, int budget) {
    Arrays.sort(d);

    int result = 0;
    for(int part : d) {
      budget -= part;
      if (budget >= 0) {
        result++;
        continue;
      }
      break;
    }

    return result;
  }
}
