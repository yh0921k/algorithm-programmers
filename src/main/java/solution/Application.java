package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem007;

class Application {
  public static void main(String[] args) {
    Problem007 problem = new Problem007();

    StopWatch.start();
    int solution = problem.solution(5);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
