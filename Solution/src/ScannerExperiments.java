import java.util.Scanner;

public class ScannerExperiments {

  public static void main(String[] args) {
    // Create a new Scanner object
    Scanner input = new Scanner(System.in);


    // Print a message asking the user for their name
    System.out.println("Please Enter your name: ");


    // Get the user's input and store it in a variable
    String name = input.nextLine();


    // Print a greeting message that includes the user's name
    System.out.println("Hello "+name);


    // Close the scanner
    input.close();

  }
}