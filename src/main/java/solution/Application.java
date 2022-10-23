package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem045;

class Application {
  public static void main(String[] args) {
    Problem045 problem = new Problem045();

    StopWatch.start();
    int solution = problem.solution(new int[] {-2, 3, 0, 2, -5});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
