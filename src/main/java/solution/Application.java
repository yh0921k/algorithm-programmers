package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem060;

class Application {
  public static void main(String[] args) {
    Problem060 problem = new Problem060();

    StopWatch.start();
    String solution = problem.solution(new int[] {1, 3, 4, 6});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
