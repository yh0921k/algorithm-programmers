package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem028;

class Application {
  public static void main(String[] args) {
    Problem028 problem = new Problem028();

    StopWatch.start();
    long solution = problem.solution(3, 20, 4);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
