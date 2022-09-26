package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem022;

class Application {
  public static void main(String[] args) {
    Problem022 problem = new Problem022();

    StopWatch.start();
    int solution = problem.solution(new int[]{1,2,3,4,6,7,8,0});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
