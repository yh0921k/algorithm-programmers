package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem027;

class Application {
  public static void main(String[] args) {
    Problem027 problem = new Problem027();

    StopWatch.start();
    int[][] solution = problem.solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
