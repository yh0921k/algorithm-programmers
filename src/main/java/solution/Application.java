package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem053;

class Application {
  public static void main(String[] args) {
    Problem053 problem = new Problem053();

    StopWatch.start();
    int solution = problem.solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
