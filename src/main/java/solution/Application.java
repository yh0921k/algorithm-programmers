package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem003;

class Application {
  public static void main(String[] args) {
    Problem003 problem = new Problem003();

    StopWatch.start();
    int solution = problem.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
