package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem046;
import solution.level1.Problem047;

class Application {
  public static void main(String[] args) {
    Problem047 problem = new Problem047();

    StopWatch.start();
    String solution = problem.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
