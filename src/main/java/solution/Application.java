package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem051;

class Application {
  public static void main(String[] args) {
    Problem051 problem = new Problem051();

    StopWatch.start();
    int solution = problem.solution(new int[] {1, 2, 7, 6, 4});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
