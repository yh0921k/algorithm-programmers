package solution.level1;

import commons.PrintUtils;

import java.util.Arrays;

/*
 * K번째수
 */
public class Problem040 {
  public int[] solution(int[] array, int[][] commands) {

    int[] result = new int[commands.length];
    int resultIndex = 0;

    for (int[] command : commands) {
      int start = command[0] - 1;
      int end = command[1] - 1;
      int index = command[2] - 1;
      int[] subArray = new int[end - start + 1];


      for (int i = 0; i < subArray.length; i++) {
        subArray[i] = array[start++];
      }

      Arrays.sort(subArray);
      result[resultIndex++] = subArray[index];
    }

    return result;
  }
}
