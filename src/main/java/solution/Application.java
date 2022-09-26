package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem023;

class Application {
  public static void main(String[] args) {
    Problem023 problem = new Problem023();

    StopWatch.start();
    int solution = problem.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
