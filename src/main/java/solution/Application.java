package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem019;

class Application {
  public static void main(String[] args) {
    Problem019 problem = new Problem019();

    StopWatch.start();
    int solution = problem.solution(new int[] {4, 7, 12}, new boolean[] {true, false, true});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
