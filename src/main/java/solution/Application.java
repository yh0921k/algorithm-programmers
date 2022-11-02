package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem058;

class Application {
  public static void main(String[] args) {
    Problem058 problem = new Problem058();

    StopWatch.start();
    String solution = problem.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},	"right");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
