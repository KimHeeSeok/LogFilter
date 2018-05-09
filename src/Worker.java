public class Worker extends Thread {
  private final Process process;
  public int exit = Integer.MIN_VALUE;
  public Worker(Process process) {
    this.process = process;
  }
  public void run() {
    try {
      exit = process.waitFor();
    } catch (InterruptedException ignore) {
      return;
    }
  }
}