package solution.level1;

/*
 * 행렬의 덧셈
 */
public class Problem027 {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = arr2;

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[0].length; j++) {
        answer[i][j] += arr1[i][j];
      }
    }

    return answer;
  }
}
