package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem043;
import solution.level1.Problem044;

class Application {
  public static void main(String[] args) {
    Problem044 problem = new Problem044();

    StopWatch.start();
    String solution = problem.solution("100", "203045");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
