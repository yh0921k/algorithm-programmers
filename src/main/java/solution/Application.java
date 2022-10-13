package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem036;

class Application {
  public static void main(String[] args) {
    Problem036 problem = new Problem036();

    StopWatch.start();
    int solution = problem.solution(5);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
