package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem004;

class Application {
  public static void main(String[] args) {
    Problem004 problem = new Problem004();

    StopWatch.start();
    boolean solution = problem.solution("(())()");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
