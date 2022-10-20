package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem038;
import solution.level1.Problem039;

class Application {
  public static void main(String[] args) {
    Problem039 problem = new Problem039();

    StopWatch.start();
    int solution = problem.solution(new int[]{2, 2, 3, 3}, 10);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
