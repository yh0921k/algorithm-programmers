package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem034;

class Application {
  public static void main(String[] args) {
    Problem034 problem = new Problem034();

    StopWatch.start();
    String[] solution = problem.solution(new String[]{"sun", "bed", "car"},	1);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
