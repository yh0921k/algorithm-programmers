package solution.level2;

/*
 * JadenCase 문자열 만들기
 */
public class Problem002 {
  public String solution(String s) {
    StringBuilder builder = new StringBuilder();

    boolean isFirstLetter = true;
    for (char letter : s.toCharArray()) {
      if(letter == ' ') {
        isFirstLetter = true;
        builder.append(letter);
      } else if(Character.isDigit(letter)) {
        builder.append(letter);
        isFirstLetter = false;
      } else if(isFirstLetter) {
        isFirstLetter = false;
        builder.append(Character.toUpperCase(letter));
      } else {
        builder.append(Character.toLowerCase(letter));
      }
    }

    return builder.toString();
  }
}
