package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem039;
import solution.level1.Problem040;

class Application {
  public static void main(String[] args) {
    Problem040 problem = new Problem040();

    StopWatch.start();
    int[] solution =
        problem.solution(
            new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
