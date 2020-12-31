package pl.blaj;

public final class Timer {

  private static long startTime;
  private static long endTime;

  public static void start() {
    startTime = System.currentTimeMillis();
  }

  public static void end() {
    endTime = System.currentTimeMillis();
  }

  public static void printElapsedTime() {
    var elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "s");
  }

}
