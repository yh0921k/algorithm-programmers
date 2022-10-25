package solution.level1;

import java.util.HashSet;
import java.util.Set;

/*
 * 폰켓몬
 */
public class Problem048 {
  public int solution(int[] nums) {
    Set<Integer> hashSet = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      hashSet.add(nums[i]);
    }

    return Math.min(hashSet.size(), nums.length / 2);
  }
}
