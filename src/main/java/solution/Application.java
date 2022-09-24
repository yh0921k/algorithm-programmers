package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem014;

class Application {
  public static void main(String[] args) {
    Problem014 problem = new Problem014();

    StopWatch.start();
    String solution = problem.solution(new String[]{"Lee", "Kim"});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
