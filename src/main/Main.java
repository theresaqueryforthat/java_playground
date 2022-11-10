public class Main {
  public static void main(String[] args) {
    // System is a built-in class which contains members
    // Text must be wrapped in double quotes
    // Or an error occurs:
    // System.out.println(This causes an error);
    System.out.println("");
    System.out.println("");
    System.out.println("Hello World!");

    // The print() method will not insert a new line
    // at the end of the output
    System.out.print("No space needed. ");
    System.out.print("I can continue printing text to the same line. ");
    System.out.println("");
    System.out.println("");

    // Numbers do not need to be wrapped in double quotes
    System.out.println("Numbers do not need to be wrapped in double quotes when printing");
    System.out.println(777777);
    System.out.println("");

    // Math can also be completed while printing an output
    System.out.println("Results of math operations can be completed while printing");
    System.out.println("7 * 7 = ");
    System.out.println(7*7);
    System.out.println("////////////////////////////////////////////");
    System.out.println("");
    System.out.println("");

    // type variableName = value
    // String name = "Ben";
    // System.out.println(name);

    // Casting int to double automatically adds the decimal point
    // int ourInt = 10;
    // double ourDouble = ourInt;

    // System.out.println(ourInt);     // Outputs 9
    // System.out.println(ourDouble);  // Outputs 9.0

    // Other arithmetic operations are included such as incrementing or decrementing
    // int ourIntPlusOne = ++ourInt;
    // double ourDoublePlusOne = ++ourDouble;

    // System.out.println(ourIntPlusOne);
    // System.out.println(ourDoublePlusOne);

    // Create a new string object which includes methods
    String greeting = "Hello, here is the stored text: ";
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String desiredChar = "Z";

    // Display the greeting and stored text simultaneously
    System.out.println(greeting + txt);
    
    // Show the length of the string 'txt'
    System.out.println("The length of the text is: " + txt.length());

    // Find a character in the string
    System.out.println("The index of the requested character, " + desiredChar + ", is: " + txt.indexOf(desiredChar));

    // End
    System.out.println("");
    System.out.println("");
    System.out.println("Operations completed successfully.");
    System.out.println("");
    System.out.println("");
  }
}