package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem010;

class Application {
  public static void main(String[] args) {
    Problem010 problem010 = new Problem010();

    StopWatch.start();
    int solution = problem010.solution(626331);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
