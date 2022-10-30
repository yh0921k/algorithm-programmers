package solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 다트게임
 */
public class Problem057 {
  public int solution(String dartResult) {
    DartScores scores = new DartScores();
    Pattern pattern = Pattern.compile("([0-9]+)([SDT])([#*]?)");
    Matcher matcher = pattern.matcher(dartResult);

    while (matcher.find()) {
      scores.add(
          new DartScore(
              Integer.parseInt(matcher.group(1)),
              DartBonus.of(matcher.group(2)),
              DartOption.of(matcher.group(3))));
    }
    return scores.totalScore();
  }
}

class DartScores {
  private final List<DartScore> dartScores;

  public DartScores() {
    this.dartScores = new ArrayList<>();
  }

  public void add(DartScore dartScore) {
    dartScores.add(dartScore);
  }

  public int totalScore() {
    int[] scores = new int[dartScores.size()];

    for (int i = 0; i < dartScores.size(); i++) {
      DartScore score = dartScores.get(i);
      scores[i] = score.calculate();
      multiply(scores, i);
      inverse(scores, i);
    }
    return Arrays.stream(scores).sum();
  }

  private void multiply(int[] scores, int position) {
    DartScore score = dartScores.get(position);
    if (score.isDouble()) {
      multiplyCurrentScore(scores, position, score.getOptionValue());
      multiplyPreviousScore(scores, position - 1, score.getOptionValue());
    }
  }

  private void multiplyCurrentScore(int[] scores, int position, int number) {
    scores[position] = scores[position] * number;
  }

  private void multiplyPreviousScore(int[] scores, int position, int number) {
    if (position >= 0) {
      scores[position] = scores[position] * number;
    }
  }

  private void inverse(int[] scores, int position) {
    DartScore score = dartScores.get(position);
    if (score.isInverse()) {
      multiplyCurrentScore(scores, position, score.getOptionValue());
    }
  }
}

class DartScore {
  private final int score;
  private final DartBonus bonus;
  private final DartOption option;

  public DartScore(int score, DartBonus bonus, DartOption option) {
    this.score = score;
    this.bonus = bonus;
    this.option = option;
  }

  public int calculate() {
    return (int) Math.pow(score, bonus.getPower());
  }

  public int getOptionValue() {
    return option.getMultiply();
  }

  public boolean isDouble() {
    return option == DartOption.DOUBLE;
  }

  public boolean isInverse() {
    return option == DartOption.INVERSE;
  }
}

enum DartBonus {
  SINGLE("S", 1),
  DOUBLE("D", 2),
  TRIPLE("T", 3);

  private final String sign;
  private final int power;

  DartBonus(String sign, int power) {
    this.sign = sign;
    this.power = power;
  }

  public String getSign() {
    return sign;
  }

  public int getPower() {
    return power;
  }

  public static DartBonus of(String sign) {
    DartBonus[] dartBonuses = DartBonus.values();
    return Arrays.stream(dartBonuses)
        .filter(option -> option.getSign().equals(sign))
        .findFirst()
        .get();
  }
}

enum DartOption {
  DOUBLE("*", 2),
  INVERSE("#", -1),
  EMPTY("", 1);

  private final String sign;
  private final int multiply;

  DartOption(String sign, int multiply) {
    this.sign = sign;
    this.multiply = multiply;
  }

  public String getSign() {
    return sign;
  }

  public int getMultiply() {
    return multiply;
  }

  public static DartOption of(String sign) {
    DartOption[] dartOptions = DartOption.values();
    return Arrays.stream(dartOptions)
        .filter(option -> option.getSign().equals(sign))
        .findFirst()
        .orElse(DartOption.EMPTY);
  }
}
