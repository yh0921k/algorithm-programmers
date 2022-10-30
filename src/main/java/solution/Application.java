package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem056;
import solution.level1.Problem057;

class Application {
  public static void main(String[] args) {
    Problem057 problem = new Problem057();

    StopWatch.start();
    int solution = problem.solution("1S2D*3T");
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
