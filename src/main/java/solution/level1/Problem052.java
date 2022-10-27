package solution.level1;

import java.util.HashSet;
import java.util.Set;

/*
 * 로또의 최고 순위와 최저 순위
 */
public class Problem052 {
  public int[] solution(int[] lottos, int[] win_nums) {

    int zeroCount = 0;
    int matchCount = 0;

    Set<Integer> hashSet = mapToSet(win_nums);

    for (int i = 0; i < win_nums.length; i++) {
      int lottoNumber = lottos[i];
      if (lottoNumber == 0) {
        zeroCount++;
        continue;
      }

      if (hashSet.contains(lottoNumber)) {
        matchCount++;
        hashSet.remove(lottoNumber);
      }
    }

    int notMatchedCount = hashSet.size();
    int highest =
        zeroCount <= notMatchedCount
            ? rank(zeroCount + matchCount)
            : rank(notMatchedCount + matchCount);

    return new int[] {controlBoundary(highest), controlBoundary(rank(matchCount))};
  }

  private Set<Integer> mapToSet(int[] win_nums) {
    Set<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < win_nums.length; i++) {
      hashSet.add(win_nums[i]);
    }
    return hashSet;
  }

  public int controlBoundary(int number) {
    if (number > 6) {
      return 6;
    }
    return number;
  }

  public int rank(int number) {
    return 6 - number + 1;
  }
}
