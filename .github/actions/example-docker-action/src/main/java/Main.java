/** A class with entry point to start the action logic. */
public class Main {
  /**
   * An entry point to execute the action logic. Using try...catch to print Exception stacktrace (if
   * it happens). The stack trace will be printed in GitHub Actions console (just like in
   * System.out).
   *
   * @param args Console args.
   */
  public static void main(String[] args) {
    Action action = new Action();
    try {
      action.execute();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
