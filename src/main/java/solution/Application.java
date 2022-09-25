package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem018;

class Application {
  public static void main(String[] args) {
    Problem018 problem = new Problem018();

    StopWatch.start();
    String solution = problem.solution(10000);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
