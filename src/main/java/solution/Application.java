package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem009;

class Application {
  public static void main(String[] args) {
    Problem009 problem = new Problem009();

    StopWatch.start();
    int[] solution = problem.solution(10, 2);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
