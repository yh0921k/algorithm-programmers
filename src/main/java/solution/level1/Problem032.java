package solution.level1;

/*
 * 이상한 문자 만들기
 */
public class Problem032 {
  public String solution(String s) {
    if(s.endsWith(" ")) {
      s = s + "EOF";
    }

    StringBuilder builder = new StringBuilder();
    String[] splitArray = s.split(" ");

    for (int i = 0; i < splitArray.length; i++) {
      String source = splitArray[i];
      if(source.equals("EOF")) {
        break;
      }

      char[] sourceArray = source.toCharArray();
      String upperCase = source.toUpperCase();
      String lowerCase = source.toLowerCase();

      for (int j = 0; j < source.length(); j++) {
        sourceArray[j] = (j & 1) == 1 ? lowerCase.charAt(j) : upperCase.charAt(j);
      }
      builder.append(sourceArray);

      if(i < splitArray.length - 1) {
        builder.append(" ");
      }
    }
    return builder.toString();
  }
}