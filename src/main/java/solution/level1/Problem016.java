package solution.level1;

/*
 * 제일 작은 수 제거하기
 */
public class Problem016 {
  public int[] solution(int[] arr) {
    int arraySize = arr.length;
    if(arraySize == 1) {
      return new int[]{-1};
    }

    int minIndex = -1;
    int value = Integer.MAX_VALUE;
    for (int i = 0; i < arraySize; i++) {
      if(arr[i] < value) {
        minIndex = i;
        value = arr[i];
      }
    }

    int[] result = new int[arraySize - 1];
    System.arraycopy(arr, 0, result, 0, minIndex);
    System.arraycopy(arr, minIndex + 1, result, minIndex, arraySize - (minIndex + 1) );

    return result;
  }
}
