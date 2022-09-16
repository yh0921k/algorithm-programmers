package solution;

import solution.level1.Problem004;

import java.util.concurrent.TimeUnit;

class Application {
  public static void main(String[] args) {
    Problem004 problem004 = new Problem004();
    long start = System.nanoTime();
    for(int i = 2; i < 1000; i++) {
      System.out.println(i + " : " + problem004.solution(i));
    }
    long finish = System.nanoTime();
    long timeElapsed = finish - start;
//    System.out.println("Time : " + TimeUnit.MILLISECONDS.toSeconds(timeElapsed));
    System.out.println("Time : " + (double)timeElapsed / 1_000_000);

    // 12 -> 2 2 3 -> 11
    // 14 -> 2 7 -> 13
    // 18 -> 2 3 3 -> 17
    // 20 -> 2 2 5 -> 19
  }
}
