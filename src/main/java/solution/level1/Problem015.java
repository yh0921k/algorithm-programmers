package solution.level1;

/*
 * 핸드폰 번호 가리기
 */
public class Problem015 {
  public String solution(String phone_number) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < phone_number.length() ; i++) {
      if(phone_number.length() - i > 4) {
        answer.append("*");
        continue;
      }
      answer.append(phone_number.charAt(i));
    }
    return answer.toString();
  }
}
