package solution.level1;

/*
 * 시저 암호
 */
public class Problem033 {
  public String solution(String s, int n) {
    char[] source = s.toCharArray();
    char[] result = new char[source.length];

    for (int i = 0; i < source.length; i++) {
      if (Character.isUpperCase(source[i])) {
        result[i]= (char)(((source[i] - 65 + n) % 26) + 65);
      } else if (Character.isLowerCase(source[i])) {
        result[i] = (char)(((source[i] - 97 + n) % 26) + 97);
      } else {
        result[i] = source[i];
      }
    }
    return new StringBuilder().append(result).toString();
  }
}