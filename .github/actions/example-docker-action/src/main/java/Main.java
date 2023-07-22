public class Main {
  public static void main(String[] args) {
    // read inputs
    String var1 = getInput("var1");
    String var2 = getInput("var2");
    String number = getInput("number");
    // print for info
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);
    System.out.println("number = " + number);
    // check if guessed the number
    boolean guessed = "10".equals(number);
    System.out.println("guessed = " + guessed);
    // set action output
    setOutput("guessed-number", String.valueOf(guessed));
    System.out.println("guessed-number=" + guessed);
  }

  private static String getInput(String key) {
    if (key == null) {
      return null;
    }
    return System.getenv("INPUT_" + key.toUpperCase());
  }

  @SuppressWarnings("SameParameterValue")
  private static void setOutput(String key, String value) {
    System.out.printf("%s=%s >> $GITHUB_OUTPUT%n", key, value);
  }
}
