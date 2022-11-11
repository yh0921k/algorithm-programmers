package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem005;

class Application {
  public static void main(String[] args) {
    Problem005 problem = new Problem005();

    StopWatch.start();
    int[] solution = problem.solution("110010101001");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
