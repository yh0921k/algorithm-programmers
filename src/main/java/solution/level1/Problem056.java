package solution.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 실패율
 */
public class Problem056 {
  public int[] solution(int N, int[] stages) {
    List<Stage> stageList = new ArrayList<>();
    for (int i = 1; i <= N + 1; i++) {
      stageList.add(new Stage(i));
    }

    for (int stage : stages) {
      stageList.get(stage - 1).incrementChallenger();
    }
    stageList.remove(N);

    int currentStageUser = stages.length;
    for (Stage stage : stageList) {
      stage.setTotalUser(currentStageUser);
      currentStageUser -= stage.getChallenger();
    }

    Collections.sort(
        stageList,
        (stage1, stage2) -> Double.compare(stage2.getFailureRate(), stage1.getFailureRate()));
    int[] result = new int[N];
    for (int i = 0; i < N; i++) {
      result[i] = stageList.get(i).getStage();
    }
    return result;
  }
}

class Stage {
  private int stage;
  private int challenger;
  private int totalUser;

  public Stage(int stage) {
    this.stage = stage;
    challenger = 0;
    totalUser = 0;
  }

  public void incrementChallenger() {
    this.challenger++;
  }

  public int getChallenger() {
    return challenger;
  }

  public int getStage() {
    return stage;
  }

  public void setTotalUser(int totalUser) {
    this.totalUser = totalUser;
  }

  public double getFailureRate() {
    if (totalUser == 0) {
      return 0.0;
    }
    return (double) challenger / totalUser;
  }
}
