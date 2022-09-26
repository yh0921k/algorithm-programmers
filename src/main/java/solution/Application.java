package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem021;

class Application {
  public static void main(String[] args) {
    Problem021 problem = new Problem021();

    StopWatch.start();
    String solution = problem.solution("abcde");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
