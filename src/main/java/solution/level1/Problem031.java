package solution.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 같은 숫자는 싫어
 */
public class Problem031 {
  public int[] solution(int[] arr) {
    int temp = -1;
    List<Integer> numberList = new ArrayList<>();
    for (int number : arr) {
      if (number != temp) {
        numberList.add(number);
        temp = number;
      }
    }

    int[] result = new int[numberList.size()];
    for (int i = 0; i < numberList.size(); i++) {
      result[i] = numberList.get(i);
    }

    return result;
  }
}
