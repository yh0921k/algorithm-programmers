package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem025;

class Application {
  public static void main(String[] args) {
    Problem025 problem = new Problem025();

    StopWatch.start();
    boolean solution = problem.solution("a234");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
