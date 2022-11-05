package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem062;

class Application {
  public static void main(String[] args) {
    Problem062 problem = new Problem062();

    StopWatch.start();
    String solution =
        problem.solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
