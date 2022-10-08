package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem032;

class Application {
  public static void main(String[] args) {
    Problem032 problem = new Problem032();

    StopWatch.start();
    String solution = problem.solution("abc   ");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
