package solution.level2;

/*
 * 카펫
 */
public class Problem009 {
  public int[] solution(int brown, int yellow) {
    int sum = brown + yellow;
    int[] result = new int[2];
    boolean flag = false;

    for (int width = 1; width <= sum; width++) {
      for (int height = 1; height <= sum; height++) {
        if(height > width) {
          break;
        }

        int brownEquation = (2 * width) + (2 * height) - 4;
        int yellowEquation = (width * height) + (-2 * width) + (-2 * height) + 4;
        if(brownEquation  == brown && yellowEquation == yellow) {
          result[0] = width;
          result[1] = height;
          return result;
        }
      }
    }
    return result;
  }
}