package commons;

public class StopWatch {
  private static long startTime;
  private static long endTime;
  private static long timeElapsed;

  public static void start() {
    startTime = System.nanoTime();
  }

  public static void stop() {
    endTime = System.nanoTime();
    timeElapsed = endTime - startTime;
  }

  public static void toMilliSeconds() {
    double milliSeconds = (double)timeElapsed / 1_000_000;
    System.out.printf("Time(MilliSeconds) : %.3fms\n", milliSeconds);
  }

  public static void toSeconds() {
    double milliSeconds = (double)timeElapsed / 1_000_000_000;
    System.out.printf("Time(MilliSeconds) : %.3fms\n", milliSeconds);
  }
}
