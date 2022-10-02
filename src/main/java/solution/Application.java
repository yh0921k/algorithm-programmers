package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem026;

class Application {
  public static void main(String[] args) {
    Problem026 problem = new Problem026();

    StopWatch.start();
    int solution = problem.solution(13, 17);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
