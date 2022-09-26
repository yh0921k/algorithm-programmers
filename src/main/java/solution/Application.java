package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem020;

class Application {
  public static void main(String[] args) {
    Problem020 problem = new Problem020();

    StopWatch.start();
    int[] solution = problem.solution(new int[]{5, 9, 7, 10}, 5);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
