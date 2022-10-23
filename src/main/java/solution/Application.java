package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem046;

class Application {
  public static void main(String[] args) {
    Problem046 problem = new Problem046();

    StopWatch.start();
    int solution = problem.solution("2three45sixseven");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
