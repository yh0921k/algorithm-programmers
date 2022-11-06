package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem001;

class Application {
  public static void main(String[] args) {
    Problem001 problem = new Problem001();

    StopWatch.start();
    String solution = problem.solution("1 2 3 4");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
