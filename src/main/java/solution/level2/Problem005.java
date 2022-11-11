package solution.level2;

/*
 * 이진 변환 반복하기
 */
public class Problem005 {
  public int[] solution(String s) {
    int iterCount = 0;
    int zeroCount = 0;

    while (!s.equals("1")) {
      StringBuilder builder = new StringBuilder();
      zeroCount += removeZero(s, builder);
      s = toBinaryByLength(builder.toString());
      iterCount++;
    }

    return new int[] {iterCount, zeroCount};
  }

  private String toBinaryByLength(String source) {
    int length = source.length();

    StringBuilder builder = new StringBuilder();
    while(length > 0) {
      builder.append(length % 2);
      length /= 2;
    }
    return builder.toString();
  }

  public int removeZero(String source, StringBuilder builder) {
    int zeroCount = 0;
    for (char letter : source.toCharArray()) {
      if (letter == '0') {
        zeroCount++;
        continue;
      }
      builder.append(letter);
    }
    return zeroCount;
  }
}
