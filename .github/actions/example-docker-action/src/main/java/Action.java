import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Contains custom action logic. It was not necessary to make a separate class, everything could be
 * {@link Main}. I just wanted to show that it is possible to make whatever we want things as in
 * usual Java program.
 */
public class Action {

  /** Executes the action. */
  public void execute() {
    printActionDescription();
    printSomeInputVariables();
    boolean guessed = getGuessNumberResult();
    String guessedOutput = String.valueOf(guessed);
    setActionOutput("guessed-number", guessedOutput);
    setActionOutput("another-output", "another-output-value");
  }

  /** Prints detailed action description. */
  private static void printActionDescription() {
    String description =
        String.join(
            System.lineSeparator(),
            "",
            "",
            "------------------------------------------------",
            "------------   ACTION DESCRIPTION   ------------",
            "------------------------------------------------",
            "",
            "This a sample Docker custom action which utilizes logic written on Java",
            "It uses Docker to get needed (Java/Gradle) environment to build and execute the logic",
            "---",
            "The action shows how to get and print some inputs to console",
            "Also, it performs a simple 'guess number' game with input number showing how to use it here",
            "The result is printed as action output, to transfer it to the requester job/step",
            "---");
    System.out.println(description);
  }

  /** Simply prints some inputs (we don't need them) */
  private static void printSomeInputVariables() {
    String var1 = getActionInput("var1");
    String var2 = getActionInput("var2");
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);
  }

  /**
   * Gets number as an input and return if it's the one we needed
   *
   * @return true if guessed, false otherwise.
   */
  private static boolean getGuessNumberResult() {
    String number = getActionInput("number");
    boolean guessed = "10".equals(number);
    System.out.println("number = " + number);
    System.out.println("guessed = " + guessed);
    return guessed;
  }

  /**
   * Gets value of input variables which were defined in action.yml
   *
   * @param inputKey The name of the input in action.yml.
   * @return Value of the input.
   */
  private static String getActionInput(String inputKey) {
    if (inputKey == null) {
      return null;
    }
    return System.getenv("INPUT_" + inputKey.toUpperCase());
  }

  /**
   * Writes action output value.
   *
   * @param outputKey This key will be used to get the value in the caller action
   * @param value Value to set.
   */
  private static void setActionOutput(String outputKey, String value) {
    Path outputPath = Paths.get(System.getenv("GITHUB_OUTPUT"));
    try {
      Files.writeString(
          outputPath, "%s=%s%s".formatted(outputKey, value, System.lineSeparator()), WRITE, APPEND);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
