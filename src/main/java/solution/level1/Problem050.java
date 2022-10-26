package solution.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 모의고사
 */
public class Problem050 {
  public int[] solution(int[] answers) {
    int[] pattern1 = {1, 2, 3, 4, 5};
    int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] score = new int[3];

    for (int i = 0; i < answers.length; i++) {
      if(answers[i] == pattern1[i % pattern1.length]) {
        score[0]++;
      }
      if(answers[i] == pattern2[i % pattern2.length]) {
        score[1]++;
      }
      if(answers[i] == pattern3[i % pattern3.length]) {
        score[2]++;
      }
    }

    int highest = Arrays.stream(score).max().getAsInt();
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < score.length; i++) {
      if(score[i] == highest) {
        result.add(i + 1);
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}
