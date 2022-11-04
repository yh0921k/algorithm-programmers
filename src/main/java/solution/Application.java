package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem061;

class Application {
  public static void main(String[] args) {
    Problem061 problem = new Problem061();

    StopWatch.start();
    String solution = problem.solution("...!@BaT#*..y.abcdefghijklm");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
