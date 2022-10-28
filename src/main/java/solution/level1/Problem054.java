package solution.level1;

/*
 * 옹알이 (2)
 */
public class Problem054 {
  public int solution(String[] babbling) {

    replaceToPossibleWordIndex(babbling);

    int result = 0;
    for(String sentence : babbling) {
      if(isPossibleSentence(sentence)) {
        result++;
      }
    }

    return result;
  }

  private boolean isPossibleSentence(String sentence) {
    int lastDigit = -1;
    for (char letter : sentence.toCharArray()) {
      if (Character.isAlphabetic(letter)) {
        return false;
      }

      int digit = Character.getNumericValue(letter);
      if (digit == lastDigit) {
        return false;
      }
      lastDigit = digit;
    }
    return true;
  }

  private void replaceToPossibleWordIndex(String[] babbling) {
    String[] possibleWord = {"aya", "ye", "woo", "ma"};
    for (int i = 0; i < babbling.length; i++) {
      for (int j = 0; j < possibleWord.length; j++) {
        babbling[i] = babbling[i].replaceAll(possibleWord[j], String.valueOf(j));
      }
    }
  }
}
