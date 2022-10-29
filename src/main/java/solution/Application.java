package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem056;

class Application {
  public static void main(String[] args) {
    Problem056 problem = new Problem056();

    StopWatch.start();
//    int[] solution = problem.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
    int[] solution = problem.solution(5, new int[] {6, 1, 3, 3, 1, 5, 5, 4, 4, 6, 6});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
