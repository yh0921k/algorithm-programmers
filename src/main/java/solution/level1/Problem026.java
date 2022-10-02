package solution.level1;

/*
 * 약수의 개수와 덧셈
 */
public class Problem026 {
  public int solution(int left, int right) {

    // Solution 01
    //    int answer = 0;
    //    for(int i = left; i <= right; i++) {
    //      int count = 0;
    //
    //      for(int j = 1; j <= i; j++) {
    //        if(i % j == 0) {
    //          count++;
    //        }
    //      }
    //
    //      if(count % 2 == 0) {
    //        answer += i;
    //        continue;
    //      }
    //      answer -= i;
    //    }
    //    return answer;

    // Solution 02
    int answer = 0;

    for (int i = left; i <= right; i++) {
      if (i % Math.sqrt(i) == 0) {
        answer -= i;
        continue;
      }
      answer += i;
    }

    return answer;
  }
}
