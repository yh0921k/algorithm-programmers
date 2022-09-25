package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem016;

class Application {
  public static void main(String[] args) {
    Problem016 problem = new Problem016();

    StopWatch.start();
    int[] solution = problem.solution(new int[]{1, 2, 3});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
