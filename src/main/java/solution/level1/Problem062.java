package solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 성격 유형 검사하기
 */
public class Problem062 {
  public String solution(String[] survey, int[] choices) {
    TypeSets typeSets = new TypeSets();

    for (int i = 0; i < survey.length; i++) {
      typeSets.apply(survey[i], choices[i]);
    }

    return typeSets.calculate();
  }
}

class TypeSets {
  private List<TypeSet> typeSets = new ArrayList<>();
  private static final String[] types = {"RT", "CF", "JM", "AN"};

  public TypeSets() {
    for (int i = 0; i < types.length; i++) {
      typeSets.add(new TypeSet(types[i]));
    }
  }

  public void apply(String survey, int choice) {
    TypeSet typeSet = findBySurveyTypes(survey);
    typeSet.choose(survey, choice);
  }

  private TypeSet findBySurveyTypes(String surveyTypes) {
    return typeSets.stream().filter(typeSet -> typeSet.contains(surveyTypes)).findFirst().get();
  }

  public String calculate() {
    StringBuilder builder = new StringBuilder();
    for (TypeSet typeSet : typeSets) {
      builder.append(typeSet.getHighScore().getTypeAsString());
    }
    return builder.toString();
  }
}

class TypeSet {
  private TypeScore first;
  private TypeScore second;
  private static final int BOUNDARY = 4;

  public TypeSet(String typeSet) {
    this.first = new TypeScore(Type.of(String.valueOf(typeSet.charAt(0))));
    this.second = new TypeScore(Type.of(String.valueOf(typeSet.charAt(1))));
  }

  public boolean contains(String surveyTypes) {
    String first = String.valueOf(surveyTypes.charAt(0));
    String second = String.valueOf(surveyTypes.charAt(1));

    return this.first.equals(first) || this.first.equals(second);
  }

  public void choose(String surveyTypes, int score) {
    int surveyScore = Math.abs(BOUNDARY - score);
    if (score < BOUNDARY) {
      disagree(surveyTypes, surveyScore);
      return;
    }
    agree(surveyTypes, surveyScore);
  }

  private void agree(String surveyTypes, int score) {
    TypeScore typeScore = findByType(String.valueOf(surveyTypes.charAt(1)));
    typeScore.increment(score);
  }

  private void disagree(String surveyTypes, int score) {
    TypeScore typeScore = findByType(String.valueOf(surveyTypes.charAt(0)));
    typeScore.increment(score);
  }

  private TypeScore findByType(String type) {
    if(first.equals(type)) {
      return first;
    }
    return second;
  }

  public TypeScore getHighScore() {
    if(second.getScore() > first.getScore()) {
      return second;
    }
    return first;
  }
}

class TypeScore {
  private Type type;
  private int score;

  public TypeScore(Type type) {
    this.type = type;
    this.score = 0;
  }

  public boolean equals(String type) {
    return this.type.equals(type);
  }

  public void increment(int score) {
    this.score += score;
  }

  public int getScore() {
    return score;
  }

  public String getTypeAsString() {
    return type.getType();
  }
}

enum Type {
  R("R"),
  T("T"),
  C("C"),
  F("F"),
  J("J"),
  M("M"),
  A("A"),
  N("N");

  private String type;

  Type(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public static Type of(String type) {
    return Arrays.stream(Type.values())
        .filter(element -> element.getType().equals(type))
        .findFirst()
        .get();
  }

  public boolean equals(String type) {
    return getType().equals(type);
  }
}
