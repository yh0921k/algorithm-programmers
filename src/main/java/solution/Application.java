package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level2.Problem010;

class Application {
  public static void main(String[] args) {
    Problem010 problem = new Problem010();

    StopWatch.start();
    int solution = problem.solution("baabaa");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
