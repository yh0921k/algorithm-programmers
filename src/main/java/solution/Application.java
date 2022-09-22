package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem013;

class Application {
  public static void main(String[] args) {
    Problem013 problem = new Problem013();

    StopWatch.start();
    long solution = problem.solution(0, 1000000);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
