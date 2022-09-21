package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem011;

class Application {
  public static void main(String[] args) {
    Problem011 problem011 = new Problem011();

    StopWatch.start();
    long solution = problem011.solution(144);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
