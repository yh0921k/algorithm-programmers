package solution.level1;

/*
 * 최소직사각형
 */
public class Problem041 {
  public int solution(int[][] sizes) {

    int width = 0;
    int height = 0;

    for (int[] size : sizes) {
      if(size[0] < size[1]) {
        int temp = size[1];
        size[1] = size[0];
        size[0] = temp;
      }

      if(width < size[0]) {
        width = size[0];
      }

      if(height < size[1]) {
        height = size[1];
      }
    }

    return width * height;
  }
}
