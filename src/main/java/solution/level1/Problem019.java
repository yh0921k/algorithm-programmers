package solution.level1;

/*
 * 음양 더하기
 */
public class Problem019 {
  public int solution(int[] absolutes, boolean[] signs) {

    int size = absolutes.length;

    int result = 0;
    for (int i = 0; i < size; i++) {
      int signNumber = signs[i] ? absolutes[i] : -absolutes[i];
      result += signNumber;
    }

    return result;
  }
}
