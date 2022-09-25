package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem015;

class Application {
  public static void main(String[] args) {
    Problem015 problem = new Problem015();

    StopWatch.start();
    String solution = problem.solution("01031934705");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
