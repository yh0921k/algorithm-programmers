package solution.level1;

/*
 * 숫자 짝꿍
 */
public class Problem044 {
  public String solution(String X, String Y) {
    int[] numberCountOfX = getNumberCountArrayGivenSource(X);
    int[] numberCountOfY = getNumberCountArrayGivenSource(Y);

    StringBuilder builder = new StringBuilder();
    for(int number = 9; number >= 0; number--) {
      int count = Math.min(numberCountOfX[number], numberCountOfY[number]);
      for(int i = 0; i < count; i++) {
        builder.append(number);
      }
    }

    String result = builder.toString();
    if(result.startsWith("0")) {
      return "0";
    }
    if(result.length() == 0) {
      return "-1";
    }


    return result;
  }

  public int[] getNumberCountArrayGivenSource(String source) {
    int[] numberCountArray = new int[10];
    for (int i = 0; i < source.length(); i++) {
      int number = Character.getNumericValue(source.charAt(i));
      numberCountArray[number]++;
    }

    return numberCountArray;
  }
}
