package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem030;

class Application {
  public static void main(String[] args) {
    Problem030 problem = new Problem030();

    StopWatch.start();
    int[] solution = problem.solution(3, 12);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
