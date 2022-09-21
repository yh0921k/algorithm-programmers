package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem012;

class Application {
  public static void main(String[] args) {
    Problem012 problem = new Problem012();

    StopWatch.start();
    long solution = problem.solution(1442121);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
