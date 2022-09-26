package solution.level1;

import java.util.LinkedList;
import java.util.List;

/*
 * 나누어 떨어지는 숫자 배열
 */
public class Problem020 {
  public int[] solution(int[] arr, int divisor) {
    List<Integer> resultList = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        resultList.add(arr[i]);
      }
    }

    if (resultList.size() == 0) {
      return new int[] {-1};
    }

    return resultList.stream().sorted().mapToInt(i -> i).toArray();
  }
}
