package commons;

public class Converter {
  public static Integer[] stringToIntegerArray(String s) {
    Integer[] digits = new Integer[s.length()];
    for (int i = 0; i < s.length(); i++) {
      digits[i] = s.charAt(i) - '0';
    }

    return digits;
  }

  public static String intArrayToString(int[] digits) {
    StringBuilder builder = new StringBuilder();
    for (int digit : digits) {
      builder.append(digit);
    }

    return builder.toString();
  }
}