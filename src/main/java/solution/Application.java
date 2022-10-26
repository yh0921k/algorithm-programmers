package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem049;

class Application {
  public static void main(String[] args) {
    Problem049 problem = new Problem049();

    StopWatch.start();
    int solution = problem.solution(5, new int[] {1, 2, 4}, new int[] {1, 3});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
