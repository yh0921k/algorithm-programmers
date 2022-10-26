package solution.level1;

/*
 * 체육복
 */
public class Problem049 {
  public int solution(int n, int[] lost, int[] reserve) {
    int[] students = new int[n + 2];

    for (int i = 0; i < lost.length; i++) {
      students[lost[i]]--;
    }

    for (int i = 0; i < reserve.length; i++) {
      students[reserve[i]]++;
    }

    for (int i = 1; i <= n; i++) {
      if (students[i] == -1 && students[i - 1] == 1) {
        students[i] = 0;
        students[i - 1] = 0;
      }

      if (students[i] == -1 && students[i + 1] == 1) {
        students[i] = 0;
        students[i + 1] = 0;
      }
    }

    int result = 0;
    for (int i = 1; i <= n; i++) {
      if (students[i] >= 0) {
        result++;
      }
    }

    return result;
  }
}
