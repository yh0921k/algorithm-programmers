package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem059;

class Application {
  public static void main(String[] args) {
    Problem059 problem = new Problem059();

    StopWatch.start();
    int solution =
        problem.solution(
            new int[][] {
              {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}
            },
            new int[] {1, 5, 3, 5, 1, 2, 1, 4});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
