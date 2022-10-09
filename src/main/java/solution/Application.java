package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem032;
import solution.level1.Problem033;

class Application {
  public static void main(String[] args) {
    Problem033 problem = new Problem033();

    StopWatch.start();
    String solution = problem.solution("AB", 1);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
