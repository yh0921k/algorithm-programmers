package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem042;

class Application {
  public static void main(String[] args) {
    Problem042 problem = new Problem042();

    StopWatch.start();
    int[] solution = problem.solution(new int[] {2, 1, 3, 4, 1});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
