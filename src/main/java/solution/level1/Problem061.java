package solution.level1;

/*
 * 신규 아이디 추천
 */
public class Problem061 {
  public String solution(String new_id) {
    String result = removeInvalidLetters(new_id);
    result = removeStartingPeriod(result);
    result = removeTrailingPeriod(result);
    result = initializeEmptyCase(result);
    result = reduceSize(result);
    result = incrementMinimumSize(result);

    return result;
  }

  private String incrementMinimumSize(String id) {
    String lastLetter = String.valueOf(id.charAt(id.length() - 1));
    StringBuilder builder = new StringBuilder(id);
    while (builder.length() < 3) {
      builder.append(lastLetter);
    }
    return builder.toString();
  }

  private String reduceSize(String id) {
    if (id.length() > 15) {
      id = id.substring(0, 15);
      id = removeTrailingPeriod(id);
    }
    return id;
  }

  public String removeInvalidLetters(String id) {
    return id.toLowerCase().replaceAll("[^a-z0-9._-]", "").replaceAll("[.]+", ".");
  }

  public String removeStartingPeriod(String id) {
    if (id.startsWith(".")) {
      id = id.substring(1);
    }
    return id;
  }

  public String removeTrailingPeriod(String id) {
    if (id.endsWith(".")) {
      id = id.substring(0, id.length() - 1);
    }
    return id;
  }

  public String initializeEmptyCase(String id) {
    if (id.length() == 0) {
      id = "a";
    }
    return id;
  }
}
