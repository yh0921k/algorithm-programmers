package solution.level2;

/*
 * 최대값과 최소값
 */
public class Problem001 {
  public String solution(String s) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    String[] split = s.split(" ");
    for (int i = 0; i < split.length; i++) {
      int number = Integer.parseInt(split[i]);
      if (number > max) {
        max = number;
      }
      if (number < min) {
        min = number;
      }
    }
    return String.join(" ", String.valueOf(min), String.valueOf(max));
  }
}
