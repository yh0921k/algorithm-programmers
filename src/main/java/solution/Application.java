package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem041;

class Application {
  public static void main(String[] args) {
    Problem041 problem = new Problem041();

    StopWatch.start();
    int solution = problem.solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
