package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem037;

class Application {
  public static void main(String[] args) {
    Problem037 problem = new Problem037();

    StopWatch.start();
    int[] solution =
        problem.solution(
            new String[] {"muzi", "frodo"},
            new String[] {"muzi frodo", "muzi frodo", "muzi frodo", "frodo muzi"},
            1);
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
