package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem048;

class Application {
  public static void main(String[] args) {
    Problem048 problem = new Problem048();

    StopWatch.start();
    int solution = problem.solution(new int[] {3, 1, 2, 3});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
