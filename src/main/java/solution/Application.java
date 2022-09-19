package solution;

import solution.level1.Problem006;

class Application {
  public static void main(String[] args) {
    Problem006 problem006 = new Problem006();
    long start = System.nanoTime();

    System.out.println(problem006.solution(4));

    long finish = System.nanoTime();
    long timeElapsed = finish - start;
    System.out.println("Time : " + (double)timeElapsed / 1_000_000);
  }
}
