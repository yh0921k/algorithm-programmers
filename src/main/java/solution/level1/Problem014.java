package solution.level1;

/*
 * 서울에서 김서방 찾기
 */
public class Problem014 {
  public String solution(String[] seoul) {
    // Solution 1
    int position = -1;
    for (int i = 0; i < seoul.length; i++) {
      if(seoul[i].equals("Kim")) {
        position = i;
        break;
      }
    }

    return String.format("김서방은 %d에 있다", position);

    // Solution 02
    // return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
  }
}
