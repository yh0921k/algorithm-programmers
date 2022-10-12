package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem035;

class Application {
  public static void main(String[] args) {
    Problem035 problem = new Problem035();

    StopWatch.start();
    String solution = problem.solution(5, 24);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
