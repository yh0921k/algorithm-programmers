package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem006;

class Application {
  public static void main(String[] args) {
    Problem006 problem = new Problem006();

    StopWatch.start();
    int solution = problem.solution(2);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
