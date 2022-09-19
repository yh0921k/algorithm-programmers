package solution;

import solution.level1.Problem006;
import solution.level1.Problem007;

class Application {
  public static void main(String[] args) {
    Problem007 problem007 = new Problem007();
    long start = System.nanoTime();

    System.out.println(problem007.solution(4, 5));

    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Time : " + (double)timeElapsed / 1_000_000);
  }
}
