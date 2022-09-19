package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem009;

class Application {
  public static void main(String[] args) {
    Problem009 problem009 = new Problem009();

    StopWatch.start();
    boolean solution = problem009.solution("pyapya");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
