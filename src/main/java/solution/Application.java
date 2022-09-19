package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem007;

class Application {
  public static void main(String[] args) {
    Problem007 problem007 = new Problem007();

    StopWatch.start();
    long[] solution = problem007.solution(-4, 20);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
