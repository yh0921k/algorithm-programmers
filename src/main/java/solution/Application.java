package solution;

import solution.level1.Problem005;

class Application {
  public static void main(String[] args) {
    Problem005 problem005 = new Problem005();
    long start = System.nanoTime();

    System.out.println(problem005.solution(12345));

    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Time : " + (double)timeElapsed / 1_000_000);
  }
}
