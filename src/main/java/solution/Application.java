package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem038;

class Application {
  public static void main(String[] args) {
    Problem038 problem = new Problem038();

    StopWatch.start();
    int solution = problem.solution(100000000);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
