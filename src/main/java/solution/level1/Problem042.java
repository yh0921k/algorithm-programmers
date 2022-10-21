package solution.level1;

import java.util.TreeSet;

/*
 * 두 개 뽑아서 더하기
 */
public class Problem042 {
  public int[] solution(int[] numbers) {
    TreeSet<Integer> numberTreeSet = new TreeSet<>();
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i+1; j < numbers.length; j++) {
        numberTreeSet.add(numbers[i] + numbers[j]);
      }
    }

    int[] result = new int[numberTreeSet.size()];
    int index = 0;
    for(Integer number : numberTreeSet) {
      result[index++] = number;
    }

    return result;
  }
}
