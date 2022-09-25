package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem017;

class Application {
  public static void main(String[] args) {
    Problem017 problem = new Problem017();

    StopWatch.start();
    int solution = problem.solution("-123");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
