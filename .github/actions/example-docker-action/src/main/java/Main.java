import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws IOException {
    // read inputs
    String var1 = getInput("var1");
    String var2 = getInput("var2");
    String number = getInput("number");
    // print for info
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);
    System.out.println("number = " + number);
    System.out.println("GITHUB_OUTPUT = " + System.getenv("GITHUB_OUTPU"));
    // check if guessed the number
    boolean guessed = "10".equals(number);
    System.out.println("guessed = " + guessed);
    // set action output
    setOutput("guessed-number", String.valueOf(guessed));
  }

  private static String getInput(String key) {
    if (key == null) {
      return null;
    }
    return System.getenv("INPUT_" + key.toUpperCase());
  }

  @SuppressWarnings("SameParameterValue")
  private static void setOutput(String key, String value) throws IOException {
    Path outputPath = Paths.get(System.getenv("GITHUB_OUTPUT"));
    Files.writeString(
        outputPath, "%s=%s%s".formatted(key, value, System.lineSeparator()), WRITE, APPEND);
  }
}
