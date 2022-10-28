package solution;

import commons.PrintUtils;
import commons.StopWatch;
import solution.level1.Problem054;

class Application {
  public static void main(String[] args) {
    Problem054 problem = new Problem054();

    StopWatch.start();
    int solution = problem.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    StopWatch.stop();

    PrintUtils.print(solution);
    StopWatch.toMilliSeconds();
  }
}
