package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem031;

class Application {
  public static void main(String[] args) {
    Problem031 problem = new Problem031();

    StopWatch.start();
    int[] solution = problem.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
