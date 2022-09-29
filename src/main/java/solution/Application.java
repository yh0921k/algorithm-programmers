package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem024;

class Application {
  public static void main(String[] args) {
    Problem024 problem = new Problem024();

    StopWatch.start();
    String solution = problem.solution("Zbcdefg");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
