package solution.level1;

/*
 * 문자열 내 p와 y의 개수
 */
public class Problem009 {
  public boolean solution(String s) {
    int numberOfP = 0;
    int numberOfY = 0;

    s = s.toLowerCase();
    char[] array = s.toCharArray();
    for(int i = 0; i < array.length; i++) {
      if(array[i] == 'y') {
        numberOfY++;
      }
      if(array[i] == 'p') {
        numberOfP++;
      }
    }

    return numberOfY == numberOfP;
  }
}