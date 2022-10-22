package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem043;

class Application {
  public static void main(String[] args) {
    Problem043 problem = new Problem043();

    StopWatch.start();
    int solution = problem.solution(3, 1, 20);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
