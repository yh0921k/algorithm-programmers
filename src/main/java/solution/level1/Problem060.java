package solution.level1;

/*
 * 푸드 파이트 대회
 */
public class Problem060 {
  public String solution(int[] food) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < food.length; i++) {
      if(food[i] > 1) {
        int count = food[i] / 2;
        for (int j = 0; j < count; j++) {
          builder.append(i);
        }
      }
    }

    StringBuilder result = new StringBuilder();
    result.append(builder).append(0).append(builder.reverse());
    return result.toString();
  }
}
