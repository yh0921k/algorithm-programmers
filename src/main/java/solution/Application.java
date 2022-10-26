package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem050;

class Application {
  public static void main(String[] args) {
    Problem050 problem = new Problem050();

    StopWatch.start();
    int[] solution = problem.solution(new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
