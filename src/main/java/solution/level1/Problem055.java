package solution.level1;

/*
 * [1차] 비밀지도
 */
public class Problem055 {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++) {
      result[i] = decode(n, arr1[i], arr2[i]);
    }

    return result;
  }

  public String decode(int length, int row1, int row2) {
    int row = row1 | row2;
    String[] plainWords = {" ", "#"};
    StringBuilder decode = new StringBuilder();

    int position = (int)Math.pow(2, length - 1);

    while(position > 0) {
      int match = row / position;

      decode.append(plainWords[match]);
      if(match == 1) {
        row -= position;
      }
      position /= 2;
    }

    return decode.toString();
  }
}
