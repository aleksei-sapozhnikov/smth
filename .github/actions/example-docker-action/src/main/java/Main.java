public class Main {
  public static void main(String[] args) {
    // printing values
    System.out.println("VAR1 = " + System.getenv("VAR1"));
    System.out.println("VAR2 = " + System.getenv("VAR2"));
    // simple logic with number input
    String strNumber = System.getenv("NUMBER");
    System.out.println("NUMBER = " + strNumber);
    boolean guessed = "10".equals(strNumber);
    System.out.println("guessed = " + guessed);
    // output
    System.out.println("guessed-number=" + guessed);
  }
}
