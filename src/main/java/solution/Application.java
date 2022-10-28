package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem055;

class Application {
  public static void main(String[] args) {
    Problem055 problem = new Problem055();

    StopWatch.start();
    String[] solution =
        problem.solution(6, new int[] {46, 33, 33, 22, 31, 50}, new int[] {27, 56, 19, 14, 14, 10});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
