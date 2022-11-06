package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem001;
import solution.level2.Problem002;

class Application {
  public static void main(String[] args) {
    Problem002 problem = new Problem002();

    StopWatch.start();
    String solution = problem.solution("3people unFollowed me");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
