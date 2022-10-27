package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem052;

class Application {
  public static void main(String[] args) {
    Problem052 problem = new Problem052();

    StopWatch.start();
    int[] solution =
        problem.solution(new int[] {7, 8, 9, 10, 11, 12}, new int[] {1, 2, 3, 4, 5, 6});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
