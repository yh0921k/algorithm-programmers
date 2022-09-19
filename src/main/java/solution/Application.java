package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem008;

class Application {
  public static void main(String[] args) {
    Problem008 problem008 = new Problem008();

    StopWatch.start();
    boolean solution = problem008.solution(18);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
