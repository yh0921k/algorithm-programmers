package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem008;

class Application {
  public static void main(String[] args) {
    Problem008 problem = new Problem008();

    StopWatch.start();
    int solution = problem.solution(78);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
