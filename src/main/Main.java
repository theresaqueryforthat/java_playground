public class Main {
  public static void main(String[] args) {
    // System is a built-in class which contains members
    System.out.println("Hello World!");
    // Text must be wrapped in double quotes
    // Or an error occurs:
    // System.out.println(This causes an error);

    // The print() method will not insert a new line
    // at the end of the output
    System.out.print("No space needed. ");
    System.out.print("I can continue printing text to the same line. ");

    // Numbers do not need to be wrapped in double quotes
    System.out.println(777777);

    // Math can also be completed while printing an output
    System.out.println("7 * 7 = ");
    System.out.println(7*7);

    // type variableName = value
    String name = "Ben";
    System.out.println(name);

    // Casting int to double which automatically adds the decimal point
    int ourInt = 10;
    double ourDouble = ourInt;

    System.out.println(ourInt);     // Outputs 9
    System.out.println(ourDouble);  // Outputs 9.0

    // Other arithmetic operations are included such as incrementing or decrementing
    int ourIntPlusOne = ++ourInt;
    double ourDoublePlusOne = ++ourDouble;

    System.out.println(ourIntPlusOne);
    System.out.println(ourDoublePlusOne);
  }
}